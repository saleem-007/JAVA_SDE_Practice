package GeekForGeek;

public class PrintFlag {
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            if (i < 5) {
                for (int j = 0; j < 40; j++) {
                    if (j == 1 || j == 2 || j == 3 || j == 4 || j == 5 || j == 0 || j == 6 || j == 7 || j == 8 || j == 9) {
                        System.out.print("*");
                    } else {
                        System.out.print("=");

                    }
                }
                System.out.println();
            }
            else
            {
                for(int x=0; x<40; x++)
                {
                    System.out.print("=");
                }
                System.out.println();
            }
        }
    }
}
