public class MethodChallenge {
   public static void main(String[] args){
    int highScorePosition = calculateHighScorePosition(1800);
    displayHighScorePosition("Bob", highScorePosition);

    highScorePosition = calculateHighScorePosition(550);
    displayHighScorePosition("Tim", highScorePosition);

     highScorePosition = calculateHighScorePosition(279);
    displayHighScorePosition("Bisi", highScorePosition);

    highScorePosition = calculateHighScorePosition(90);
    displayHighScorePosition("Bola", highScorePosition);
   }

   public static void displayHighScorePosition(String playerName, int position){
    System.out.println(playerName + " managed to get into position " + position +
             " on the highscore list");
}

public static int calculateHighScorePosition(int playerScore){
    if (playerScore >= 1000){
        return 1;
    }
    else if (playerScore >= 500 && playerScore < 1000){
        return 2;
    }
    else if (playerScore >= 250 && playerScore < 500){
        return 3;
    }
    else{
        return 4;
    }
}

}


