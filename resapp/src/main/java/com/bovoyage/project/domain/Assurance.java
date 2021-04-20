package com.bovoyage.project.domain;

/**
 * 
 */
public class Assurance {

	private double prix;
	private Contrat contrat;

  /**
   * Default constructor
   */
	public Assurance() {
		  
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
  
}