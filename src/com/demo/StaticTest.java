package com.demo;

public class StaticTest {
    public final static void foo() {
        System.out.println("Test.foo() called ");
    }
    
    public void foo(int a) {
        System.out.println("Test.foo(int) called ");
    }
    
    public static void main(String args[]) {
        StaticTest.foo();
      
    }
}