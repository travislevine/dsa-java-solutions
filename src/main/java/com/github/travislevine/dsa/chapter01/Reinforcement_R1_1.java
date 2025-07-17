package com.github.travislevine.dsa.chapter01;

import java.util.Scanner;

public class Reinforcement_R1_1 {

    /**
     * The solution method. It reads each Java primitive type from standard input
     * and prints it back to standard output.
     */
    public void inputAllBaseTypes() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a boolean (true/false):");
        boolean boolVal = scanner.nextBoolean();

        System.out.println("Enter a character:");
        char charVal = scanner.next().charAt(0);

        System.out.println("Enter a byte (-128 to 127):");
        byte byteVal = scanner.nextByte();

        System.out.println("Enter a short:");
        short shortVal = scanner.nextShort();

        System.out.println("Enter an integer:");
        int intVal = scanner.nextInt();

        System.out.println("Enter a long:");
        long longVal = scanner.nextLong();

        System.out.println("Enter a float:");
        float floatVal = scanner.nextFloat();

        System.out.println("Enter a double:");
        double doubleVal = scanner.nextDouble();

        System.out.println("\n--- You entered ---");
        System.out.println("Boolean: " + boolVal);
        System.out.println("Character: " + charVal);
        System.out.println("Byte: " + byteVal);
        System.out.println("Short: " + shortVal);
        System.out.println("Integer: " + intVal);
        System.out.println("Long: " + longVal);
        System.out.println("Float: " + floatVal);
        System.out.println("Double: " + doubleVal);

        scanner.close();
    }

    /**
     * The main method acts as the entry point to run this specific exercise.
     */
    public static void main(String[] args) {
        // 1. Create an instance of the class
        Reinforcement_R1_1 exercise = new Reinforcement_R1_1();
        // 2. Call the method containing the solution logic
        exercise.inputAllBaseTypes();
    }
}