package com.oops;

class Employee
{ 
   int empId; 
   String empName; 
   static String companyName = "TCS"; 
   static //static method to valueChange the value of static variable 
    void valueChange()
   { 
      companyName = "DataFlair"; 
   } 
   //constructor to initialize the variable 
   Employee(int id, String name){ 
      empId = id; 
      empName = name; 
   } 
//method to display values 
void display()
   {
      System.out.println(empId+" "+empName+" "+companyName);
   } 
} 
//class to create and display the values of object 
public class StaticDemo 
{ 
   public static void main(String args[])
      { 
         Employee.valueChange();//calling valueChange method 
         //creating objects 
         Employee EmployeeObj = new Employee(218,"Kushal"); 
         Employee EmployeeObj1 = new Employee(635,"Bhumika"); 
         Employee EmployeeObj2 = new Employee(147,"Renuka"); 
         //calling display method 
         EmployeeObj.display(); 
         EmployeeObj1.display(); 
         EmployeeObj2.display(); 
      } 
}