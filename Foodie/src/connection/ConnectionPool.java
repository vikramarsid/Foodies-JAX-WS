package connection;

import java.sql.*;
import java.util.*;
//import java.sql.ResultSet;
import java.sql.SQLException;


//Reference: http://stackoverflow.com/questions/1448974/connection-pooling-with-java-and-mysql-in-tomcat-web-application

public class ConnectionPool implements Runnable {
	int initialallowableConnections = 100;
  private String SQLdriver, SQLurl, SQLusername, SQLpassword;   
  private Vector<Connection> connectionsAvailable, connectionsBusy;
  
  
  private boolean waitIncaseBusy;
  
  static private ConnectionPool instance_pool;
  //int connectionCallCount = 0;  
  private int maxallowableConnections;
  
  private boolean pendingConnection = false;

  private ConnectionPool(){
    this.SQLdriver = "com.mysql.jdbc.Driver";
    this.waitIncaseBusy = true;
    this.SQLusername = "root";
    this.SQLpassword = "Password12";
    this.SQLurl = "jdbc:mysql://localhost:3306/foodiesdb";
    this.maxallowableConnections = 1000;
    if (initialallowableConnections > maxallowableConnections) {
    	initialallowableConnections = maxallowableConnections;
    }
    connectionsAvailable = new Vector<Connection>(initialallowableConnections);
    connectionsBusy = new Vector<Connection>();
    for(int i=0; i<initialallowableConnections; i++) {
      try {
    	  connectionsAvailable.addElement(createNewConnection());
	} catch (SQLException e) {
		e.printStackTrace();
	}
    }
    
  }
  
  public synchronized Connection getConnection()throws SQLException {
	  System.out.println("getConnection is called");		  
	    if (!connectionsAvailable.isEmpty()) {
	      Connection connection_existing = (Connection)connectionsAvailable.lastElement();
	      int Index_Last = connectionsAvailable.size() - 1;
	      connectionsAvailable.removeElementAt(Index_Last);
	      if (connection_existing.isClosed()) {
	        notifyAll(); 
	        return(getConnection());
	      } else {
	    	  connectionsBusy.addElement(connection_existing);
	        return(connection_existing);
	      }
	    } else {	      
	      if ((Connections_total() < maxallowableConnections) && !pendingConnection) {
	        createBackgroundConnection();
	      } else if (!waitIncaseBusy) {
	        throw new SQLException("Sorry Connection limit has reached");
	      }
	     try {
	        wait();
	      } catch(InterruptedException ie) {}
	      
	      return(getConnection());
	    }
	  }
  
  public synchronized int Connections_total() {
	    return(connectionsAvailable.size() + connectionsBusy.size());
  }
  
  static public ConnectionPool getInstance(){
	  if (instance_pool == null){
		  instance_pool = new ConnectionPool();
	  }
	  return instance_pool;
  }
  
  
  private Connection createNewConnection() throws SQLException {
	    try {
	      Class.forName(SQLdriver);	      
	      Connection newConnection = DriverManager.getConnection(SQLurl, SQLusername, SQLpassword);
	      return(newConnection);
	    } catch(ClassNotFoundException cnfe) {
	    	throw new SQLException("sorry..Could't find class for driver: " + SQLdriver);
	    }
	  }

  public void run() {
    try {
      Connection connection = createNewConnection();
      synchronized(this) {
    	  connectionsAvailable.addElement(connection);
    	  pendingConnection = false;
        notifyAll();
      }
    } catch(Exception e) { 
     
    }
  }

  public synchronized void free(Connection connection) {
	 System.out.println("Connectionpool is Free now");
	 connectionsBusy.removeElement(connection);
    connectionsAvailable.addElement(connection);
    notifyAll(); 
  }
  public synchronized void allConnections_Close() {
    connections_Close(connectionsAvailable);
    connectionsAvailable = new Vector<Connection>();
    connections_Close(connectionsBusy);
    connectionsBusy = new Vector<Connection>();
  }

  private void connections_Close(Vector<Connection> connections) {
    try {
      for(int i=0; i<connections.size(); i++) {
        Connection connection =
          (Connection)connections.elementAt(i);
        if (!connection.isClosed()) {
          connection.close();
        }
      }
    } catch(SQLException se) {
      
    }
  }

  private void createBackgroundConnection() {
	  pendingConnection = true;
    try {
      Thread connectNewThread = new Thread(this);
      connectNewThread.start();
    } catch(OutOfMemoryError oome) {
      
    }
  }
  
}

