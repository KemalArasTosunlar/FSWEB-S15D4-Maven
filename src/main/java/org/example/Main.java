package org.example;

import java.util.Stack;

public class Main {

    // Veri Yapıları Challenge I: Palindrom kontrolü
    public static boolean checkForPalindrome(String input) {
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();  // Sadece harf ve rakamları al
        Stack<Character> stack = new Stack<>();

        for (char c : cleanedInput.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return cleanedInput.equals(reversed.toString());
    }

    // Veri Yapıları Challenge III: Decimal'i binary'ye dönüştürme
    public static String convertDecimalToBinary(int number) {
        StringBuilder binary = new StringBuilder();

        while (number > 0) {
            binary.insert(0, number % 2);
            number /= 2;
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        // Örnek kullanımlar
        System.out.println(checkForPalindrome("I did, did I?")); // true
        System.out.println(convertDecimalToBinary(5)); // 101
    }
}
