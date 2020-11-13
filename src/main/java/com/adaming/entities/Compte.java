package com.adaming.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_COMPTE", discriminatorType = DiscriminatorType.STRING)
public abstract class Compte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7428127371421175804L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCompte;

	private Date dateCreation;

	private double solde;

	@ManyToOne
	@JoinColumn(name = "idUtilisateur")
	private Utilisateur utilisateur;

	public Long getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(Long idCompte) {
		this.idCompte = idCompte;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
