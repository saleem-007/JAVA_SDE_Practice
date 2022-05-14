package MethodOverRiding;

public class MainClass {
    public static void main(String[] args) {
        Prog1 n=new Prog2();
        n.name();
        Prog1 n1= new Prog1();
        n1.name();
    }
}
