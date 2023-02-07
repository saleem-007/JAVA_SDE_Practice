package StringPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseEachWords {
    public static void main(String[] args) {
        String str1="Java Programs on String";
        String str2="";
        for(int i=str1.length()-1;i>=0;i--)
        {
            str2=str2+str1.charAt(i);
        }
        String [] d=str2.split(" ");
        ArrayList ar=new ArrayList<>(Arrays.asList(d));
        for(int i=ar.size()-1;i>=0;i--) {
            System.out.print(ar.get(i));
        }
    }
}
