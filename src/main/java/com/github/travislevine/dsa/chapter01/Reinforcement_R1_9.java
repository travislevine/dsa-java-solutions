package com.github.travislevine.dsa.chapter01;

public class Reinforcement_R1_9 {
    public static String removePunctuation(String s) {
        // Initialise the string builder
        StringBuilder sb = new StringBuilder();

        // Loop through input string
        for (int i  = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            if (Character.isLetter(c) || Character.isWhitespace(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String test = "Let’s try, Mike!";
        System.out.println(removePunctuation(test));

    }
}
