package Collection;

public class HackerEarthHillNValley {
    public static void main(String[] args) {
        /*basically we need to calculate valley traversed by gary
        * If gary traversed above the sea level to sea level then it is mountain or hill U
        * If gary traversed below the sea level to sea level then it is valley D
        * input 8 UDDDUDUU
        * Sample Output 1 */
         int valley=0;
         int sum=0;
         int previous=0;
         String path="UDDDUDUU";
         for (int i=0; i<path.length();i++)
         {
             sum+=path.charAt(i)=='U'?1:-1;

             if (previous==-1&&sum==0)
             {
                 valley++;
             }
           previous=sum;
         }
        System.out.println(valley);
    }
}
