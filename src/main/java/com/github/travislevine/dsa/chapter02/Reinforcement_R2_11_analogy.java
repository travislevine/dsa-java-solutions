package com.github.travislevine.dsa.chapter02;

// The public class name must match the file name.
public class Reinforcement_R2_11_analogy {

    // The 'Poodle' class is the most specific. It contains the main method.
    static class Poodle extends Dog {
        public void printMe() { System.out.println("Prance."); }

        public static void main(String[] args) {
            // A Dog object is created and held by a Canine reference.
            Canine fido = new Dog();

            // A Poodle object is created and held by a Dog reference.
            Dog fluffy = new Poodle();

            // An Animal object is created and held by an Object reference.
            Object obj = new Animal();

            // A Canine object is created and held by an Animal reference.
            Animal creature = new Canine();

            System.out.println("Predicted output for the Animal Hierarchy:");
            fluffy.printMe();   // Calls Poodle's method - Prints: Prance.

            fido.printMe();     // Calls Dog's method - Prints: Wag tail.

            ((Animal) obj).printMe(); // Converts obj to Animal, then calls Animal - Prints: Live life.

            obj = fluffy; // Assigns Dog (fluffy) to obj

            ((Poodle) obj).printMe(); // fluffy (obj) which calls Poodle - Prints: Prance

            obj = creature; // Assigns obj (fluffy) to Animal creature

            ((Animal) obj).printMe();  // Creature which calls Canine - Prints Sniff around.

            creature = fluffy;

            ((Animal) creature).printMe();
        }
    }

    // The 'Dog' class
    static class Dog extends Canine {
        public void printMe() { System.out.println("Wag tail."); }
    }

    // The 'Canine' class
    static class Canine extends Animal {
        public void printMe() { System.out.println("Sniff around."); }
    }

    // The 'Animal' class is the base of our hierarchy.
    static class Animal extends Object {
        public void printMe() { System.out.println("Live life."); }
    }
}