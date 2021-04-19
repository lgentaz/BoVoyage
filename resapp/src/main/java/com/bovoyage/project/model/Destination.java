package com.bovoyage.project.model;

/**
 * 
 */
public class Destination {

  private String pays;
  private String continent;  

  
  public Destination(String pays,String continent) {
	this.pays = pays;
	this.continent = continent;
  }


public String getPays() {
	return pays;
}


public void setPays(String pays) {
	this.pays = pays;
}


public String getContinent() {
	return continent;
}


public void setContinent(String continent) {
	this.continent = continent;
}

}