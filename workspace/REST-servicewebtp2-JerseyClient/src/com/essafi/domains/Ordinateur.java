package com.essafi.domains;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ordinateur {
	private Long id;
	private String marque;
	private float prix;

	public Ordinateur() {
	}

	public Ordinateur(Long id, String marque, float prix) {
		this.id = id;
		this.marque = marque;
		this.prix = prix;
	}
	// getters & setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	// equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ordinateur other = (Ordinateur) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (marque == null) {
			if (other.marque != null)
				return false;
		} else if (!marque.equals(other.marque))
			return false;
		if (Float.floatToIntBits(prix) != Float.floatToIntBits(other.prix))
			return false;
		return true;
	}

	// toString
	@Override
	public String toString() {
		return "Ordinateur [id=" + id + ", marque=" + marque + ", prix=" + prix + "]";
	}

}
