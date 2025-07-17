package com.github.travislevine.dsa.chapter01;

public class Reinforcement_R1_4 {
    public static boolean isEven(int i) {
        if ((((i & 1) == 0))) return true;
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isEven(5));
    }
}
