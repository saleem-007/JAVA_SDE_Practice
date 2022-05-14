package UdemyPractice;

public class MethodChallenge {
    public static void main(String[] args) {
       /* int highScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Saleem", highScore);

        highScore = calculateHighScorePosition(900);
        displayHighScorePosition("Waleed", highScore);

        highScore = calculateHighScorePosition(400);
        displayHighScorePosition("shined", highScore);

        highScore = calculateHighScorePosition(50);
        displayHighScorePosition("Sleep", highScore);

        highScore = calculateHighScorePosition(1000);
        displayHighScorePosition("Sleeper", highScore);
        */
        int highScore = position(1500);
        displayHighScorePosition("Saleem", highScore);

        highScore = position(900);
        displayHighScorePosition("Waleed", highScore);

        highScore = position(400);
        displayHighScorePosition("shined", highScore);

        highScore = position(50);
        displayHighScorePosition("Sleep", highScore);

        highScore = position(1000);
        displayHighScorePosition("Sleeper", highScore);


    }

    public static void displayHighScorePosition(String playersName, int position) {
        System.out.println(playersName + " manage to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }

    }

    public static int position(int playScore) {
        int position = 4;
        if (playScore>=1000)
        {
            position=1;
        }
        else if (playScore>=500)
        {
            position=2;
        }else if (playScore>=100)
        {
            position=3;
        }
        return position;
    }

}




