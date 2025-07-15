package SeniorSDETPrac;

public class FindCharacterCountOfTheLastWordOfTheSentence {
    public static void main(String[] args) {
        String str=" Find the moon ";
        System.out.println(lastWordCharCount(str));

    }
    public static int lastWordCharCount(String sentence){
        int count=0;
        sentence=sentence.trim();
        for (int i=sentence.length()-1;i>=0;i--){
            if (sentence.charAt(i)!=' '){
                count++;
            }else {
                break;
            }
        }
        return count;
    }
}
