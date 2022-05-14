package UdemyPractice;

public class SimpleCalculator {
    private double firstNumber, secondNumber;

    public double getFirstNumber()
    {
     return this.firstNumber;
    }
    public double getSecondNumber()
    {
     return this.secondNumber;
    }
    public void setFirstNumber(double firstNumber)
    {
        this.firstNumber=firstNumber;
    }
    public void setSecondNumber(double secondNumber)
    {
       this.secondNumber=secondNumber;
    }
    public double getAdditionResult()
    {
        return this.firstNumber+this.secondNumber;
    }
    public double getSubtractionResult()
    {
        return this.firstNumber-this.secondNumber;
    }
    public double getMultiplicationResult()
    {
        return this.firstNumber*this.secondNumber;
    }
    public double getDivisionResult()
    {
        double result;
        if (this.secondNumber==0)return 0;
        else {
             result = this.firstNumber / this.secondNumber;
        };
        return result;

    }

}
