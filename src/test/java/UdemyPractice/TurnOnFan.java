package UdemyPractice;

public class TurnOnFan {
    public static void main(String[] args) {
        for (int i=0;i<24;i++)
        {
            TurnON(true, i);
        }
    }

    public static void TurnON(boolean isFanRunning, int time) {
        if (time < 0 || time > 23)
        {
            System.out.println("Fan is off");
        } else if ((time >= 22 || time <= 7) && isFanRunning)
        {
            System.out.println("fan is on at " + time);
        } else
        {
            System.out.println("Fan is off at " + time);
        }

    }
}
