package com.github.travislevine.dsa.chapter01;

public class Reinforcement_R1_8 {

    public static int countVowels(String word) {
        String vowels = "aeiou";
        String lowerCaseInput = word.toLowerCase();
        int vowelCount = 0;
        for (int i = 0; i < lowerCaseInput.length(); i++) {
            char letter = lowerCaseInput.charAt(i);
            if (vowels.indexOf(letter) != -1) {
                vowelCount += 1;
            }
        }
        return vowelCount;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("example"));
    }
}
