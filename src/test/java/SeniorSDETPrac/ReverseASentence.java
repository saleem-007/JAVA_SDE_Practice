package SeniorSDETPrac;

public class ReverseASentence {
    public static void main(String[] args) {
        System.out.println(reverse("The sky is blue"));
    }
    //July 15 2k25
    public static String reverse(String s){
        String [] split=s.trim().split(" +");
        StringBuilder res= new StringBuilder();
        for (int i=split.length-1;i>=0;i--){
            res.append(split[i]).append(" ");
        }
        return res.toString();
    }
}
