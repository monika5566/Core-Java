package com.oops.pgm;

//Parent class (Base class)
class Animal {
 void eat() {
     System.out.println("The animal eats food.");
 }
}

//Derived class 1
class Dog extends Animal {
 void bark() {
     System.out.println("The dog barks.");
 }
}

//Derived class 2 (Multilevel inheritance)
class Labrador extends Dog {
 void color() {
     System.out.println("Labrador is usually yellow or black.");
 }
}

//Derived class 3
class Cat extends Animal {
 void meow() {
     System.out.println("The cat meows.");
 }
}

//Derived class 4 (Multilevel inheritance)
class PersianCat extends Cat {
 void furType() {
     System.out.println("Persian cat has long and fluffy fur.");
 }
}

//Derived class 5 (Multilevel inheritance)
class Eagle extends Animal {
 void soar() {
     System.out.println("The eagle soars high in the sky.");
 }
}

public class MultilevelInheritance {
 public static void main(String[] args) {
     Labrador myLabrador = new Labrador();
     PersianCat myPersianCat = new PersianCat();
     Eagle myEagle = new Eagle();

     // Calling methods from different animals
     myLabrador.eat();       // Inherited from Animal class
     myLabrador.bark();      // Inherited from Dog class
     myLabrador.color();     // Defined in Labrador class

     myPersianCat.eat();     // Inherited from Animal class
     myPersianCat.meow();    // Inherited from Cat class
     myPersianCat.furType(); // Defined in PersianCat class

     myEagle.eat();          // Inherited from Animal class
     myEagle.soar();         // Defined in Eagle class
 }
}
