package com.example.autowire.constructor;

public class Car {
    private Specification specification;

    // Constructor for constructor-based injection
    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {
        System.out.println("Car Details :" + specification.toString());
    }
}
