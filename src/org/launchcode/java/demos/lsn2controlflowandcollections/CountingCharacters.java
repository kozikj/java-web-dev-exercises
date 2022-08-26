package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        System.out.println("Write a sentence: ");
        Scanner input = new Scanner(System.in);
        String quote = input.nextLine();
        char[] charactersInString = quote.toLowerCase().toCharArray();

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char letter : charactersInString) {
            if (charCount.containsKey(letter)) {
                charCount.put(letter, charCount.get(letter) +1);
            } else {
                charCount.put(letter, 1);
            }
        }
        for (Map.Entry<Character, Integer> letter: charCount.entrySet()){
            System.out.println(letter.getKey() + ": " + letter.getValue());
        }


    }

}
