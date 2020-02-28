package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public class MapValueSort {
    
    
    public static HashMap<Integer, String> sortHashMapByValues(
            HashMap<Integer, String> passedMap) {
        System.out.println(passedMap.keySet());
        System.out.println(passedMap.values());
        //Make List of all the keys
        List<Integer> mapKeys = new ArrayList<>(passedMap.keySet());
        //Make List of all the values
        List<String> mapValues = new ArrayList<>(passedMap.values());
        Collections.sort(mapValues);
        Collections.sort(mapKeys);

      //Have a linked hashmap
        LinkedHashMap<Integer, String> theMap= new LinkedHashMap<>();
        
        Iterator<String> theIterate = mapValues.iterator();
        
        while(theIterate.hasNext()) {
        String theValue =theIterate.next();
        Iterator<Integer> theSecondIterate= mapKeys.iterator();
        
        while(theSecondIterate.hasNext()) {
            
          Integer theKeys =theSecondIterate.next(); 
          //get value from the key
          String value2 = passedMap.get(theKeys);
          String value1=theValue;
          if(value2.equals(value1)) {
              theSecondIterate.remove();
              
              theMap.put(theKeys, value1);
              break;
          }
          
        }
        
                }
        
    return theMap;
    }
    
    
    public static void main(String[] args) {
        
        HashMap <Integer, String> theHash = new HashMap();
        theHash.put(1, "Anubhav");
        theHash.put(2, "Anmol");
        theHash.put(3, "Anmol");
        theHash.put(4, "Shivani");
        
       HashMap theLinkedHash= sortHashMapByValues(theHash);
        System.out.println(theLinkedHash);
        
        
    }
}
