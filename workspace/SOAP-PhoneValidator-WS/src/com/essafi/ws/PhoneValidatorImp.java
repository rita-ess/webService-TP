package com.essafi.ws;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class PhoneValidatorImp implements PhoneValidator {

	@WebMethod
	public boolean validate(@WebParam(name = "phone") String phone) {
		String numb = phone.substring(1);
		if(!phone.isEmpty() && numb.length() == 12 && phone.startsWith("+") && onlyDigits(numb)) {
			return true;
		}
		
		
		return false;
	}
	
	
	
	private boolean  onlyDigits(String str) 
	    { 
	        // Regex to check string 
	        // contains only digits 
	        String regex = "[0-9]+"; 
	  
	        // Compile the ReGex 
	        Pattern p = Pattern.compile(regex); 
	  
	        // If the string is empty 
	        // return false 
	        if (str == null) { 
	            return false; 
	        } 
	  
	        // Find match between given string 
	        // and regular expression 
	        // using Pattern.matcher() 
	        Matcher m = p.matcher(str); 
	  
	        // Return if the string 
	        // matched the ReGex 
	        return m.matches(); 
	    }

}
