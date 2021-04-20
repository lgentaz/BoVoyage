package com.bovoyage.project.domain;

public abstract class PrestationHebergement {
	
	private Pension pension;

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