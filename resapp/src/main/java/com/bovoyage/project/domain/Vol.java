package com.bovoyage.project.domain;

import java.time.LocalDateTime;

/**
 * 
 */
public class Vol extends Prestation {
	
	  private String aeroport;
	  private String compagnie;

  /**
   * Default constructor
   */
  public Vol(LocalDateTime dateDepart, LocalDateTime dateArrivee, double prixHT, String compagnie, String aeroport) {
	  super(dateDepart, dateArrivee, prixHT);
	  this.setCompagnie(compagnie);
	  this.setAeroport(aeroport);
  }

public String getAeroport() {
	return aeroport;
}

public void setAeroport(String aeroport) {
	this.aeroport = aeroport;
}

public String getCompagnie() {
	return compagnie;
}

public void setCompagnie(String compagnie) {
	this.compagnie = compagnie;
}


}