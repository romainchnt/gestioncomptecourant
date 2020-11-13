package com.adaming.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utilisateur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6385281118208399517L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUtilisateur;

	private String nomutilisateur;

	private String prenomUtilisateur;

	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getNomutilisateur() {
		return nomutilisateur;
	}

	public void setNomutilisateur(String nomutilisateur) {
		this.nomutilisateur = nomutilisateur;
	}

	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}

	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
