package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetPrograms {
    public static void main(String[] args) {
        HashSet<Object> hs=new HashSet<>();
        hs.add(123);
        hs.add(6);
        hs.add(6);
        hs.add(7);
        hs.add(7.2);
        hs.add(4654);
        hs.add("never");
        System.out.println(hs);
        System.out.println(hs.contains(6));

       /* for (int i=0;i<hs.size();i++)
            System.out.println(hs);*/

        LinkedHashSet<Object> lhs=new LinkedHashSet<>();
        lhs.add(54);
        lhs.add(897);
        lhs.add(8);
        lhs.add(879);
        lhs.add(54);
        System.out.println(lhs);

        TreeSet<Object> ts=new TreeSet<>();
        ts.add(78);
        ts.add(5);
        ts.add(9);
        ts.add(9);
        ts.add(879878);
        ts.add(645);
        System.out.println(ts);

        /*HashSet
It is the class which implements set interface
Features of HashSet
It will not follow order of insertion
size is dynamic
heterogenous type of data
It is not indexed type of collection
It doesn’t allow duplicates
Since it is not indexed type of collection we can not fetch the elements upon index.
Linked HashSet
It is a class which extends hashSet
Features
It will follow proper order of insertion
size is dynamic
heterogenous type of data
It is not indexed type of collection
It doesn’t allow duplicates
Since it is not indexed type of collection we can not fetch the elements upon index.
TreeSet
It is a class which implements set interface
features
size is dynamic
heterogenous type of data
It is not indexed type of collection
It doesn’t allow duplicates
Since it is not indexed type of collection we can not fetch the elements upon index.
It is completely auto sorted*/

    }
}
