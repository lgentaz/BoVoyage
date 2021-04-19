package com.bovoyage.project.model;

import java.time.LocalDateTime;

/**
 * 
 */
public class CB extends MoyenPaiement {
	
  private String nbCB;
  private LocalDateTime dateExpiration;

  /**
   * Default constructor
   */
  public CB(String nbCB, LocalDateTime dateExpiration) {
	  this.nbCB = nbCB;
	  this.dateExpiration = dateExpiration;
  }

public LocalDateTime getDateExpiration() {
	return dateExpiration;
}

public void setDateExpiration(LocalDateTime dateExpiration) {
	this.dateExpiration = dateExpiration;
}

public String getNbCB() {
	return nbCB;
}

public void setNbCB(String nbCB) {
	this.nbCB = nbCB;
}

}