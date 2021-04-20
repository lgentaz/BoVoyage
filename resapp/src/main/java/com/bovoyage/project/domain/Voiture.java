package com.bovoyage.project.domain;

import java.time.LocalDateTime;

/**
 * 
 */
public class Voiture extends Prestation {

  private String classe;
  private String compagnie;

/**
* Default constructor
*/
public Voiture(LocalDateTime dateDepart, LocalDateTime dateArrivee, double prixHT, String compagnie, String classe) {
  super(dateDepart, dateArrivee, prixHT);
  this.setCompagnie(compagnie);
  this.setClasse(classe);
}

public String getClasse() {
	return classe;
}

public void setClasse(String classe) {
	this.classe = classe;
}

public String getCompagnie() {
	return compagnie;
}

public void setCompagnie(String compagnie) {
	this.compagnie = compagnie;
}

}