package com.bovoyage.project.service;

import java.util.*;

import com.bovoyage.project.domain.Voyage;

/**
 * 
 */
public class AgencesVoyagesServices {
	
	private Set<Voyage> voyages = new HashSet<Voyage>();
	private String nom;

  /**
   * Default constructor
   */
	public AgencesVoyagesServices(String nom, Set<Voyage> voyages) {
		this.setNom(nom);
		this.voyages = voyages;
	}

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

  
	public boolean reserver(Voyage Voyage) {
	   return false;
	}

	public Set<Voyage> getOffres() {
	    return this.voyages;
	}
	
	public void setVoyage(Voyage voyage) {
		this.voyages.add(voyage);
	}
	
	public void setVoyage(HashSet<Voyage> voyages) {
		this.voyages.addAll(voyages);
	}

}