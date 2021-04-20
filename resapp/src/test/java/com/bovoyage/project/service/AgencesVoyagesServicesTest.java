package com.bovoyage.project.service;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

import com.bovoyage.project.domain.Destination;
import com.bovoyage.project.domain.Formule;
import com.bovoyage.project.domain.Voyage;

public class AgencesVoyagesServicesTest {
	
	private Destination d;
	private Formule f;
	private Voyage v;
	private Set<Voyage> setV;
	private AgencesVoyagesServices avs;
	
	
	@Before
	public void setUp() {
		d = new Destination("Italie", "Europe");
		f = new Formule(400);
		v = new Voyage(500.0, f, d);
		setV = new HashSet<Voyage>();
		setV.add(v);
		avs = new AgencesVoyagesServices("Mon Agence", setV);
	}
	
	@Test
	public void testReserver() {
		assertTrue(avs.reserver(v));
		assertFalse(!avs.reserver(v));
	}

}
