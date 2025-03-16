package io.javabrains.javabasics;

/*
Create a class `Animal2` with an abstract method `makeSound`.
Create an anonymous inner class implementation of `Animal2` and then call the `makeSound` method
 */

public class AnonymousInnerClasses {


    class Animal2 {
        abstract  public void makeSound();
    }

    public static void main(String[] args) {
Animal2 animal2=new Animal2();
animal2.makeSound();
    }
}
