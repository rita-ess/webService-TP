package com.essafi.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.RemoteException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.essafi.ws.CardValidatorImpProxy;
import com.essafi.ws.CreditCard;

/**
 * Servlet implementation class ClientCV
 */
@WebServlet("/ClientCV")
public class ClientCV extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientCV() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     CardValidatorImpProxy impProxy = new CardValidatorImpProxy();
	 	try {
     		CreditCard card = new CreditCard();
     		card.setNumber("12345678912345df");
     		boolean validate = impProxy.validate(card);
			System.out.println(validate);
			PrintWriter printWriter = response.getWriter();
			 printWriter.append("The result of the test is : " + validate);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
