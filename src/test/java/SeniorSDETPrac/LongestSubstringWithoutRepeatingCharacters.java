package SeniorSDETPrac;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(countOfTheLongestSubString("acdccbb"));;
    }

    public static int countOfTheLongestSubString(String str) {
        int start = 0;
        int end = 0;
        int max_length = 0;
        List<Character> list = new ArrayList<>();
        while (end < str.length()) {
            if (!list.contains(str.charAt(end))) {
                list.add(str.charAt(end));
                end++;
                max_length = Math.max(max_length, list.size());
            } else {
                list.remove(Character.valueOf(str.charAt(start)));
                start++;
            }
        }
        return max_length;
    }
}
