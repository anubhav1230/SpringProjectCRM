package com.oops;

//Java program to demonstrate working of 
//interface. 
import java.io.*; 

//A simple interface 
interface  In1 
{ 
 // public, static and final 
  int a ; 
 
// In1(int i){
//  this.a=i  ;
// }

 static void save() {
     
  a=15;   
 }
 abstract // public and abstract 
 void display(); }


// void save() {
//   
//  System.out.println("hello");  
//    
//}}

//A class that implements the interface. 
public class InterfaceTest implements In1 
{ 
 InterfaceTest(int i) {
      //super(i);
        // TODO Auto-generated constructor stub
    }

// Implementing the capabilities of 
 // interface. 
 public void display() 
 { 
     System.out.println("Geek"); 
 } 

 // Driver Code 
 public static void main (String[] args) 
 { 
     InterfaceTest t = new InterfaceTest(40); 
     t.display(); 
     System.out.println(t.a);
     //System.out.println(a); 
 } }

