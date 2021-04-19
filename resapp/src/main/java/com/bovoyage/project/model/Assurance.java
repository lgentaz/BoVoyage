package com.bovoyage.project.model;

/**
 * 
 */
public class Assurance {

	private double prix;
	private Contrat contrat;
	private Reservation reservation;

  /**
   * Default constructor
   */
  public Assurance(double prix, Contrat contrat, Reservation reservation) {
	  this.prix = prix;
	  this.setContrat(contrat);
	  this.setReservation(reservation);
  }

  /**
   * @return
   */
  public double getPrix() {
    return this.prix;
  }

  public Contrat getContrat() {
	return contrat;
  }

  public void setContrat(Contrat contrat) {
	this.contrat = contrat;
  }

  public Reservation getReservation() {
	return reservation;
  }

  public void setReservation(Reservation reservation) {
	this.reservation = reservation;
  }
  
}