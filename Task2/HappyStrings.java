package Task2;

import java.util.List;

public class HappyStrings {
    public static void main(String[] args) {
        List<String> strings = List.of("abbcc", "abc", "abcabc", "cabcbb");
        int result = numberOfHappyStrings(strings);
        System.out.println("result = " + result);
    }
    public static int numberOfHappyStrings(List<String> strings) {
    int happyCount = 0;

    for (String str : strings) {
        if (checkIfStringIsHappy(str)) {
            happyCount++;
        }
    }
    return happyCount;
}

    private static boolean checkIfStringIsHappy(String str) {
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            char nextChar = (i < str.length() - 1) ? str.charAt(i + 1) : '\0';

            if (currentChar == nextChar) {
                return false;
            }
        }

        return true;
    }
}