package com.company;
 class Animal{
   public void makeSound() {
       System.out.println("Make Sound");
   }
 }
 class Cat extends Animal {
     public void makeSound() {
         System.out.println("Meaw");
     }
 }
public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a = new Cat();
        a1.makeSound();
        a.makeSound();
                ((Cat)a).makeSound();
                }
                }
