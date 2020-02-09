package katas.tennis;

public class Player {
    private String name;
    private Score score;
    private int wins;

    public Player(String name) {
        this.name = name;
        score = Score.LOVE;
        wins = 0;
    }

    public void winsRound() {
        wins++;
        if(score.ordinal() < 3){
            score = Score.values()[score.ordinal() + 1];
        }
    }

    public Score getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }
}
