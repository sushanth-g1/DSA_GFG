package org.example.dsa.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class StringProblems {
    public char nonRepeatingChar(String s) {
        // code here
        HashMap<Character, Integer> wordCount = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            wordCount.put(c, wordCount.getOrDefault(c, 0) + 1);
        }
        for (Character key : wordCount.keySet()) {
            if(wordCount.get(key) ==1 ){
                return key;
            }
        }
        return '$';

    }
}
