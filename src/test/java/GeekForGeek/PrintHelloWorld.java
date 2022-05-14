package GeekForGeek;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrintHelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world\nSaleem M");
       /* Scanner input=new Scanner(System.in);
        System.out.print("Input your first name: ");
        String fname=input.next();
        System.out.println("Input your last name: ");
        String lname=input.next();
        System.out.println();
        System.out.println("Hello \n"+fname+" "+lname);*/

        /*Scanner input=new Scanner(System.in);
        System.out.println("Input your First name: ");
        String fname=input.next();
        System.out.println("Input your last name: ");
        String lname=input.next();
        System.out.println("Hello \n"+fname+" "+lname);*/

        Scanner input=new Scanner(System.in);
        System.out.println("Input your first name: ");
        String fname= input.next();
        System.out.println("Input ypur last name: ");
        String lname=input.next();
        System.out.println("Hello \n"+fname+" "+lname);
    }
}
