package com.essafi.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.essafi.entities.CreditCard;


@Stateless
public class CreditCardDao {

	// Injection du manager, qui s'occupe de la connexion avec la BDD
	@PersistenceContext(unitName = "db_context")
	private EntityManager em;

	public List<CreditCard> all() {
		return em.createQuery("select cc from CreditCard cc", CreditCard.class).getResultList();
	}

	public CreditCard select(long id) {
		return em.find(CreditCard.class, id);
	}

	public void create(CreditCard card) {
		em.persist(card);
	}

	public CreditCard update(long id, CreditCard card) {
		card.setId(id);
		return em.merge(card);
	}

	public void delete(long id) {
		CreditCard c = select(id);
		em.remove(c);
	}
}
