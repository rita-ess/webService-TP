package com.essafi.dao;

import java.util.List;

import com.essafi.domains.Ordinateur;

public interface OrdinateurDao {

	List<Ordinateur> all();

	Ordinateur get(Long id);

	boolean store(Ordinateur ordinateur);

}
