package com.adaming.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adaming.entities.Utilisateur;
import com.adaming.repositories.UtilisateurRepository;

@Service
public class UtilisateurService implements IUtilisateurService {
	
	private UtilisateurRepository utilisateurRepository;

	@Override
	public List<Utilisateur> findAll() {
		return utilisateurRepository.findAll();
	}

	@Override
	public Optional<Utilisateur> findOne(Long id) {
		return utilisateurRepository.findById(id);
	}

	@Override
	public Utilisateur save(Utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur);
	}

	@Override
	public void delete(Long id) {
		utilisateurRepository.deleteById(id);
	}

}
