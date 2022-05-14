package JavaPracticeHackerRankCodes;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans = "";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if (n % 2 == 1) {
            ans = "Weird";  //when n is odd only that time ans will get updated to weired
        } else { //else part will get executed when n is even
            if (n >= 6 && n <= 20) { //condition says if n is more than 6 and less than 20 (only even number)
                System.out.println("Weird");//print wierd
            } else {                        // if number is odd
                System.out.println("Not Weird");

            }
        }
        System.out.println(ans);
    }
    }

