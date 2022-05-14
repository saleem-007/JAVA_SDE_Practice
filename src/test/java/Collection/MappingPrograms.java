package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MappingPrograms {
    public static void main(String[] args) {
        HashMap<String, Integer> hm=new HashMap<String, Integer>();
        hm.put("Dude", 87);
        hm.put("body", 45);
        System.out.println(hm);

        LinkedHashMap<String, Integer> lhm=new LinkedHashMap<>();
        lhm.put("nameIS",007);
        lhm.put("kya",45);
        System.out.println(lhm);

        TreeMap<String, Integer> tm=new TreeMap<>();
        tm.put("gaaa", 56);
        tm.put("kfk", 01);
        System.out.println(tm);

    }

}
