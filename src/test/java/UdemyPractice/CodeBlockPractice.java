package UdemyPractice;

public class CodeBlockPractice {
    public static void main(String[] args) {
        boolean gameOver=true;
        int score=5000;
        int levelCompleted=5;
        int bonus=100;
        if(score<5000 || score>1000){
            System.out.println("u got less than 5000 and greater than 1000 score");
        }else if (score>1000)
        {
            System.out.println("u got less score");
        }
        else
        {
            System.out.println("Got here");
        }

        if (gameOver){
            int finalScore=score+(levelCompleted*bonus);
            System.out.println("your final score is "+ finalScore);
        }
        score=10000;
        levelCompleted=8;
        bonus=200;
        if (gameOver)
        {
            int finalScore=score+(levelCompleted*bonus);
            System.out.println("your final score is "+ finalScore);
        }

    }
}
