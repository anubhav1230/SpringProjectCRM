package com.demo;

public class JavaOutOfMemoryErrorExample {

    public static void main(String[] args) {
        
        Integer[] array = new Integer[1000*1000*100];
        System.out.println("Done");
        
    }

}