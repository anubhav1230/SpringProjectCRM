package com.demo;

import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
// A class to represent a student. 
class Student 
{ 
    Integer rollno; 
    String name, address; 
  
    // Constructor 
    public Student(int rollno, String name, 
                               String address) 
    { 
        this.rollno = rollno; 
        this.name = name; 
        this.address = address; 
    } 
  
    // Used to print student details in main() 
    public String toString() 
    { 
        return this.rollno + " " + this.name + 
                           " " + this.address; 
    } 
} 
  
class SortFull implements Comparator<Student> 
{ 
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(Student a, Student b) 
    { 
int ans= a.rollno.compareTo(b.rollno) ; 
 
if(ans==0) {
     ans= a.name.compareTo(b.name);
    
}
 if (ans==0) {
    
    ans =a.address.compareTo(b.address);
}

return ans;
    } 
} 
  
//class Sortbyname implements Comparator<Student> 
//{ 
//    // Used for sorting in ascending order of 
//    // roll name 
//    public int compare(Student a, Student b) 
//    { 
//        return a.name.compareTo(b.name); 
//    } 
//} 
//  
//class Sortbyaddress implements Comparator<Student> 
//{ 
//    // Used for sorting in ascending order of 
//    // roll name 
//    public int compare(Student a, Student b) 
//    { 
//        return a.address.compareTo(b.address); 
//    } 
//} 
// Driver class 
public class ComparatorDemo 
{ 
    public static void main (String[] args) 
    { 
        ArrayList<Student> ar = new ArrayList<Student>(); 
        ar.add(new Student(121, "cccc", "london")); 
        ar.add(new Student(111, "aaaa", "zimbawe")); 
        ar.add(new Student(121, "cccc", "jaipur")); 
  
        System.out.println("Unsorted"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
  
        Collections.sort(ar, new SortFull()); 
  
//        System.out.println("\nSorted by rollno"); 
//        for (int i=0; i<ar.size(); i++) 
//            System.out.println(ar.get(i)); 
  
//        Collections.sort(ar, new Sortbyname()); 
//        Collections.sort(ar, new Sortbyaddress());
  
        System.out.println("\nSorted by name"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
    } 
} 