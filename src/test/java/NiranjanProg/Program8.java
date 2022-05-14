package NiranjanProg;

import java.util.ArrayList;

public class Program8 {
    public static void main(String[] args) {
        //Find the 1st repeating number in the given array with using only
        //            one for loop
            int[] array = {1, 2, 4, 4, 5, 4, 1, 3, 4, 4, 1};
            int firstRepeatingNumber = 0;
            ArrayList<Integer> al = new ArrayList<Integer>();
            for (int i = array.length - 1; i >= 0; i--) {
                int num = array[i];
                if (al.contains(num))
                    firstRepeatingNumber = num;
                else
                    al.add(num);
            }
            System.out.println(firstRepeatingNumber);

        }
    }
