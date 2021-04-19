package com.bovoyage.project.model;

import java.time.LocalDateTime;

/**
 * 
 */
public class Hebergement extends Prestation {

  /**
   * Default constructor
   */
  public Hebergement(LocalDateTime dateDepart, LocalDateTime dateArrivee, double prixHT) {
	  super(dateDepart, dateArrivee, prixHT);
  }

}