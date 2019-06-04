package com.beans;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaExample {

	public LambdaExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

	Myfunction myfunction = (txt1, txt2) -> System.out.println(txt1 +"  "+ txt2);
	
	myfunction.apply("Hello Function", "test");
	
	}

}
