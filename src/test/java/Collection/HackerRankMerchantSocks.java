package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HackerRankMerchantSocks {
    public static void main(String[] args) {

       // HackerRankMerchantSocks.socks(new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}, 0);

        List<Integer> ar=new ArrayList<>();
        ar.add(10);
        ar.add(20);
        ar.add(20);
        ar.add(10);
        ar.add(10);
        ar.add(30);
        ar.add(50);
        ar.add(10);
        ar.add(20);

        int num_pairs=0;
        Set<Integer> set=new HashSet<>();
        for(int i: ar)
        {
            if(!set.contains(i))
            {
                set.add(i);
            }
            else
            {
                num_pairs++;
                set.remove(i);
            }
        }
        System.out.println(num_pairs);
    }
    }

    /*int num_pairs=0;
    if(ar.size()==0) return num_pairs;

   Set<Integer> set=new HashSet<Integer>();
   for(int i: ar)
   {
       if(!set.contains(i))
       {
           set.add(i);
       }
       else{
           num_pairs++;
           set.remove(i);
       }
   }
   return num_pairs;
    }
*/

