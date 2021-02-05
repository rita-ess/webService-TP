package com.essafi.client;

import java.rmi.RemoteException;

import com.essafi.ws.PhoneValidatorImpProxy;

public class PhoneValidatorClient {
	
	
	public PhoneValidatorClient() {
	    PhoneValidatorImpProxy  impProxy = new PhoneValidatorImpProxy();
	    try {
			System.out.println(impProxy.validate("+34f6123456"));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	public static void main(String[] args) {
	  new PhoneValidatorClient();	
	}

}
