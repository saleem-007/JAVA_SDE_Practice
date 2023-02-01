package Collection.ArrayListPrograms;

import java.util.ArrayList;

public class ChangeTheElementValue {
    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        System.out.println(arr1);
        arr1.set(0,5);
        System.out.println(arr1);
        System.out.println(arr1.get(0));
    }
}
