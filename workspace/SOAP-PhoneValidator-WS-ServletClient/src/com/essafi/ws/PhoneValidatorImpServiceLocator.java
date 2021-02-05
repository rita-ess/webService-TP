/**
 * PhoneValidatorImpServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.essafi.ws;

public class PhoneValidatorImpServiceLocator extends org.apache.axis.client.Service implements com.essafi.ws.PhoneValidatorImpService {

    public PhoneValidatorImpServiceLocator() {
    }


    public PhoneValidatorImpServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PhoneValidatorImpServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PhoneValidatorImpPort
    private java.lang.String PhoneValidatorImpPort_address = "http://localhost:8080/SOAP-PhoneValidator-WS/PhoneValidatorImpService";

    public java.lang.String getPhoneValidatorImpPortAddress() {
        return PhoneValidatorImpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PhoneValidatorImpPortWSDDServiceName = "PhoneValidatorImpPort";

    public java.lang.String getPhoneValidatorImpPortWSDDServiceName() {
        return PhoneValidatorImpPortWSDDServiceName;
    }

    public void setPhoneValidatorImpPortWSDDServiceName(java.lang.String name) {
        PhoneValidatorImpPortWSDDServiceName = name;
    }

    public com.essafi.ws.PhoneValidatorImp getPhoneValidatorImpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PhoneValidatorImpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPhoneValidatorImpPort(endpoint);
    }

    public com.essafi.ws.PhoneValidatorImp getPhoneValidatorImpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.essafi.ws.PhoneValidatorImpPortBindingStub _stub = new com.essafi.ws.PhoneValidatorImpPortBindingStub(portAddress, this);
            _stub.setPortName(getPhoneValidatorImpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPhoneValidatorImpPortEndpointAddress(java.lang.String address) {
        PhoneValidatorImpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.essafi.ws.PhoneValidatorImp.class.isAssignableFrom(serviceEndpointInterface)) {
                com.essafi.ws.PhoneValidatorImpPortBindingStub _stub = new com.essafi.ws.PhoneValidatorImpPortBindingStub(new java.net.URL(PhoneValidatorImpPort_address), this);
                _stub.setPortName(getPhoneValidatorImpPortWSDDServiceName());
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
        if ("PhoneValidatorImpPort".equals(inputPortName)) {
            return getPhoneValidatorImpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.essafi.com/", "PhoneValidatorImpService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.essafi.com/", "PhoneValidatorImpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PhoneValidatorImpPort".equals(portName)) {
            setPhoneValidatorImpPortEndpointAddress(address);
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
