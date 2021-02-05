package com.essafi.ws;

public class PhoneValidatorImpProxy implements com.essafi.ws.PhoneValidatorImp {
  private String _endpoint = null;
  private com.essafi.ws.PhoneValidatorImp phoneValidatorImp = null;
  
  public PhoneValidatorImpProxy() {
    _initPhoneValidatorImpProxy();
  }
  
  public PhoneValidatorImpProxy(String endpoint) {
    _endpoint = endpoint;
    _initPhoneValidatorImpProxy();
  }
  
  private void _initPhoneValidatorImpProxy() {
    try {
      phoneValidatorImp = (new com.essafi.ws.PhoneValidatorImpServiceLocator()).getPhoneValidatorImpPort();
      if (phoneValidatorImp != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)phoneValidatorImp)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)phoneValidatorImp)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (phoneValidatorImp != null)
      ((javax.xml.rpc.Stub)phoneValidatorImp)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.essafi.ws.PhoneValidatorImp getPhoneValidatorImp() {
    if (phoneValidatorImp == null)
      _initPhoneValidatorImpProxy();
    return phoneValidatorImp;
  }
  
  public boolean validate(java.lang.String arg0) throws java.rmi.RemoteException{
    if (phoneValidatorImp == null)
      _initPhoneValidatorImpProxy();
    return phoneValidatorImp.validate(arg0);
  }
  
  
}