package GeekForGeek;

public class AppendXYZtoA {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = s1;
        s1 += "d";
        System.out.println(s1 + " " + s2 + " " + (s1 == s2));

        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = sb1;
        sb1.append("d");
        sb1.append("Saleem");
        sb1.append('M');
        System.out.println(sb1 + " " + sb2 + " " + (sb1 == sb2));

        short x=5;
        int v=3;
        x +=v;
        System.out.println(x);


    }
}
