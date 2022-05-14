package JavaPracticeHackerRankCodes;

import java.util.Scanner;

public class PrintDataType {
    public static void main(String[] args) {
        int i=12;
        double d=4.0;
        String s="Hacker rank ";
        Scanner scan=new Scanner(System.in);
      int ii= scan.nextInt();
       double dd=scan.nextDouble();
        String ss= scan.next();

       System.out.println(i+ii);
        System.out.println(d+dd);
        System.out.println(s+ss);
        scan.close();
    }
}
