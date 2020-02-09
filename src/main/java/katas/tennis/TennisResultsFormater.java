package katas.tennis;

public class TennisResultsFormater {


    public String formatResults(Results results) {
        StringBuilder sb = new StringBuilder();
        sb.append("Game ")
                .append(results.getStatus())
                .append(", Score: ")
                .append(results.getPlayerOneScore())
                .append(" - ")
                .append(results.getPlayerTwoScore());
        if (results.getStatus().equals(Status.FINISHED)){
            sb.append(", Winner: ")
                    .append(results.getWinner());
        }
        return sb.toString();
    }
}
