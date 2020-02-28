package com.oops;

class Parent {
    
    Parent(){
        
        System.out.println("Parent");
    }
    void Print() 
    { 
        System.out.println("parent class"); 
    } 
} 
  
class subclass1 extends Parent { 
  
    subclass1(){
    
    System.out.println("subclass 1");}
    void Print() 
    { 
        System.out.println("subclass1"); 
    } 
} 
  
class subclass2 extends Parent { 
  
    subclass2(){
//        System.out.println("subclass2");   
        
    }
    void Print() 
    { 
//        System.out.println("subclass2"); 
    } 
} 
  
public class TestPolymorphism3 { 
    public static void main(String[] args) 
    { 
  
        Parent a; 
  
        a = new subclass1(); 
        a.Print(); 
  
//        a = new subclass2(); 
//        a.Print(); 
    } 
} 