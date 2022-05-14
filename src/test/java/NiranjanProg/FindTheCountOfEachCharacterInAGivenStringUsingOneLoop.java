package NiranjanProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;



public class FindTheCountOfEachCharacterInAGivenStringUsingOneLoop {
    public static void main(String[] args){
      /*  String str = "Saleem";
        ArrayList<Character> al = new ArrayList<>();
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (al.contains(c)) {
                int count = hm.get(c);
                hm.put(c, count + 1);
            } else {
                hm.put(c, 1);
                al.add(c);
            }

        }
        System.out.println(hm);
       */
        String str="MARVEL";
        ArrayList arr=new ArrayList();
        LinkedHashMap<Character, Integer> hm=new LinkedHashMap<Character, Integer>();
        for(int i =0; i<str.length(); i++)
        {
            char c=str.charAt(i);
            if(arr.contains(c))
            {
                int count=hm.get(c);
                hm.put(c, count+1);
            }
            else
            {
                hm.put(c,1);
                arr.add(c);
            }
        }
        System.out.println(hm);
    }
    }


