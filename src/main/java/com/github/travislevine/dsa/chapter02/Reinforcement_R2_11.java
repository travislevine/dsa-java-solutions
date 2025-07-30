package com.github.travislevine.dsa.chapter02;

public class Reinforcement_R2_11 {

    // By making the class static, it can contain a static main method.
    static class Maryland extends State {
        Maryland() { /* null constructor */ }
        public void printMe() { System.out.println("Read it."); }
    }

    // These should also be static so they can be instantiated without
    // an instance of the outer Reinforcement_R2_11 class.
    static class State extends Region {
        State() { /* null constructor */ }
        public void printMe() { System.out.println("Ship it."); }
    }

    static class Region extends Place {
        Region() { /* null constructor */ }
        public void printMe() { System.out.println("Box it."); }
    }

    static class Place extends Object {
        Place() { /* null constructor */ }
        public void printMe() { System.out.println("Buy it."); }
    }

    // The main method must be static to be the entry point.
    public static void main(String[] args) {
        Region east = new State();

        State md = new Maryland();

        Object obj = new Place();

        Place usa = new Region();

        System.out.println("Predicted output for R-2.11:");

        md.printMe(); // Read it.

        east.printMe(); // Ship it.

        ((Place) obj).printMe(); // Buy it.

        obj = md;
        ((Maryland) obj).printMe(); // Read it.

        obj = usa;
        ((Place) obj).printMe(); // Buy it.

        usa = md;
        ((Place) usa).printMe();
    }
}