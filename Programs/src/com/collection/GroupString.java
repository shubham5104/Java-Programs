package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GroupString {

	// Function to check if two words are anagrams
    private static boolean areAnagrams(String a, String b) {
        if (a.length() != b.length()) return false;
        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        return Arrays.equals(ca, cb);
    }

    // Function to group words based on anagram or prefix relations
    public static List<List<String>> groupWords(List<String> words) {
        Set<String> used = new HashSet<>();
        List<List<String>> result = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            String current = words.get(i);
            if (used.contains(current)) continue;

            List<String> group = new ArrayList<>();
            group.add(current);
            used.add(current);

            for (int j = i + 1; j < words.size(); j++) {
                String next = words.get(j);
                if (used.contains(next)) continue;

                // Check for anagram
                if (areAnagrams(current, next)) {
                    group.add(next);
                    used.add(next);
                }
                // Check for prefix-based relation
                else if (current.startsWith(next) || next.startsWith(current)) {
                    group.add(next);
                    used.add(next);
                }
            }

            result.add(group);
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("tap", "pat", "student", "students", "lamp", "lense");

        List<List<String>> grouped = groupWords(words);

        for (List<String> group : grouped) {
            System.out.println(String.join(",", group));
        }
    }

}
