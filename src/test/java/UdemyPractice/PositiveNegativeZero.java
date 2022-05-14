package UdemyPractice;

import java.util.Scanner;

public class PositiveNegativeZero
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        checkNumber(num);

    }

        public static void checkNumber (int num)
        {
            if (num > 0) {
                System.out.println("Positive number");
            } else if (num < 0) {
                System.out.println("Negative number ");
            } else {
                System.out.println("Number is equal to zero");
            }
        }
}


