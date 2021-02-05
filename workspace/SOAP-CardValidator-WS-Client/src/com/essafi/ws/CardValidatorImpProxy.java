package com.essafi.ws;

public class CardValidatorImpProxy implements com.essafi.ws.CardValidatorImp {
  private String _endpoint = null;
  private com.essafi.ws.CardValidatorImp cardValidatorImp = null;
  
  public CardValidatorImpProxy() {
    _initCardValidatorImpProxy();
  }
  
  public CardValidatorImpProxy(String endpoint) {
    _endpoint = endpoint;
    _initCardValidatorImpProxy();
  }
  
  private void _initCardValidatorImpProxy() {
    try {
      cardValidatorImp = (new com.essafi.ws.CardValidatorImpServiceLocator()).getCardValidatorImpPort();
      if (cardValidatorImp != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cardValidatorImp)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cardValidatorImp)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cardValidatorImp != null)
      ((javax.xml.rpc.Stub)cardValidatorImp)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.essafi.ws.CardValidatorImp getCardValidatorImp() {
    if (cardValidatorImp == null)
      _initCardValidatorImpProxy();
    return cardValidatorImp;
  }
  
  public boolean validate(com.essafi.ws.CreditCard arg0) throws java.rmi.RemoteException{
    if (cardValidatorImp == null)
      _initCardValidatorImpProxy();
    return cardValidatorImp.validate(arg0);
  }
  
  
}