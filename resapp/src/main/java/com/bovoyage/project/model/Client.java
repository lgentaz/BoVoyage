package com.bovoyage.project.model;

import java.util.*;

/**
 * 
 */
public class Client extends Personne {

  private Set<Reservation> reservations;
  private MoyenPaiement moyenPaiement;
  private Facture facture;
  private static String userName = "client1";
  private static String password = "1Aqzsedrf";

  public Client(Civilite civilite, String nom, String prenom, String email, MoyenPaiement moyenPaiement) {
		super(civilite, nom, prenom, email);
		this.moyenPaiement = moyenPaiement;
	}

public Set<Reservation> getReservations() {
	return this.reservations;
}

public void addReservation(Reservation reservation) {
	this.reservations.add(reservation);
}

public MoyenPaiement getMoyenPaiement() {
	return moyenPaiement;
}

public void setMoyenPaiement(MoyenPaiement moyenPaiement) {
	this.moyenPaiement = moyenPaiement;
}

public boolean authentification(String login, String pw) {
	return login.equals(userName) && pw.equals(password);
}

public Facture getFacture() {
	return facture;
}

public void setFacture(Facture facture) {
	this.facture = facture;
}
	

}