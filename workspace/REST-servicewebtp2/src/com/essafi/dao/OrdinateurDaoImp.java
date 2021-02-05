package com.essafi.dao;

import java.util.ArrayList;
import java.util.List;

import com.essafi.domains.Ordinateur;

public class OrdinateurDaoImp implements OrdinateurDao {

	private static List<Ordinateur> list = new ArrayList<Ordinateur>();
	private static long id = 1;

	@Override
	public Ordinateur get(Long id) {
		return list.stream()
				  .filter(o -> id.equals(o.getId()))
				  .findFirst()
				  .orElse(null);
	}

	@Override
	public boolean store(Ordinateur ordinateur) {
		if (ordinateur != null) {
			ordinateur.setId(id);
			list.add(ordinateur);
			id++;
			return true;
		}
		return false;
	}

	@Override
	public List<Ordinateur> all() {
		return list;
	}

}
