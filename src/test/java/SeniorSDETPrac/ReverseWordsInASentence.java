package SeniorSDETPrac;

import java.util.Scanner;

public class ReverseWordsInASentence {
    public static void main(String[] args) {
        System.out.println(reverseWords("The sky is blue"));
    }

    //July 15 2k25
    public static String reverseWords(String s) {
        String[] split = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for (String str : split) {
            for (int i = str.length() - 1; i >= 0; i--) {
                sb.append(str.charAt(i));
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
