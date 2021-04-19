package com.bovoyage.project.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * 
 */
public class Hotel extends Prestation {

  private String nom;
  private int nbEtoile;
  private Adresse adresse;
  private ArrayList<Chambre> chambres;
	
  public Hotel(LocalDateTime dateDepart, LocalDateTime dateArrivee, double prixHT, String nom, int nbEtoile, Adresse adresse) {
		super(dateDepart, dateArrivee, prixHT);
		this.setNom(nom);
		this.setNbEtoile(nbEtoile);
		this.setAdresse(adresse);
	}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public int getNbEtoile() {
	return nbEtoile;
}

public void setNbEtoile(int nbEtoile) {
	this.nbEtoile = nbEtoile;
}

public Adresse getAdresse() {
	return adresse;
}

public void setAdresse(Adresse adresse) {
	this.adresse = adresse;
}

public ArrayList<Chambre> getChambres() {
	return chambres;
}

public void setChambre(Chambre chambre) {
	this.chambres.add(chambre);
}

}