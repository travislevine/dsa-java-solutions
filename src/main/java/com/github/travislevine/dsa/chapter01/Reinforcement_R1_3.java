package com.github.travislevine.dsa.chapter01;

public class Reinforcement_R1_3 {
    public static boolean isMultiple(long n, long m) {
        if (m == 0) {
            return false;
        }
        return n % m == 0;
    }
    public static void main(String[] args) {
        System.out.println(isMultiple(12, 4));
    }
}
