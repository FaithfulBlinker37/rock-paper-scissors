import java.util.*;
/**
 * Each player or team will create their own Player, this is only an example....
 * 
 * Your code MUST INCLUDE a move method with the following signature. To insure that, you must implement
 * the Player interface
 * 
 * You can create additional methods but must have the move method
 * 
 */
public class SixthPeriodWangJonah implements Player
{
    private static String name = "FaithfulBlinker37";
    /**
     * An example of a method - replace this comment with your own
     * 
     * 
     * You must create some kind of logic of what to play against your opponent...start thinking!
     * 
     * @return      the move you want to play against opponent
     *              "r" - rock
     *              "p" - paper
     *              "s" - scissors
     *              anything else - forfeit the turn
     */
    public String move(String[] myMoves, String[] opponentMoves, int myScore, int opponentScore) {
        if (opponentMoves == null || opponentMoves.length == 0) {
            return "r";
        }

        int rockCount = 0, paperCount = 0, scissorsCount = 0;
        for (String move : opponentMoves) {
            if ("r".equals(move)) rockCount++;
            else if ("p".equals(move)) paperCount++;
            else if ("s".equals(move)) scissorsCount++;
        }

        String predictedMove;
        if (rockCount >= paperCount && rockCount >= scissorsCount) {
            predictedMove = "r";
        } else if (paperCount >= rockCount && paperCount >= scissorsCount) {
            predictedMove = "p";
        } else {
            predictedMove = "s";
        }


        if ("r".equals(predictedMove)) return "p"; 
        if ("p".equals(predictedMove)) return "s"; 
        return "r";
    }
    /**
     * Returns the name of the player
     * 
     * @return      the name of the player              
     */
    public String getName()
    {
        return name;
    }
}

