package katas.tennis;

public enum Score {
    LOVE(0),
    FIFTEEN(15),
    THIRTY(30),
    FORTY(40);

    private int points;
    Score(int points) {
        this.points = points;
    }
}
