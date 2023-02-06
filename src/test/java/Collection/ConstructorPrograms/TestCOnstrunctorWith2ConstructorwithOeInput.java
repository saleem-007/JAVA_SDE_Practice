package Collection.ConstructorPrograms;

public class TestCOnstrunctorWith2ConstructorwithOeInput {
    TestCOnstrunctorWith2ConstructorwithOeInput(int a, int b)
    {
        System.out.println("1 "+"a = "+a+" b = "+b);
    }
    TestCOnstrunctorWith2ConstructorwithOeInput(int a, float b)
    {
        System.out.println("2 "+"a = "+a+" b = "+b);
    }
    public static void main(String[] args) {
        byte a = 10;
        byte b = 15;
        TestCOnstrunctorWith2ConstructorwithOeInput ts=new TestCOnstrunctorWith2ConstructorwithOeInput(a, b );
    }

}
