package com.github.travislevine.dsa.chapter01;

public class Reinforcement_R1_7 {
    public static int sumSquares(int n) {
        int sumPositiveSquare = 0;
        for (int i = 0; i <= n; i++) {
               sumPositiveSquare += i * i;

        }
        return sumPositiveSquare;
    }

    public static void main(String[] args) {
        System.out.println(sumSquares(4));
    }
}
