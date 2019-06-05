package com.beans;

import java.util.Arrays;

public class Test {

	public static void main (String args []) {

	Personne [] leTableau = new Personne[2];
	
	leTableau[0] = new Personne("Yacine", 45);
	leTableau[1] = new Personne("Lyes", 30);
	
	
	System.out.println(leTableau[0]);
	System.out.println(leTableau[1]);

	
	Arrays.sort(leTableau,Personne :: compareA);
	
	System.out.println(leTableau[0]);
	System.out.println(leTableau[1]);

	
	}

}
