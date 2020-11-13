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

import com.adaming.entities.Utilisateur;
import com.adaming.services.IUtilisateurService;

@RestController
public class UtilisateurController {

	@Autowired
	private IUtilisateurService utilisateurService;

	@GetMapping(value = "users/")
	public List<Utilisateur> findAll() {
		return utilisateurService.findAll();
	}

	@GetMapping(value = "users/{id}")
	public Optional<Utilisateur> findOne(@PathVariable(name = "id") Long id) {
		return utilisateurService.findOne(id);
	}

	@PostMapping(value = "users/")
	public Utilisateur save(@RequestBody Utilisateur utilisateur) {
		return utilisateurService.save(utilisateur);
	}

	@DeleteMapping(value = "users/{id}")
	public void delete(@PathVariable(name = "id") Long id) {
		utilisateurService.delete(id);
	}

}
