package Collection;

public class SplitFunction {
    public static void main(String[] args) {
        String str="Salman malhotra enappa guru";
        String[] token = str.split(" ");
        //used split method to print in reverse order
        //for (int i=token.length-1;i>=0;i--)
        for (int i=token.length-1;i>=0;i--)
            System.out.print(token[i]+" ");
    }
}
