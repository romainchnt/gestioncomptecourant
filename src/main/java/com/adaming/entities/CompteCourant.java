package com.adaming.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Compte Courant")
public class CompteCourant extends Compte {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5831447091779375652L;
	
	private double decouvert;

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
