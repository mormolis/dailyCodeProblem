package katas.tennis;

public class TennisGame {

    private Player player1;
    private Player player2;
    private Status status;
    private Results currentResults;
    private ResultsDisplayer resultsDisplayer;

    public TennisGame(Player player1, Player player2, ResultsDisplayer resultsDisplayer) {
        this.player1 = player1;
        this.player2 = player2;
        this.status = Status.ONGOING;
        this.currentResults = new Results(status, player1.getName(), player2.getName(), player1.getScore(), player2.getScore());
        this.resultsDisplayer = resultsDisplayer;
    }

    public Results calculateResults() {

        setPlayersCurrentResults();

        if (differenceInWins() >= 2 && oneOfThePlayersHasReachedForty()) {
            currentResults.setStatus(Status.FINISHED);
            currentResults.setWinner(decideWinner());
        }

        if (isGameDEUCE()) {
            currentResults.setStatus(Status.DEUCE);
        }

        if (differenceInWins() == 1 && bothPlayersHaveScoreForty()) {
            currentResults.setStatus(Status.ADVANTAGE);
        }

        return currentResults;
    }

    public void displayResults(){
        resultsDisplayer.display(currentResults);
    }

    private String decideWinner() {
        if(player1.getWins()>player2.getWins()) {
            return player1.getName();
        }
        return player2.getName();
    }

    private void setPlayersCurrentResults() {
        currentResults.setPlayerOneScore(player1.getScore());
        currentResults.setPlayerTwoScore(player2.getScore());
    }

    private boolean oneOfThePlayersHasReachedForty() {
        return player2.getScore().equals(Score.FORTY) || player1.getScore().equals(Score.FORTY);
    }

    private int differenceInWins() {
        return Math.abs(player1.getWins() - player2.getWins());
    }

    private boolean isGameDEUCE() {
        return player1.getWins() == player2.getWins() && bothPlayersHaveScoreForty();
    }

    private boolean bothPlayersHaveScoreForty() {
        return player1.getScore().equals(Score.FORTY) && player2.getScore().equals(Score.FORTY);
    }
}
