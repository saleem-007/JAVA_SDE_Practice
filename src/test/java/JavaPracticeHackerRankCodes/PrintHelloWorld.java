package JavaPracticeHackerRankCodes;

import java.util.Scanner;

public class PrintHelloWorld {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        scan.close();
        System.out.println("Hello, World.");
        System.out.println(input);
    }
}
