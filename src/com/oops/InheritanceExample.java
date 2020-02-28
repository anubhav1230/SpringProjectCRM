package com.oops;

import java.io.FileNotFoundException;

class Doctor {
	Doctor() throws FileNotFoundException{
		
		System.out.println("hello");
	}
	void Doctor_Details() {
		 System.out.println("byee");

		 
 }
}

class Surgeon extends Doctor {
	Surgeon() throws FileNotFoundException  {
		super();
		// TODO Auto-generated constructor stub
	}
	void Doctor_Details() {
		 System.out.println("byahoooyee");

		 
}
 void  Surgeon_Details () {
  System.out.println("hello");
 }
}


class Patient extends Surgeon {


		 
}

public class InheritanceExample {
 public static void main(String args[]) {
  Doctor s = new Patient();
  s.Doctor_Details();
 
  System.out.println(s instanceof Surgeon);
 }
}