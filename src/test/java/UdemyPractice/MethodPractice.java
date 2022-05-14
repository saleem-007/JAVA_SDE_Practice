package UdemyPractice;

public class MethodPractice {
    public static void main(String[] args) {
        boolean gameOver=true;
        int score=8000;
        int levelCompleted=5;
        int bonus=100;
        practice(gameOver, score, levelCompleted, bonus);
        prat(true, 5000, 12, 200);

    }
    public static int practice(boolean gameOver, int score, int levelCompleted, int bonus)
    {
        if (gameOver)
        {
            int finalScore=score+(levelCompleted*bonus);
            System.out.println("your final score is "+ finalScore);

        }
        return -1  ;

    }
    public static void prat(boolean gameOver, int score, int levelCompleted, int bonus)
    {
        if (gameOver)
        {
            int finalScore=score+(levelCompleted*bonus);
            System.out.println("your final score is "+ finalScore);

        }
    }

}
