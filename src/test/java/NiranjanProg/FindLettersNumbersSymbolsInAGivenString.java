package NiranjanProg;

public class FindLettersNumbersSymbolsInAGivenString {
    public static void main(String[] args) {
        String str = "Password@123";
        char[]arr=str.toCharArray();
        int letters=0;
        int numbers=0;
        int symbols=0;
        for (char c : arr)
        {
            if ((c>='a'&& c<='z')||(c>='A'&& c<='Z'))
                letters++;
            else if (c>='0'&&c<='9')
                numbers++;
            else
                symbols++;
        }
        System.out.println("letters count "+letters+" number count "+numbers+" symbols count "+symbols);
        /*char[] arr = str.toCharArray();
        int letters = 0;
        int digits = 0;
        int symbols = 0;
        for (char c : arr) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
                letters++;
            else if (c >= '0' && c <= '9')
                digits++;
            else
                symbols++;
        }
        System.out.println("Number if letters in given String: " + letters);
        System.out.println("Number if digits in given String: " + digits);
        System.out.println("Number if symbols in given String: " + symbols);
    }*/
    }
}


