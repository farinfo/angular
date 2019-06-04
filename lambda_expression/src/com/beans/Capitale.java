package com.beans;

public class Capitale extends Ville {
	
	public static String decrisToi() {
		return "Alger";
	}
	public Capitale() {
		// TODO Auto-generated constructor stub
	}
public static void main (String args[]) {
	
	System.out.println(Capitale.decrisToi());
	Object[][] tableau = new Object[2][3];
	 
	//Parcours lignes et colonnes pour les deux for, respectivement
	for(int i=0; i<5; i++)
	{
		   for(int j=0; j<6; j++)
		   {
		     tableau[i][j] = "position du tableau : tableau["+i+"]["+j+"]";  
		     System.out.println(tableau[i][j]); 
		   }
	}
}
}
