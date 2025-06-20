package arrayPractice;

import java.util.*;
import java.util.regex.*;

public class CountValidDigitPairs {

    public static void main(String[] args) {
        String input1 = "ab123cd45ef67gh8"; // Expected output: 3
        String input2 = "aa55bb53cc33dd";   // Expected output: 0

        System.out.println("Output 1: " + countValidDigitPairs(input1));
        System.out.println("Output 2: " + countValidDigitPairs(input2));
    }

    public static int countValidDigitPairs(String input) {
        List<String> digitSubstrings = new ArrayList<>();

        // Extract groups of digits using regex
        Matcher matcher = Pattern.compile("\\d+").matcher(input);
        while (matcher.find()) {
            digitSubstrings.add(matcher.group());
        }

        int count = 0;

        // Compare last digit of current with first digit of next substring
        for (int i = 0; i < digitSubstrings.size() - 1; i++) {
            String current = digitSubstrings.get(i);
            String next = digitSubstrings.get(i + 1);

            char lastDigitCurrent = current.charAt(current.length() - 1);
            char firstDigitNext = next.charAt(0);

            if (lastDigitCurrent != firstDigitNext) {
                count++;
            }
        }

        return count;
    }
}
