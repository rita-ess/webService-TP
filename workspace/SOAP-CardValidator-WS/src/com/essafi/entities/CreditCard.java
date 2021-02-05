package com.essafi.entities;

public class CreditCard {

	String number;
	String expiryDate;
	int controlNumber;
	String type;
	
	public CreditCard() {
	
	}
	
	public CreditCard(String number, String expiryDate, int controlNumber, String type) {
		super();
		this.number = number;
		this.expiryDate = expiryDate;
		this.controlNumber = controlNumber;
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getControlNumber() {
		return controlNumber;
	}

	public void setControlNumber(int controlNumber) {
		this.controlNumber = controlNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "CreditCard [number=" + number + ", expiryDate=" + expiryDate + ", controlNumber=" + controlNumber
				+ ", type=" + type + "]";
	}
}
