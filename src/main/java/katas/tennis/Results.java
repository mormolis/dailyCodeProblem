package katas.tennis;

import java.util.Objects;

public class Results {
    private Status status;
    private String playerOneName;
    private String playerTwoName;
    private Score playerOneScore;
    private Score playerTwoScore;
    private String winner;

    public Results(Status status, String playerOneName, String playerTwoName, Score playerOneScore, Score playerTwoScore) {
        this.status = status;
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
        this.playerOneScore = playerOneScore;
        this.playerTwoScore = playerTwoScore;
        this.winner = "none";
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getPlayerOneName() {
        return playerOneName;
    }

    public void setPlayerOneName(String playerOneName) {
        this.playerOneName = playerOneName;
    }

    public String getPlayerTwoName() {
        return playerTwoName;
    }

    public void setPlayerTwoName(String playerTwoName) {
        this.playerTwoName = playerTwoName;
    }

    public Score getPlayerOneScore() {
        return playerOneScore;
    }

    public void setPlayerOneScore(Score playerOneScore) {
        this.playerOneScore = playerOneScore;
    }

    public Score getPlayerTwoScore() {
        return playerTwoScore;
    }

    public void setPlayerTwoScore(Score playerTwoScore) {
        this.playerTwoScore = playerTwoScore;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Results results = (Results) o;
        return status == results.status &&
                Objects.equals(playerOneName, results.playerOneName) &&
                Objects.equals(playerTwoName, results.playerTwoName) &&
                playerOneScore == results.playerOneScore &&
                playerTwoScore == results.playerTwoScore &&
                Objects.equals(winner, results.winner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, playerOneName, playerTwoName, playerOneScore, playerTwoScore, winner);
    }
}
