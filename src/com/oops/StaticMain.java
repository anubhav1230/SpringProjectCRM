package com.oops;

public class StaticMain {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        print();
        print();
    }
    
    static void print() {
        
        try {
            System.out.print("Hello");
            
        }
        finally {
            
            System.out.println("!");
        }
    }
}
