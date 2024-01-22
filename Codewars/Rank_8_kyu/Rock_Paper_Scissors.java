package Rank8kyu;

import java.util.Objects;

/**
 * ClassName: Rock_Paper_Scissors
 * Description:
 * Rock Paper Scissors
 * * Let's play! You have to return which player won! In case of a draw return Draw!.
 * * Examples(Input1, Input2 --> Output):
 * * "scissors", "paper" --> "Player 1 won!"
 * "scissors", "rock" --> "Player 2 won!"
 * "paper", "paper" --> "Draw!"
 * Rank: 8 kyu
 * @Author: Evance
 * @Create: 2024/1/12-下午 01:56
 */
public class Rock_Paper_Scissors {
    public class Kata {
        public static String rps(String p1, String p2) {
            String result ="";
            if ((p1.equals("scissors") && p2.equals("paper"))||
                    (p1.equals("paper")&& p2.equals("rock"))||
                    (p1.equals("rock")&& p2.equals("scissors"))){
                result = "Player 1 won!";
            }else if ((p2.equals("scissors") && p1.equals("paper"))||
                    (p2.equals("paper")&& p1.equals("rock"))||
                    (p2.equals("rock")&& p1.equals("scissors"))){
                result = "Player 2 won!";
            }else if(p1.equals(p2)){
                result = "Draw!";
            }
            return result;
        }
    }
}