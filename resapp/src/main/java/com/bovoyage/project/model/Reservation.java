package com.bovoyage.project.model;

import java.util.*;

/**
 * 
 */
public class Reservation {

  private long numReservation;
  private static long compteur = 0;
  private double prix;
  private Set<Voyageur> voyageurs;
  private Etat etatReservation;
  private Client client;
  private Voyage voyage;
  private Assurance assurance;
  private boolean isAssure;
  
  /**
   * Default constructor
   */

  public Reservation(Client client, Set<Voyageur> voyageurs, Voyage voyage, boolean isAssure) {
	this.setNumReservation(++compteur);
	this.setEtat(Etat.enAttente);
	this.voyageurs = voyageurs;
	this.client = client;
	this.voyage = voyage;
	this.isAssure = isAssure;
	if (isAssure) this.assurance = new AssuranceAnnulation();
	this.setPrix();
}

public Client getClient() {
	return client;
}


public void setClient(Client client) {
	this.client = client;
}


/**
   * @param voyageur
   */
  public void add(Voyageur voyageur) {
    this.voyageurs.add(voyageur);
  }

  /**
   * @param voyageur
   */
  public void remove(Voyageur voyageur) {
    // TODO implement here
	  this.voyageurs.remove(voyageur);
  }

  /**
   * @param etatReservation
   */
  public void setEtat(Etat etatReservation) {
	  this.etatReservation = etatReservation;
  }
  
  public Etat getEtat() {
	  return this.etatReservation;
  }

  /**
   * @return
   */
  public double getPrix() {
    // TODO implement here
    return this.prix;
  }
  
  public void setPrix() {
	  this.prix = this.voyage.getPrix() * this.voyageurs.size();
	  if (this.isAssure) this.prix += this.assurance.getPrix();
  }


public long getNumReservation() {
	return numReservation;
}


public void setNumReservation(long numReservation) {
	this.numReservation = numReservation;
}


}