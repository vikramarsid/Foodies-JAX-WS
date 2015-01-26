package connection;

public class ServiceProxy implements connection.Service {
  private String _endpoint = null;
  private connection.Service service = null;
  
  public ServiceProxy() {
    _initServiceProxy();
  }
  
  public ServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiceProxy();
  }
  
  private void _initServiceProxy() {
    try {
      service = (new connection.ServiceServiceLocator()).getService();
      if (service != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)service)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (service != null)
      ((javax.xml.rpc.Stub)service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public connection.Service getService() {
    if (service == null)
      _initServiceProxy();
    return service;
  }
  
  public java.lang.String[] getData(java.lang.String sqlquery) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.getData(sqlquery);
  }
  
  public boolean updateCategory(java.lang.String firstName, java.lang.String lastName) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.updateCategory(firstName, lastName);
  }
  
  public boolean createCategory(java.lang.String catName) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.createCategory(catName);
  }
  
  public boolean deleteCategory(java.lang.String delName) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.deleteCategory(delName);
  }
  
  public users.User signin(java.lang.String emailId, java.lang.String pwd) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.signin(emailId, pwd);
  }
  
  public java.lang.String signUp(int userid, java.lang.String fname, java.lang.String lname, java.lang.String email, java.lang.String passd, java.lang.String dob, java.lang.String gender) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.signUp(userid, fname, lname, email, passd, dob, gender);
  }
  
  public users.Item[] displayItem(java.lang.String category) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.displayItem(category);
  }
  
  public java.lang.String insertFormData(java.lang.String type, int id, java.lang.String aname, java.lang.String aaddress, java.lang.String areview, java.lang.String arating, java.lang.String acity) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.insertFormData(type, id, aname, aaddress, areview, arating, acity);
  }
  
  public users.Search[] searchstring(java.lang.String searchname, java.lang.String city) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.searchstring(searchname, city);
  }
  
  
}