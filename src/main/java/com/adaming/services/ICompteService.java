package com.adaming.services;

import java.util.List;
import java.util.Optional;

import com.adaming.entities.Compte;
import com.adaming.entities.CompteCourant;
import com.adaming.entities.CompteEpargne;
import com.adaming.entities.Utilisateur;

public interface ICompteService {
	
	List<Compte> findAll();
	List<CompteCourant> findAllCompteCourant();
	List<CompteEpargne> findAllCompteEpargne();
	
	List<Compte> findCompteByUtilisateur(Utilisateur utilisateur);
	
	Optional<Compte> findOne(Long id);
	
	CompteCourant save(CompteCourant compte);
	CompteEpargne save(CompteEpargne compte);
	
	void delete(Long id);

}
