package com.esprit.microservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.microservice.Entity.Fournisseur;
import com.esprit.microservice.Repository.FournisseurRepository;

@Service
public class FournisseurService {
	
	@Autowired
	private FournisseurRepository fournisseurRepository;
	
	public Fournisseur addFournisseur(Fournisseur fournisseur) {
		return fournisseurRepository.save(fournisseur);
	}
	public Fournisseur updateFournisseur(int id, Fournisseur newFournisseur) {
		if(fournisseurRepository.findById(id).isPresent()) {
			Fournisseur existingFournisseur = fournisseurRepository.findById(id).get();
			existingFournisseur.setNom(newFournisseur.getNom());
			existingFournisseur.setPrenom(newFournisseur.getPrenom());
			existingFournisseur.setEmail(newFournisseur.getEmail());
		
			return fournisseurRepository.save(existingFournisseur);
		}else
			return null;
	}
	public String deleteFournisseur(int id) {
		if (fournisseurRepository.findById(id).isPresent()) {
			fournisseurRepository.deleteById(id);
			return " Fournisseur Supprimé ";
		}else 
			return "candidat non supprimé";
	}

	public Iterable<Fournisseur> getAllFournisseur(){
		return fournisseurRepository.findAll();
	}

	public Fournisseur getFournisseurById(int id) {
		if(fournisseurRepository.findById(id).isPresent()) {
			return fournisseurRepository.findById(id).get();
		}else
			return null;
	}
	

}
