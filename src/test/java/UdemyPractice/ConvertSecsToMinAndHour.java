package UdemyPractice;

public class ConvertSecsToMinAndHour {
    public static void main(String[] args){
      convert(1);
        convert(3871, 50);
        convert(-21, 0);
        convert(1, 90);

    }
    public static void convert(int sec) {
        if (sec < 0) {
            System.out.println("Invalid Value");
        } else {
            float hours = (float) sec / 3600;
            System.out.println("Converted seconds into hours and the value is "+hours+" hours");
        }
    }
    public static void convert(int sec, int min)
    {

        if (sec<0)
        {
            System.out.println("Invalid Second Value");
        }else {
            float secondsIntoHours = (float) sec / 3600;
            System.out.println("Converted seconds into hours and the value is "+secondsIntoHours+" hours");
        }


        if (min<0)
        {
            System.out.println("Invalid Min Value");
        }
        {
            float minIntoHours=(float) min/60;
            System.out.println("Converted minutes into hours and the value is "+minIntoHours+" hours");
        }
    }
}
