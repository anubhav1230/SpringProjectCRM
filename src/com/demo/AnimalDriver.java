package com.demo;

public class AnimalDriver {
    public static void main(String args[]) {
    
    Dog dog = new Dog();
    Animal anim = (Animal) dog;
    anim.eat();
    
    
    Animal animal = new Cat();
//    Dog dogs = (Dog) animal;
//    dogs.bark();
    if (animal instanceof Cat) {
        Cat cat = (Cat) animal;
        cat.meow();
    } else if (animal instanceof Dog) {
        Dog dogs = (Dog) animal;
        dogs.bark();
    }
    
    
    }
}
