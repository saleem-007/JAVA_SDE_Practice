package StringPrograms;

import java.util.ArrayList;
import java.util.HashMap;

public class HowToPrintDuplicateString {
    public static void main(String[] args) {
        String str="My name is Saleem, I'm from Kadur";
        String n=str.replace(" ","").toLowerCase();
        System.out.println(n);
        ArrayList<String> ar=new ArrayList<>();
        HashMap<String,Integer> hc=new HashMap<>();
        String []splitMe=n.split("");
        for(String c: splitMe)
        {
            if (ar.contains(c)){
                int count=hc.get(c);
                hc.put(c, count+1);
            }else {
                ar.add(c);
                hc.put(c,1);
            }
        }
        System.out.println(hc);
    }
}
