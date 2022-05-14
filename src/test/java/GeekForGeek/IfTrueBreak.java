package GeekForGeek;

public class IfTrueBreak {
    //What will be the Output of the below code:
    public static void main(String[] args)
    {
        ifTrueBreak();
        characterProb();
        $();
        NumberRef();
    }

    static void ifTrueBreak()
    {
        /*
        if (true)
            break;  */
        /*Break statement can only be used with loop or switch.
     So, using break with if statement causes “break outside switch or loop” error.*/
    }

    static void characterProb()
    {
        System.out.println('j' + 'a' + 'v' + 'a');
        /*Choices:
               a) java
               b) Something else (Other than simple concatenation)
Answer: b) Something else (Other than simple concatenation)
Reason: “java” would be printed if String literals (in double quotes) are used,
but in the question since character literals has been used, these won’t be concatenated.
Therefore After execution of the program, an addition of each equivalent ASCII(Unicode)
value of the character will be obtained.
Hence the output is 106 + 97 + 118 + 97 = 418*/
    }

    static void $()
    {
        int $_ = 5;
        /*Choices:
a) Nothing
b) Error
Answer: a) Nothing
Reason: It looks like $ will cause an error, but it won’t. In java, identifier rule says,
identifier can start with any alphabet or underscore (“_”) or dollar (“$”). So answer is Nothing.*/
    }
static void NumberRef()
{
    Integer num1=500;
    Integer num2=500;

    if (num1==num2)
        System.out.println("num1==num2");
    else
        System.out.println("nope");
    /*Answer: b)num1 == num2
                  num3 != num4
Reason: We always thought that whenever two object references are compared using “==”,
it always evaluates to “false”. But here Integer caching changes the results.
Integer class has a caching range of -128 to 127. Whenever a number is between this range and
 autoboxing is used, it assigns the same reference. That’s why for value 100,
  both num1 and num2 will have the same reference,
 but for the value 500 (not in the range of -128 to 127), num3 and num4 will have different reference.*/
}
/*public class Demo{
    public static void main(String[] arr){

    }
    public static void main(String arr){

    }
}
a) Nothing
b) Error
Answer: a) Nothing
Reason: We can overload main() too. But JVM will always call main() that has String[] argument.*/

}

