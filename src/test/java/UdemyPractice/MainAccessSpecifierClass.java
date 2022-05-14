package UdemyPractice;

public class MainAccessSpecifierClass {
    public static void main(String[] args) {
        ExampleOfAccessSpecifier porsche=new ExampleOfAccessSpecifier();
        porsche.setModel("Carrera");
        System.out.println("Model is "+porsche.getModel());
        porsche.setModel("Mercedes");
        System.out.println("Model is "+porsche.getModel());
    }
}
