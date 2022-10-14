package com.esprit.microservice.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Fournisseur implements Serializable{
	private static final long serialVersionUID = 6;

	@Id
	@GeneratedValue
	private int IdFournisseur;
	private String Nom, Prenom, Email;
	
	public int getIdFournisseur() {
		return IdFournisseur;
	}
	public void setIdFournisseur(int idFournisseur) {
		IdFournisseur = idFournisseur;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	public Fournisseur() {
		super();
	}
	
	public Fournisseur(String Nom) {
		super();
		this.Nom=Nom;
	}
	
	
	
}
