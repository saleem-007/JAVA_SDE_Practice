package MethodOverLoading;

public class Prog1 {
    static void name(int rollnumber, String name)
    {
        System.out.println(rollnumber+" "+name);
    }

    static void name(String dude)
    {
        System.out.println("kya guru "+dude);
    }

    void Crazy(String d){
        System.out.println("enilla "+d);
    }
    void Crazy(int i){
        System.out.println("en beku "+i);
    }
    public static void main(String[] args) {
        name("Slaeem");
        name(12, "Gujad");
        Prog1 n=new Prog1();
        n.Crazy(5);
        n.Crazy("da");
    }
}
