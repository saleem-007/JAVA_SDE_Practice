package GeekForGeek;

public class FIzzBuzz {
    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 15;
        for (int i = 1; i <= number1; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
        for (int j = 1; j <= number2; j++) {
            if (j % 3 == 0 && j % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (j % 3 == 0)  {
                System.out.println("Fizz");

            } else if (j % 5 == 0) {
                System.out.println("Buzz");

            } else {
                System.out.println(j);
            }

        }

    }
}
