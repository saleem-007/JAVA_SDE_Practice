package UdemyPractice;

public class MainSimpleCalculator {
    public static void main(String[] args) {
        SimpleCalculator calculator=new SimpleCalculator();
        calculator.setFirstNumber(256);
        calculator.setSecondNumber(65);
        System.out.println("add= "+calculator.getAdditionResult());
        System.out.println("Substitution= "+calculator.getSubtractionResult());
        calculator.setFirstNumber(45);
        calculator.setSecondNumber(15);
        System.out.println("Multiplication= "+calculator.getMultiplicationResult());
        System.out.println("Division= "+calculator.getDivisionResult());
    }
}
