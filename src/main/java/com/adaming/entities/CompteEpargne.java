package com.adaming.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Compte épargne")
public class CompteEpargne extends Compte {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6041893880808961119L;

	private double taux;

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
