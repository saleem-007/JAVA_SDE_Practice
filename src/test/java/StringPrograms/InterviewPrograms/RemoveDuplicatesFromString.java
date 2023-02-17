package StringPrograms.InterviewPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {
//    public static void main(String[] args)
//    {
//        char str[] = "geeksforgeeks".toCharArray();
//        removeDuplicate(str, str.length);
//    }
//    public static void removeDuplicate(char[] str, int length)
//    {
//        //Hashset doesn't allow duplicate
//        //LinkedHashSet is usefull for removing element
//        HashSet<Character> s=new LinkedHashSet<>(length-1);
//        for(char x: str){
//            s.add(x);
//        }
//        for(char x:s)
//        {
//            System.out.print(x);
//        }
//    }


    public static String unique(String s)
    {
        String str = new String();
        int len = s.length();

        // loop to traverse the string and
        // check for repeating chars using
        // IndexOf() method in Java
        for (int i = 0; i < len; i++)
        {
            // character at i'th index of s
            char c = s.charAt(i);

            // if c is present in str, it returns
            // the index of c, else it returns -1
            if (str.indexOf(c) < 0)
            {
                // adding c to str if -1 is returned
                str += c;
            }
        }

        return str;
    }

    // Driver code
    public static void main(String[] args)
    {
        // Input string with repeating chars
        String s = "geeksforgeeks";

        System.out.println(unique(s));
    }
}

