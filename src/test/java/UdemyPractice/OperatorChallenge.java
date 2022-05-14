package UdemyPractice;

public class OperatorChallenge {
    public static void main(String[] args) {
        double isDouble=20d;
        double isTooDouble=80d;
        double result=isDouble+isTooDouble*100d;
        int intResult=(int)result%40;
        System.out.println(""+intResult);
        boolean isBoo=intResult==0?true:false;
        System.out.println(isBoo);
        if (!isBoo)
        {
            System.out.println("Got some remainder \u00A9 2009");
        }
        System.out.println("\u00A9");

    }
}
