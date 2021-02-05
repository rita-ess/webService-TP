package com.essafi.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.essafi.dao.OrdinateurDao;
import com.essafi.dao.OrdinateurDaoImp;
import com.essafi.domains.Ordinateur;

@Path("/ordinateurs")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class OrdinateurResource {

	private OrdinateurDao dao = new OrdinateurDaoImp();

	@GET
	public List<Ordinateur> getAll() {
		return dao.all();
	}

	@GET
	@Path("{id}")
	public Ordinateur getById(@PathParam("id") Long id) {
		return dao.get(id);
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public boolean store(Ordinateur ordinateur) {
		return dao.store(ordinateur);
	}

}
