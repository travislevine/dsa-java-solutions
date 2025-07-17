package com.github.travislevine.dsa.chapter01;

public class Reinforcement_R1_5 {
    public static int sumPositives(int n) {
        int i_count = 0;
        for (int i = 0; i <= n; i++) {
            i_count += i;
        }
        return i_count;
    }
    public static void main(String[] args) {
        System.out.println(sumPositives(5));
    }
}
