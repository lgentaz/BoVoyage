package com.bovoyage.project.model;

import java.time.LocalDateTime;
/**
 * 
 */
public class Prestation {

	private LocalDateTime dateDepart;
	private LocalDateTime dateArrivee;
	private double prixHT;

  /**
   * Default constructor
   */
  public Prestation(LocalDateTime dateDepart, LocalDateTime dateArrivee, double prixHT) {
	  this.setDateDepart(dateDepart);
	  this.setDateArrivee(dateArrivee);
	  this.setPrixHT(prixHT);
  }

	public LocalDateTime getDateDepart() {
		return dateDepart;
	}
	
	public void setDateDepart(LocalDateTime dateDepart) {
		this.dateDepart = dateDepart;
	}
	
	public LocalDateTime getDateArrivee() {
		return dateArrivee;
	}
	
	public void setDateArrivee(LocalDateTime dateArrivee) {
		this.dateArrivee = dateArrivee;
	}
	
	public double getPrixHT() {
		return prixHT;
	}
	
	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}

}