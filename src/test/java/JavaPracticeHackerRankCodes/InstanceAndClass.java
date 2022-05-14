package JavaPracticeHackerRankCodes;

import java.util.Scanner;

public class InstanceAndClass {
    private int age;
    public InstanceAndClass(int initialAge)
    {
        if (initialAge<0)
        {

            System.out.println("Age is not valid, setting age to 0.");

        }
        this.age=initialAge;
    }
    public void yearPasses()
    {
        this.age++;
        this.age++;
        this.age++;
    }
    public void amIOld()
    {
        if(age<13)
        {
            System.out.println("You are young..");
        }
        else if (age>=13&&age<18)
        {
            System.out.println("You are a teenager..");
        }
        else {
            System.out.println("You are old..");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer ger= sc.nextInt();

        InstanceAndClass iv=new InstanceAndClass(ger);
        iv.amIOld();

        iv.yearPasses();
        iv.amIOld();

    }

}
