package UdemyPractice;

import java.util.Scanner;

public class SpeedConverterChallenge {
    public static void main(String[] args) {
       /* Scanner scn=new Scanner(System.in);
        double num= scn.nextDouble();*/
        toMilesPerHour(1.5);
        printConversion(1.5);
        toMilesPerHour(10.25);
        printConversion(10.25);
        toMilesPerHour(-5.6);
        printConversion(-5.6);
        toMilesPerHour(25.42);
        printConversion(25.42);
        toMilesPerHour(75.114);
        printConversion(75.114);

    }
    public static long toMilesPerHour(double kiloMetersPerHour)
    {
        long milesPerHour = 0;
        if (kiloMetersPerHour>0)
        {
            /*Math.round() method returns the value of the argument rounded to the nearest int value*/
           milesPerHour= Math.round(kiloMetersPerHour/1.609);
            //System.out.println(milesPerHour);
        }
        else
        {
            milesPerHour=-1;
        }
        return milesPerHour;
    }
    public static void printConversion(double kiloMetersPerHour)
    {
        if (kiloMetersPerHour<0)
        {
            System.out.println("Invalid value");
        }
        else
        {
            System.out.println(kiloMetersPerHour+" km/h ="+toMilesPerHour(kiloMetersPerHour)+" mi/h");
        }
    }
}
