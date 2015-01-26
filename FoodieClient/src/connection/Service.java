/**
 * Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package connection;

public interface Service extends java.rmi.Remote {
    public java.lang.String[] getData(java.lang.String sqlquery) throws java.rmi.RemoteException;
    public boolean updateCategory(java.lang.String firstName, java.lang.String lastName) throws java.rmi.RemoteException;
    public boolean createCategory(java.lang.String catName) throws java.rmi.RemoteException;
    public boolean deleteCategory(java.lang.String delName) throws java.rmi.RemoteException;
    public users.User signin(java.lang.String emailId, java.lang.String pwd) throws java.rmi.RemoteException;
    public java.lang.String signUp(int userid, java.lang.String fname, java.lang.String lname, java.lang.String email, java.lang.String passd, java.lang.String dob, java.lang.String gender) throws java.rmi.RemoteException;
    public users.Item[] displayItem(java.lang.String category) throws java.rmi.RemoteException;
    public java.lang.String insertFormData(java.lang.String type, int id, java.lang.String aname, java.lang.String aaddress, java.lang.String areview, java.lang.String arating, java.lang.String acity) throws java.rmi.RemoteException;
    public users.Search[] searchstring(java.lang.String searchname, java.lang.String city) throws java.rmi.RemoteException;
}
