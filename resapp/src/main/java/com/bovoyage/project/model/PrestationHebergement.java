package com.bovoyage.project.model;


/**
 * 
 */
public class PrestationHebergement {
	
	private Pension pension;

  /**
   * Default constructor
   */
	public enum Pension {
	    NonCompris,
	    PetitDejeuner,
	    DemiPension,
	    PensionComplete;
	}
	
  public PrestationHebergement(Pension pension) {
	  this.setPension(pension);
  }

public Pension getPension() {
	return pension;
}

public void setPension(Pension pension) {
	this.pension = pension;
}

}