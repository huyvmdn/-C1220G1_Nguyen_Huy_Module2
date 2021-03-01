package _09_clean_code.bai_tap.bai_tap;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        StringBuilder message = new StringBuilder();
        int tempScore;
        boolean checkScore =scorePlayer1 == scorePlayer2;
        boolean checkScore2=scorePlayer1 >= 4 || scorePlayer2 >= 4;
        if (checkScore) {
            switch (scorePlayer1) {
                case 0:
                    message = new StringBuilder("Love-All");
                    break;
                case 1:
                    message = new StringBuilder("Fifteen-All");
                    break;
                case 2:
                    message = new StringBuilder("Thirty-All");
                    break;
                case 3:
                    message = new StringBuilder("Forty-All");
                    break;
                default:
                    message = new StringBuilder("Deuce");
                    break;

            }
        } else if (checkScore2) {
            int minusResult = scorePlayer1 - scorePlayer2;
            if (minusResult == 1) message = new StringBuilder("Advantage player1");
            else if (minusResult == -1) message = new StringBuilder("Advantage player2");
            else if (minusResult >= 2) message = new StringBuilder("Win for player1");
            else message = new StringBuilder("Win for player2");
        } else {
            int numberOfPlayers =2;
            for (int i = 1; i <= numberOfPlayers; i++) {
                if (i == 1) tempScore = scorePlayer1;
                else {
                    message.append("-");
                    tempScore = scorePlayer2;
                }
                switch (tempScore) {
                    case 0:
                        message.append("Love");
                        break;
                    case 1:
                        message.append("Fifteen");
                        break;
                    case 2:
                        message.append("Thirty");
                        break;
                    case 3:
                        message.append("Forty");
                        break;
                }
            }
        }
        return message.toString();
    }
}

