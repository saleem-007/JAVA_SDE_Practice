package StringPrograms;

public class ConvertStringIntoInteger {
    public static void main(String[] args) {
        String str = "1234";
        String str1="123";
        int es=Integer.parseInt(str1);
        int result = Integer.parseInt(str); // using Integer.parseInt()
        // int result2 = Integer.valueOf(str); //using Integer.valueOf()

        System.out.println("The converted int is: " + result);
        System.out.println(es);

    }
}
