package Pract;

import java.util.Scanner;

public class ConditionStatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer n=sc.nextInt();
        number(n);
    }
    public static void number(int n)
    {
        String str="";
       if (n%2==1)
       {
          // str="Weird";
           System.out.println("Weird");
       }
       else
       {
           if(n>=6&&n<=20)
           {
               System.out.println("Weird");
           }
           else{
               System.out.println("Not weird");
           }
       }

        System.out.println("Hello");
    }
}
