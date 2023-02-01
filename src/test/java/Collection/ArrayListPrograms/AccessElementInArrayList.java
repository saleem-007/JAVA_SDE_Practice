package Collection.ArrayListPrograms;

import java.util.ArrayList;

public class AccessElementInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        System.out.println(arr1);
        int num=arr1.get(1);
        System.out.println(num);
        int num1=arr1.get(0);
        System.out.println(num1);
        System.out.println(arr1);
    }
}
