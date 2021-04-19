package com.bovoyage.project.model;

import java.util.*;

/**
 * 
 */
public class Voyage {
	
	 private long numeroVoyage;
	 private static long compteur = 0;
	 private boolean dispoStatus;
	 private double prix;
	 private Formule formule;
	 private Destination destination;
	 private ArrayList<Reservation> reservations;
	 private Scanner sc = new Scanner(System.in);

  /**
   * Default constructor
   */
  public Voyage(double prix, Formule formule, Destination destination) {
	  this.dispoStatus = true;
	  this.prix = prix;
	  this.setFormule(formule);
	  this.setDestination(destination);
	  this.setNumeroVoyage(++compteur);
  }

  /**
   * @return
   */
  public double getPrix() {
    // TODO implement here
    return this.prix;
  }

  /**
   * @return
   */
  public boolean getStatus() {
    // TODO implement here
    return dispoStatus;
  }

  /**
   * @param dispoStatus
 * @return 
   */
  public void changeStatus() {
    // TODO implement here
	  this.dispoStatus = !this.dispoStatus;
  }

public Formule getFormule() {
	return formule;
}

public void setFormule(Formule formule) {
	this.formule = formule;
}

public Destination getDestination() {
	return destination;
}

public void setDestination(Destination destination) {
	this.destination = destination;
}

public long getNumeroVoyage() {
	return numeroVoyage;
}

public void setNumeroVoyage(long numeroVoyage) {
	this.numeroVoyage = numeroVoyage;
}

  /**
   * 
   */
public void reserver(Client c) throws Exception{
	boolean isUser = false;
	String user;
	String password; 
	int essai = 0;
	
	while(!isUser && essai<5) {
		System.out.println("login:");
		user = sc.nextLine();
		System.out.println("password:");
		password = sc.nextLine();
		isUser = c.authentification(user, password);
		essai++;
	}
	
	if (isUser){
		System.out.println("Souhaitez-vous  souscrire une assurantce annulation? Y/N");
		boolean isAssure = false;
		if(sc.nextLine() =="Y") isAssure = true;

		System.out.println("Participez-vous au voyage? Y/N");
		boolean participe = false;
		if(sc.nextLine() =="Y") participe = true;
		
		System.out.println("Combien de personnes voyages?");
		int nbVoyageurs = sc.nextInt();
		Set<Voyageur> voyageurs = new HashSet<Voyageur>();

		if (participe) {
			Voyageur vc = new Voyageur((Personne)c,18, "");
			voyageurs.add(vc);
			nbVoyageurs--;
		}
		for (int i = 0; i<(nbVoyageurs-1); i++) {
			Voyageur v = new Voyageur(Personne.Civilite.Mr,"","","",0,"");
			voyageurs.add(v);
		}
		
		Reservation reservation = new Reservation(c, voyageurs, this, isAssure);
		this.reservations.add(reservation);
		for (Voyageur v:voyageurs) {
			v.setReservation(reservation);
		}
		
		if (c.payer()) {
			reservation.setEtat(Etat.enCours);
		} else {
			reservation.setEtat(Etat.refusee);
		}
		
	} else throw new Exception();

}

}