package GeekForGeek;

public class LeftShiftOperator {
    public static void main(String[] args) {
        byte m=64;
        int g= m >> 2;
        System.out.println(g+" m value");
        byte x = 64;
        int i;
        byte y;
        i = x << 2;
        System.out.println(i+" i value");

        y = (byte) (x << 2);
        System.out.println(y+" y value");
        System.out.print(i + " " + y);
        System.out.println("");


    }
}
