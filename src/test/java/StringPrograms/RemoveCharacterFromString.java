package StringPrograms;

public class RemoveCharacterFromString {
    public static void main(String[] args) {
        String x = "We belong to Russia";
        x=x.replace("W", "").replace("b","").replace("o","").replace("s", "");
        System.out.println(x);
    }
}
