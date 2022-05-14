package UdemyPractice;

public class LeapYearChallenge {
    public static void main(String[] args) {
        int no =0;
        leapYear(400);
        for (int i=1;i<=20;i++)
        {
            no=i;
            leapYear(no);
        }

    }
    public static void leapYear(int no)
    {
        if (no%4==0||no%100==0||no%400==0)
        {
            System.out.println("Yes it a leap year "+no);
        }
        else {
            System.out.println("No it is not a leap year "+no);
        }
    }
}
