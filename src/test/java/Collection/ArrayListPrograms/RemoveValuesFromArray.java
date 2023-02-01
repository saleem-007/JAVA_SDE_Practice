package Collection.ArrayListPrograms;

import java.util.ArrayList;

public class RemoveValuesFromArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(12);
        arr1.add(3);
        arr1.add(4);
        System.out.println(arr1);
        arr1.remove(0);
        System.out.println(arr1);

    }
}
