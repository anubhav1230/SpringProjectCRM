package com.demo;

import java.util.HashMap;

public class HashDemo {
    public static void main (String [] args) {
    
    HashMap<Car,String> theDemo = new HashMap();
    Car theCar = new Car("Tata",3);
    Car theCar2 = new Car("Tata",3);
    
   
    theDemo.put(theCar,"Hello");
    theDemo.put(theCar2,"Yahoo");
    System.out.println(theDemo.get(theCar));
    theDemo.get(theCar);
   // theCar.setName("Maruti");
    
    
    System.out.println(theDemo.get(theCar));
    System.out.println(theDemo);
    
    }
}
