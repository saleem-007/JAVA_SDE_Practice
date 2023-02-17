package StringPrograms.InterviewPrograms.practice;

public class RemoveDuplicatesFromStringUsingIndexOf {
    public static void main(String[] args) {
//        String str="geeksforgeeks";
//        String str1=new String();
//        for(int i=0;i<str.length();i++)
//        {
//            char c=str.charAt(i);
//            if(str1.indexOf(c)<0)
//            {
//                str1+=c;
//            }
//        }
//        System.out.println(str1);
//  }
        String str = "geeksforgeeks";
        String str1 = new String();
        String sm=new String();
        for (int i = 0; i < str.length(); i++)
        {
            char c=str.charAt(i);
            if(str1.indexOf(c)<0)
            {
                str1+=c;
            }
            else {
                sm+=c;
            }
        }
        System.out.println(str1);
        System.out.println(sm);
    }
}
