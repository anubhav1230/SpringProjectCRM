package com.oops;

public class StringDemo { 
    
    //The reason is in the Java Language Specification String Literals:
    //‘Literal strings within the same class in the same package represent references to the same String object’. 
    //The condition in the code is true because the literals are consisting of the same characters.

    public static void main(String[] args) 
    { 
        String s1 = "GeeksForGeeks"; 
        String s2 = "GeeksForGeeks"; 
        // Comparing using the relational operator 
        if (s1 == s2) { // true 
            System.out.println("The two strings are the same!"); 
        } 
        else { 
            System.out.println("The two strings are the different!"); 
        } 
    } 
    
    
} 

//final  class A
//{
//     // methods and fields
//}
//// The following class is illegal.
//abstract class B extends A 
//{ 
//    // ERROR! Can't subclass A
//}