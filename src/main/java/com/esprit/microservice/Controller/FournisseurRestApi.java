package com.esprit.microservice.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import com.esprit.microservice.Service.FournisseurService;
import com.esprit.microservice.Entity.Fournisseur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
public class FournisseurRestApi {
	private String title="Hello , i'm the fournisseur Microservice";
	
	@Autowired
	private FournisseurService fournisseurService;
	
	@RequestMapping("/hello")
	public String sayHello(){
	System.out.println(title);
	return title;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Fournisseur> createFournisseur(@RequestBody Fournisseur fournisseur){
		return new ResponseEntity<>(fournisseurService.addFournisseur(fournisseur), HttpStatus.OK);
	}
	@PutMapping(value = {"/{id}"}, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Fournisseur>updateFournisseur(@PathVariable(value = "id") int id,
														@RequestBody Fournisseur fournisseur){
	return new ResponseEntity<>(fournisseurService.updateFournisseur(id, fournisseur),HttpStatus.OK);
	}
	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteFournisseur(@PathVariable(value = "id") int id){
		return new ResponseEntity<>(fournisseurService.deleteFournisseur(id), HttpStatus.OK);
	}
	
	
	

}
