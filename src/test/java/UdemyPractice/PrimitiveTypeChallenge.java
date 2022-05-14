package UdemyPractice;

public class PrimitiveTypeChallenge {
    public static void main(String[] args) {
        double d=9.29;
        int g=(int)(d);
        System.out.println(g);

        short sh=Short.MAX_VALUE;
        short sh1=Short.MIN_VALUE;
        System.out.println(sh);
        System.out.println(sh1);
        byte bu=Byte.MAX_VALUE;
        byte by=Byte.MIN_VALUE;
        System.out.println(bu);
        System.out.println(by);
        long l= (long) (g+d);
        short df=13;
        double dg=l+df;
        System.out.println(dg);

        //float and double challenge
        double pounds=5500;
        double convertKiloGram=pounds*0.45359237;
        double inKG=convertKiloGram/1000;
        System.out.println("converted into kilo gram= "+convertKiloGram);
        System.out.println("converted into kg= "+inKG);


    }
}
