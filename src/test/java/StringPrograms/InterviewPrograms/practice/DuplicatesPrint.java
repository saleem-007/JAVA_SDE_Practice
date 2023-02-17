package StringPrograms.InterviewPrograms.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DuplicatesPrint {
    public static void main(String[] args) {
        //String str="geeksforgeeks";
        String str="nnmajajsdskk".toLowerCase();
        HashSet <Character>hs=new LinkedHashSet<>(str.length()-1);
        for (int i =0;i<str.length();i++) {
            char c = str.charAt(i);
            for (int j = i+1; j < str.length(); j++) {
                if (c==str.charAt(j)) {
                    hs.add(c);
                }
            }
        }
        System.out.println(hs);
    }
}
