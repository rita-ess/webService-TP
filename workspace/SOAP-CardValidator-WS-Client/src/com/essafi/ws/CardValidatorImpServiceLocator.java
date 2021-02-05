/**
 * CardValidatorImpServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.essafi.ws;

public class CardValidatorImpServiceLocator extends org.apache.axis.client.Service implements com.essafi.ws.CardValidatorImpService {

    public CardValidatorImpServiceLocator() {
    }


    public CardValidatorImpServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CardValidatorImpServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CardValidatorImpPort
    private java.lang.String CardValidatorImpPort_address = "http://localhost:8080/CardValidatorImpService/CardValidatorImp";

    public java.lang.String getCardValidatorImpPortAddress() {
        return CardValidatorImpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CardValidatorImpPortWSDDServiceName = "CardValidatorImpPort";

    public java.lang.String getCardValidatorImpPortWSDDServiceName() {
        return CardValidatorImpPortWSDDServiceName;
    }

    public void setCardValidatorImpPortWSDDServiceName(java.lang.String name) {
        CardValidatorImpPortWSDDServiceName = name;
    }

    public com.essafi.ws.CardValidatorImp getCardValidatorImpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CardValidatorImpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCardValidatorImpPort(endpoint);
    }

    public com.essafi.ws.CardValidatorImp getCardValidatorImpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.essafi.ws.CardValidatorImpPortBindingStub _stub = new com.essafi.ws.CardValidatorImpPortBindingStub(portAddress, this);
            _stub.setPortName(getCardValidatorImpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCardValidatorImpPortEndpointAddress(java.lang.String address) {
        CardValidatorImpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.essafi.ws.CardValidatorImp.class.isAssignableFrom(serviceEndpointInterface)) {
                com.essafi.ws.CardValidatorImpPortBindingStub _stub = new com.essafi.ws.CardValidatorImpPortBindingStub(new java.net.URL(CardValidatorImpPort_address), this);
                _stub.setPortName(getCardValidatorImpPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CardValidatorImpPort".equals(inputPortName)) {
            return getCardValidatorImpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.essafi.com/", "CardValidatorImpService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.essafi.com/", "CardValidatorImpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CardValidatorImpPort".equals(portName)) {
            setCardValidatorImpPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
