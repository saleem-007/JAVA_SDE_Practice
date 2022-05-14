package GeekForGeek;

public class PrintFace {
    public static void main(String[] args) {
        String[] array = new String[5];
        array[0] = " +\"\"\"\"\"+";
        array[1] = "[| o o |]";
        array[2] = " |  ^  |";
        array[3] = " | '-' |";
        array[4] = " +-----+";
        for (String i : array){
            System.out.println(i);
        }

    }
}
