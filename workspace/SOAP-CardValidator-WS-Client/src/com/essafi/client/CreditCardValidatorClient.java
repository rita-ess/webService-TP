package com.essafi.client;

import java.rmi.RemoteException;

import com.essafi.ws.CardValidatorImpProxy;
import com.essafi.ws.CreditCard;

public class CreditCardValidatorClient {

	
	public CreditCardValidatorClient() {
	     	CardValidatorImpProxy impProxy = new CardValidatorImpProxy();
	     	try {
	     		CreditCard card = new CreditCard();
	     		card.setNumber("1234567891234523");
				System.out.println(impProxy.validate(card));
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	public static void main(String[] args) {
            new CreditCardValidatorClient();
	}

}
