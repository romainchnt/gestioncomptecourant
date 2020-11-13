package com.adaming.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Compte;
import com.adaming.entities.CompteCourant;
import com.adaming.entities.CompteEpargne;
import com.adaming.entities.Utilisateur;
import com.adaming.repositories.CompteCourantRepository;
import com.adaming.repositories.CompteEpargneRepository;
import com.adaming.repositories.CompteRepository;

@Service
public class CompteService implements ICompteService {

	@Autowired
	private CompteRepository compteRepository;
	@Autowired
	private CompteCourantRepository compteCourantRepository;
	@Autowired
	private CompteEpargneRepository compteEpargneRepository;
	
	@Override
	public List<Compte> findAll() {
		return compteRepository.findAll();
	}

	@Override
	public List<CompteCourant> findAllCompteCourant() {
		return compteCourantRepository.findAll();
	}

	@Override
	public List<CompteEpargne> findAllCompteEpargne() {
		return compteEpargneRepository.findAll();
	}

	@Override
	public Optional<Compte> findOne(Long id) {
		return compteRepository.findById(id);
	}

	@Override
	public CompteCourant save(CompteCourant compte) {
		return compteCourantRepository.save(compte);
	}

	@Override
	public CompteEpargne save(CompteEpargne compte) {
		return compteEpargneRepository.save(compte);
	}

	@Override
	public void delete(Long id) {
		compteRepository.deleteById(id);
	}

	@Override
	public List<Compte> findCompteByUtilisateur(Utilisateur utilisateur) {
		return compteRepository.findCompteByUtilisateur(utilisateur);
	}

}
