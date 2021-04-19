package com.bovoyage.project.model;

/**
 * 
 */
public class Voyageur extends Personne {
	
  private int age;
  private String pieceIdentite;
  private Reservation reservation;

  /**
   * Default constructor
   */
	public Voyageur(Civilite civilite, String nom, String prenom, String email, int age, String pieceIdentite) {
		super(civilite, nom, prenom, email);
		this.age = age;
		this.pieceIdentite = pieceIdentite;
	}
	
	public Voyageur(Personne p, int age, String pieceIdentite) {
		super(p.getCivilite(), p.getNom(), p.getPrenom(), p.getEmail());
		this.age = age;
		this.pieceIdentite = pieceIdentite;
	}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getPieceIdentite() {
	return pieceIdentite;
}

public void setPieceIdentite(String pieceIdentite) {
	this.pieceIdentite = pieceIdentite;
}

public Reservation getReservation() {
	return reservation;
}

public void setReservation(Reservation reservation) {
	this.reservation = reservation;
}


}