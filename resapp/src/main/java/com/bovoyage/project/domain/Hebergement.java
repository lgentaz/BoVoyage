package com.bovoyage.project.domain;

import java.time.LocalDateTime;

public class Hebergement extends Prestation {

  public Hebergement(LocalDateTime dateDepart, LocalDateTime dateArrivee, double prixHT) {
	  super(dateDepart, dateArrivee, prixHT);
  }

}