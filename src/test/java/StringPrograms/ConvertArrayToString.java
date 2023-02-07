package StringPrograms;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class ConvertArrayToString {
    public static void main(String[] args) {
        /*
        1. Arrays.toString()
        2. StringBuilder.append()
        3. String.Join()
        4. Collectors.joining()
         */
        String [] str={"mom", "dom", "game", "CM"};
        String convertArraysToString= Arrays.toString(str);
        System.out.println(convertArraysToString);

        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]+" ");
        }
        System.out.println(sb);

        String bu=String.join(" ", str);
        System.out.println(bu.toUpperCase(Locale.ROOT));

        String ju=Arrays.stream(str).collect(Collectors.joining());
        System.out.println(ju);
        System.out.println(ju.toLowerCase());
        System.out.println(ju.toUpperCase(Locale.ROOT));

    }
}
