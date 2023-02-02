package Collection.ArrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAnArray {
    public static void main(String[] args) {
        List<Integer> list2=new ArrayList<Integer>();
        list2.add(21);
        list2.add(11);
        list2.add(51);
        list2.add(1);
        Collections.sort(list2);
        for(int a: list2)
        {
            System.out.println(a);
        }

        ArrayList<Integer> list=new ArrayList<>();
        list.add(21);
        list.add(11);
        list.add(51);
        list.add(1);
        Collections.sort(list);
        for(int b: list)
        {
            System.out.println(b);
        }

        if (list.contains(21)){
            list.remove("21");
        }
        System.out.println(list);
    }
}
