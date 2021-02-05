package com.essafi.ws;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.essafi.entities.CreditCard;

@WebService
@Stateless
public class CardValidatorImp implements CardValidator{

	public CardValidatorImp() {
		
	} 
	
	@Override
	@WebMethod
	public boolean validate(@WebParam(name = "card")CreditCard card) {
		String number = card.getNumber();
	    char last = number.charAt(number.length() - 1);
	    int i = Character.getNumericValue(last);
		if(!number.isEmpty() && number.length() == 16 && onlyDigits(number) && isImpair(i)) {
			return true;
		}
		return false;
	}

	
	private boolean isImpair(int nbr) {
		if (nbr % 2 == 0)
		      return false;
		    else
		      return true;
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
	
	@PostConstruct
	void beginValidation() {
		System.out.println("beginValidation");
	}
	
	@PreDestroy
    void endValidation() {
		System.out.println("endValidation");
	}
}
