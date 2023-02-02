package Collection.ArrayListPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class ItratorInArrayList {
    public static void main(String[] args) {
        ArrayList<String> ar=new ArrayList<>();
        ar.add("hello");
        ar.add("dude");
        ar.add("Im not");
        Iterator<String> name = ar.iterator();
        while (name.hasNext()) {
            System.out.println(name.next());
        }
    }
}
