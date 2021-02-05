package com.essafi.resources;

import java.util.Arrays;
import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.essafi.dao.CreditCardDao;
import com.essafi.entities.CreditCard;

@Path("/credit-card")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class CreditCardResource {

	@EJB
	private CreditCardDao dao;
	
	@GET
	public List<CreditCard> getById() {
		return dao.all();
	}
	
	@GET
	@Path("{id}")
	public CreditCard getById(@PathParam("id") Long id) {
		return dao.select(id);
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public boolean store(CreditCard creditCard) {
		dao.create(creditCard);
		return true;
	}

	@PUT
	@Path("{id}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public CreditCard update(@PathParam("id") Long id, CreditCard creditCard) {
		return dao.update(id, creditCard);
	}

	@DELETE
	@Path("{id}")
	public String delete(@PathParam("id") Long id) {
		dao.delete(id);
		return "deleted";
	}

}
