package com.demo;

public class Car {
    String name;
    int tyre;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTyre() {
        return tyre;
    }
    public void setTyre(int tyre) {
        this.tyre = tyre;
    }
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((name == null) ? 0 : name.hashCode());
//        result = prime * result + tyre;
//        return result;
//    }
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        Car other = (Car) obj;
//        if (name == null) {
//            if (other.name != null)
//                return false;
//        } else if (!name.equals(other.name))
//            return false;
//        if (tyre != other.tyre)
//            return false;
//        return true;
//    }
    @Override
    public String toString() {
        return "Car [name=" + name + ", tyre=" + tyre + "]";
    }
    public Car(String name, int tyre) {
        super();
        this.name = name;
        this.tyre = tyre;
    }
    
    
   
}