package UdemyPractice;

import java.util.Scanner;

public class MegaByteConverter {
    public static void main(String[] args)
    {
        printMegaBytesAndKiloBytes();
        printGigaBytesAndTeraBytes();
    }
    public static void printMegaBytesAndKiloBytes()
    {
        Scanner scn=new Scanner(System.in);
        int kiloBytes= scn.nextInt();
        int remainKiloBytes=0;
        int megaBytes=0;
        if (kiloBytes>0)
        {
            remainKiloBytes=kiloBytes%1024;
            megaBytes=kiloBytes/1024;
            System.out.println(kiloBytes+" KB = "+megaBytes+" MB and "+remainKiloBytes+" KB");

           /* System.out.print( kiloBytes + " KB = ");
            int convertedValues = kiloBytes / 1024;
            System.out.print(convertedValues + " MB and ");
            convertedValues = kiloBytes % 1024;
            System.out.println(convertedValues + " KB");    */
        }
        else
        {
            System.out.println("Invalid Value");
        }
        int megaByte= scn.nextInt();
        int kiloByte=0;
        if (megaByte>0)
        {
            kiloByte=megaByte*1024;
            System.out.println(megaByte+" MB = "+kiloByte+" KB");
        }

    }
    public static void printGigaBytesAndTeraBytes()
    {
        Scanner scn=new Scanner(System.in);
        int megaBytes= scn.nextInt();
        int gigBytes=0;
        int remainMegaBytes=0;
        if (megaBytes>0){
            gigBytes=megaBytes/1024;
            remainMegaBytes=megaBytes%1024;
            System.out.println(megaBytes+" MB = "+gigBytes+" GB and "+remainMegaBytes);
        }
        else{
            System.out.println("Invalid Value");
        }
        int gigaByte= scn.nextInt();
        int megaByte=0;
        if (gigaByte>0)
        {
            megaByte=gigaByte*1024;
            System.out.println(gigaByte+" GB = "+megaByte+" MB");
        }
    }
}
