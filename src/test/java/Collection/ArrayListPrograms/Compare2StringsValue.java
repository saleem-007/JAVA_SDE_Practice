package Collection.ArrayListPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class Compare2StringsValue {
    public static void main(String[] args) {
        String [] str1={"Hello", "Its me", "dude", "demon"};
        String [] str2={"Hello", "Its me", "dude", "dowm", "cool"};
        ArrayList<String> arr1=new ArrayList<>(Arrays.asList(str1));
        ArrayList<String> arr2=new ArrayList<>(Arrays.asList(str2));
        System.out.println(arr1);
        System.out.println(arr2);
        arr1.retainAll(arr2);
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr1);
    }
}
