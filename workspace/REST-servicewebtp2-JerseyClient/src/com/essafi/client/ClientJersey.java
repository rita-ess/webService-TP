package com.essafi.client;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.essafi.domains.Ordinateur;

public class ClientJersey {
	private static final String REST_URI = "http://localhost:8080/REST-servicewebtp2/api/ordinateurs";

	private Client client = ClientBuilder.newClient();

	public ClientJersey() {

		Response create = createJsonOrdinateur(new Ordinateur(null, "dfdf", 400));
		System.out.println(create.getStatus());

		System.out.println(getJsonOrdinateurs());

		System.out.println(getJsonOrdinateur(1));

	}

	public List<Ordinateur> getJsonOrdinateurs() {
		return client.target(REST_URI).request(MediaType.APPLICATION_JSON).get(ArrayList.class);
	}

	public Ordinateur getJsonOrdinateur(int id) {
		return client.target(REST_URI).path(String.valueOf(id)).request(MediaType.APPLICATION_JSON)
				.get(Ordinateur.class);
	}

	public Response createJsonOrdinateur(Ordinateur ordinateur) {
		return client.target(REST_URI).request(MediaType.APPLICATION_JSON)
				.post(Entity.entity(ordinateur, MediaType.APPLICATION_JSON));
	}

	public static void main(String[] args) {
		new ClientJersey();

	}

}
