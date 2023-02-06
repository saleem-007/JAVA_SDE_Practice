package Collection.HashMapPrograms;

import java.util.ArrayList;
import java.util.HashMap;

public class HashmapBasic {
    public static void main(String[] args) {
        String str="AAABBBCCCCC";
        HashMap<String, Integer> nm=new HashMap<>();
        ArrayList<String> fd=new ArrayList<>();
        String []strew=str.split("");
        for (String d:strew)
        {

            if(fd.contains(d))
            {
                int count=nm.get(d);
                nm.put(d,count+1);
            }else {
                fd.add(d);
                nm.put(d,1);
            }
        }
        System.out.println(nm);

    }
}
