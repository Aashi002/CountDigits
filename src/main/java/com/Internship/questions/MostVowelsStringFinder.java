package com.Internship.questions;

public class MostVowelsStringFinder {
    public static void main(String[] args) {
        String[] strings = {"Sunshine", "Umbrella", "Major", "Resourceful"};
        String mostVowelsString = findMostVowelsString(strings);
        System.out.println("String with the most vowels: " + mostVowelsString);
    }

    public static String findMostVowelsString(String[] strings) {
        String result = "";
        int maxVowels = 0;

        for (String str : strings) {
            int vowelsCount = countVowels(str);
            if (vowelsCount > maxVowels) {
                maxVowels = vowelsCount;
                result = str;
            }
        }

        return result;
    }

    public static int countVowels(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}

