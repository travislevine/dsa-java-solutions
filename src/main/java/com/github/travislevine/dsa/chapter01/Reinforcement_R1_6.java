package com.github.travislevine.dsa.chapter01;

public class Reinforcement_R1_6 {
    public static int sumAllOs(int n) {
        int i_count = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                i_count += i;
            }
        }
        return i_count;
    }
    public static void main(String[] args) {
        System.out.println(sumAllOs(5)); // 1 + 3 = 4, 4 + 5 = 9
    }
}
