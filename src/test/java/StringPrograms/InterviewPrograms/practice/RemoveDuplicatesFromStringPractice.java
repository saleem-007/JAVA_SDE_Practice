package StringPrograms.InterviewPrograms.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromStringPractice {
    public static void main(String[] args) {
        char[] str="geeksforgeeks".toCharArray();
        int length=str.length;
        HashSet<Character> hs=new LinkedHashSet<>(length-1);
        for(char c:str){
            hs.add(c);
        }
        for(char c:hs)
        {
            System.out.print(c);
        }
    }
}
