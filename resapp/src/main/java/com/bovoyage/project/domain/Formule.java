package com.bovoyage.project.domain;

import java.util.ArrayList;

/**
 * 
 */
public class Formule {
	
  private double prix;
  private ArrayList<Prestation> prestations;

  /**
   * Default constructor
   */
  public Formule(double prix) {
	  this.prix = prix;
  }

  /**
   * @return
   */
  public double getPrix() {
    // TODO implement here
    return this.prix;
  }
  
  public void addPrestation(Prestation prestation) {
	  this.prestations.add(prestation);
  }

public ArrayList<Prestation> getPrestations() {
	return prestations;
}

public void setPrestations(ArrayList<Prestation> prestations) {
	this.prestations = prestations;
}

  
}