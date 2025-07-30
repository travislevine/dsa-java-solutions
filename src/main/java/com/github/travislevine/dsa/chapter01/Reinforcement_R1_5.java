package com.github.travislevine.dsa.chapter01;

public class Reinforcement_R1_5 {
    public static int sumPositives(int n) {
        int sumOfNums = 0;
        for (int i = 0; i <= n; i++) {
            sumOfNums += i;
        }
        return sumOfNums;
    }
    public static void main(String[] args) {
        System.out.println(sumPositives(5)); // 1 + 2 + 3 + 4 + 5
    }
}
