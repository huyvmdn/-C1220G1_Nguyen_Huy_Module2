package _09_CleanCode.bai_tap.bai_tap;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String message = "";
        int tempScore;
        boolean checkScore =scorePlayer1 == scorePlayer2;
        boolean checkScore2=scorePlayer1 >= 4 || scorePlayer2 >= 4;
        if (checkScore) {
            switch (scorePlayer1) {
                case 0:
                    message = "Love-All";
                    break;
                case 1:
                    message = "Fifteen-All";
                    break;
                case 2:
                    message = "Thirty-All";
                    break;
                case 3:
                    message = "Forty-All";
                    break;
                default:
                    message = "Deuce";
                    break;

            }
        } else if (checkScore2) {
            int minusResult = scorePlayer1 - scorePlayer2;
            if (minusResult == 1) message = "Advantage player1";
            else if (minusResult == -1) message = "Advantage player2";
            else if (minusResult >= 2) message = "Win for player1";
            else message = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = scorePlayer1;
                else {
                    message += "-";
                    tempScore = scorePlayer2;
                }
                switch (tempScore) {
                    case 0:
                        message += "Love";
                        break;
                    case 1:
                        message += "Fifteen";
                        break;
                    case 2:
                        message += "Thirty";
                        break;
                    case 3:
                        message += "Forty";
                        break;
                }
            }
        }
        return message;
    }
}

