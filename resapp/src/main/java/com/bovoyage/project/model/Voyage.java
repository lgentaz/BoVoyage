package com.bovoyage.project.model;

import java.util.ArrayList;

/**
 * 
 */
public class Voyage {
	
	 private long numeroVoyage;
	 private static long compteur = 0;
	 private boolean dispoStatus;
	 private double prix;
	 private Formule formule;
	 private Destination destination;
	 public ArrayList<Reservation> reservations;
	  

  /**
   * Default constructor
   */
  public Voyage(double prix, Formule formule, Destination destination) {
	  this.dispoStatus = true;
	  this.prix = prix;
	  this.setFormule(formule);
	  this.setDestination(destination);
	  this.setNumeroVoyage(++compteur);
  }

  /**
   * @return
   */
  public double getPrix() {
    // TODO implement here
    return this.prix;
  }

  /**
   * @return
   */
  public boolean getStatus() {
    // TODO implement here
    return dispoStatus;
  }

  /**
   * @param dispoStatus
 * @return 
   */
  public void changeStatus() {
    // TODO implement here
	  this.dispoStatus = !this.dispoStatus;
  }

public Formule getFormule() {
	return formule;
}

public void setFormule(Formule formule) {
	this.formule = formule;
}

public Destination getDestination() {
	return destination;
}

public void setDestination(Destination destination) {
	this.destination = destination;
}

public long getNumeroVoyage() {
	return numeroVoyage;
}

public void setNumeroVoyage(long numeroVoyage) {
	this.numeroVoyage = numeroVoyage;
}

  /**
   * 
   */
  

}