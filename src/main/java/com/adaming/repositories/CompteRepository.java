package com.adaming.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.entities.Compte;
import com.adaming.entities.Utilisateur;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
	
	public List<Compte> findCompteByUtilisateur(Utilisateur utilisateur);

}
