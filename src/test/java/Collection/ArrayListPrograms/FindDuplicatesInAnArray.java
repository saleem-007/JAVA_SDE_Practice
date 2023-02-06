package Collection.ArrayListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindDuplicatesInAnArray {
    public static void main(String[] args) {
        String [] str={"hello", "khelo", "mom", "jeelo"};
        String []str2={"jhulo", "hello","mom"};
        ArrayList<String> arr=new ArrayList<>();
        for(String s:str)
        {
            for(String m:str2)
            {
                if(s==m)
                {
                    arr.add(m);
                }
            }
        }
        System.out.println(arr);

    }
}
