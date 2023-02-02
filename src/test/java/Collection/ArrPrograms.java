package Collection;

import java.util.ArrayList;

public class ArrPrograms {
    public static void main(String[] args) {
      /*  ArrayList<java.io.Serializable> Arr=new ArrayList<>();
        Arr.add("Saleem");
        Arr.add(1234);
        Arr.add("Im dangerous");
        System.out.println(Arr);
        ArrayList list=new ArrayList<>();
        list.add("Saleem");
        list.add(1234);
        list.add("2134#$#");
       // Arr.removeAll(list);
        Arr.retainAll(list);
        System.out.println(list);

        for (int i=0; i<list.size();i++ )
            System.out.println(list.get(i));

        ArrayList l1=new ArrayList<>();
    l1.add(1000);
    l1.add(21);
    l1.add(89);
    l1.add(500);
        System.out.println(l1);
        java.util.Collections.sort(l1);
        System.out.println(l1);
*/

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(30);
        list1.add(20);
        list1.add(50);
        list1.add(40);
        System.out.println("old ArrayList");
        System.out.println(list1);
        ArrayList<Integer> list2 = new ArrayList<>(list1);
        System.out.println("new ArrayList");
        System.out.println(list2);

        for (Object o: list1)
            System.out.println(o);

        ArrayList <Integer> d=new ArrayList<Integer>();
        d.add(787);
        d.add(6);
        d.add(978);
        System.out.println(d);
        for (Object g:d) {
            System.out.println(g);
        }
    }
}
