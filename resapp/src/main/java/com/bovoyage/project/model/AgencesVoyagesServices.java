package com.bovoyage.project.model;

import java.util.*;

/**
 * 
 */
public class AgencesVoyagesServices {
	
	private Set<Voyage> voyages;
	private String nom;

  /**
   * Default constructor
   */
  public AgencesVoyagesServices(String nom) {
	  this.setNom(nom);
  }

  /**
   * @param Voyage 
   * @return
   */
  public boolean reserver(Voyage Voyage) {
    // TODO implement here
    return false;
  }

  /**
   * @return
   */
  public Set<Voyage> getOffres() {
    // TODO implement here
    return this.voyages;
  }

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

}