package com.adaming.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Compte;
import com.adaming.entities.CompteCourant;
import com.adaming.entities.CompteEpargne;
import com.adaming.entities.Utilisateur;
import com.adaming.services.ICompteService;

@RestController
public class CompteController {

	@Autowired
	private ICompteService compteService;

	@GetMapping(value = "comptes")
	public List<Compte> findAll() {
		return compteService.findAll();
	}

	@GetMapping(value = "comptesCourants")
	public List<CompteCourant> findAllCompteCourant() {
		return compteService.findAllCompteCourant();
	}

	@GetMapping(value = "comptesEpargnes")
	public List<CompteEpargne> findAllCompteEpargne() {
		return compteService.findAllCompteEpargne();
	}

	@GetMapping(value = "comptes/{utilisateur}")
	public List<Compte> findAllCompteByUtilisateur(@PathVariable(name = "utilisateur") Utilisateur utilisateur) {
		return compteService.findCompteByUtilisateur(utilisateur);
	}

	@GetMapping(value = "comptes/{id}")
	public Optional<Compte> findOne(@PathVariable(name = "id") Long id) {
		return compteService.findOne(id);
	}

	@PostMapping(value = "comptesCourants")
	public CompteCourant save(@RequestBody CompteCourant compte) {
		return compteService.save(compte);
	}

	@PostMapping(value = "comptesEpargnes")
	public CompteEpargne save(@RequestBody CompteEpargne compte) {
		return compteService.save(compte);
	}

	@DeleteMapping(value = "comptes/{id}")
	public void delete(@PathVariable(name = "id") Long id) {
		compteService.delete(id);
	}

}
