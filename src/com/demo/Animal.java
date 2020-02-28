package com.demo;

public abstract  class Animal implements Mammal {
    public void eat() {
        System.out.println("Eating...");
    }
 
    public final void move() {
        System.out.println("Moving...");
    }
 
    public final void sleep() {
        System.out.println("Sleeping...");
    }
 
}