package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        String playerName = "Paul";
        int highScorePosition = 0;
        int playerScore = 1500;
        highScorePosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, highScorePosition, playerScore);

        playerName = "John";
        playerScore = 900;
        highScorePosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, highScorePosition, playerScore);

        playerName = "George";
        playerScore = 400;
        highScorePosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, highScorePosition, playerScore);

        playerName = "Ringo";
        playerScore = 50;
        highScorePosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, highScorePosition, playerScore);

        playerName = "Pete";
        playerScore = 1000;
        highScorePosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, highScorePosition, playerScore);
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        if (gameOver) {
//            //if (gameOver == true) {
//            int finalScore = score + (levelCompleted * bonus); // access variables from outside code block
//            System.out.println("Your final score was " + finalScore);
//        }
    }

//        if (score == 4000)  //OK not to have a CODE BLOCK if only 1 line follows
//            System.out.println("Your score was 5000");
//        System.out.println("Your score was 4000"); //When FALSE, the 2nd line prints
//
//        if (score == 5000) { //Using Code Blocks
//            System.out.println("Your score was 5000");
//        }
//
//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater that 1000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here!");
//        }

//        if (gameOver) {
//        //if (gameOver == true) {
//            int finalScore = score + (levelCompleted * bonus); // access variables from outside code block
//            System.out.println("Your final score was " + finalScore);
//            score = 10000;
//            levelCompleted = 8;
//            bonus = 200;
//            finalScore = score + (levelCompleted * bonus); // access variables from outside code block
//            System.out.println("Your final score was " + finalScore);

//        }
        // int savedFinalScore = finalScore; //SCOPE - can't access variables created within code block

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    //public static void calculateScore() {
//        boolean gameOver = true;
//        int score = 4000; //changes here
//        int levelCompleted = 5;
//        int bonus = 100;
        if (gameOver) {
            //if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus); // access variables from outside code block
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) { // already know less than 1000 >remove>  && playerScore < 1000) {
//            return 2;
//        } else if (playerScore >= 100) { // already know less than 1000 >remove>  && playerScore < 500) {
//            return 3;
//        } // no need for else >remove> else {
//            return 4;
        int position = 4; // assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
                position = 2;
        } else if (playerScore >= 100) {
                    position = 3;
        }
        return position;
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition, int playerScore) {
        System.out.println(playerName + " managed to get into position " + highScorePosition +
                " on the high score table. (" + playerScore + ")");
    }
}