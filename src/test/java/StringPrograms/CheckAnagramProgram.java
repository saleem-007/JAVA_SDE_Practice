package StringPrograms;

import java.util.Arrays;

public class CheckAnagramProgram {
    public static void main(String[] args) {
        String str1="Army";
        String str2="Mary";
        System.out.println(str1.compareToIgnoreCase(str2));;
        char [] s1=str1.toLowerCase().toCharArray();
        char [] s2=str2.toLowerCase().toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);
        System.out.println(Arrays.equals(s1, s2));

    }
}
