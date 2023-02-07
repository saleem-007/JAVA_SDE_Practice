package StringPrograms;

public class ReverseStringWithoutUsing3rdVariable {
    public static void main(String[] args) {
        String str1="Saleem";
        String str2="Guleemu";
        str1=str1+str2;
        str2=str1.substring(0, str1.length()-str2.length());
        str1=str1.substring(str2.length());
        System.out.println(str2);
        System.out.println(str1);
    }
}
