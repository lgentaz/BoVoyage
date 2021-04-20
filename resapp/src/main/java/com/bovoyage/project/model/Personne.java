package com.bovoyage.project.model;

/**
 * 
 */
public abstract class Personne {
		
	private Civilite civilite;
	private String nom;
	private String prenom;
	private String email;

	public enum Civilite {
		Mr,
		Mme,
		Mlle
	}
	
	public Personne(Civilite civilite, String nom, String prenom, String email) {
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}
	
	public Civilite getCivilite() {
		return civilite;
	}
	
	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

}