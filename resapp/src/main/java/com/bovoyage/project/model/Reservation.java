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
  
  private Scanner sc = new Scanner(System.in);
  /**
   * 
   */
  public enum Etat {
	  enAttente,
	  enCours, 
	  refusee,
	  acceptee;
  }
  /**
   * Default constructor
   */

  public Reservation(long numReservation, double prix, Set<Voyageur> voyageurs, Etat etatReservation, Client client,
		Voyage voyage, Assurance assurance) {
	this.setNumReservation(++compteur);
	this.setEtatReservation(Etat.enAttente);
	this.voyageurs = voyageurs;
	this.client = client;
	this.voyage = voyage;
	this.assurance = assurance;
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
	  this.setEtatReservation(etatReservation);
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
	  this.prix = this.voyage.getPrix() * this.voyageurs.size() + this.assurance.getPrix();
  }


public long getNumReservation() {
	return numReservation;
}


public void setNumReservation(long numReservation) {
	this.numReservation = numReservation;
}


public Etat getEtatReservation() {
	return etatReservation;
}


public void setEtatReservation(Etat etatReservation) {
	this.etatReservation = etatReservation;
}

public void reserver(Client c) {
	boolean isUser = false;
	String user;
	String password; 
	while(!isUser) {
		System.out.println("login:");
		user = sc.nextLine();
		System.out.println("password:");
		password = sc.nextLine();
		isUser = c.authentification(user, password);
	}
}

}