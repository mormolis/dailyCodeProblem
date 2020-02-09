package katas.tennis;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TennisGameIntegrationTest {

    private Player player1;
    private Player player2;
    private TennisGame tennisGame;
    private ResultsDisplayer resultsDisplayerMock;

    @Before
    public void setup() {
        player1 = new Player("PlayerOne");
        player2 = new Player("PlayerTwo");
        resultsDisplayerMock = mock(ResultsDisplayer.class);
        tennisGame = new TennisGame(player1, player2, resultsDisplayerMock);
    }

    @Test
    public void playerOneWinsTheGame() {

        player1.winsRound();
        player1.winsRound();
        player2.winsRound();
        player1.winsRound();
        Results expected = new Results(Status.FINISHED, "PlayerOne", "PlayerTwo", Score.FORTY, Score.FIFTEEN);
        expected.setWinner("PlayerOne");

        assertThat(tennisGame.calculateResults(), equalTo(expected));
    }

    @Test
    public void gameHasNotFinishedWhenScoreDifferenceIsMoreThanTwoWhenScoreIsNotFourty() {

        player1.winsRound();
        player1.winsRound();

        assertThat(tennisGame.calculateResults(), equalTo(new Results(Status.ONGOING, "PlayerOne", "PlayerTwo", Score.THIRTY, Score.LOVE)));
    }

    @Test
    public void statusIsONGOINGWhenNonePlayerHasFinished() {
        player1.winsRound();

        assertThat(tennisGame.calculateResults(), equalTo(new Results(Status.ONGOING, "PlayerOne", "PlayerTwo", Score.FIFTEEN, Score.LOVE)));
    }

    @Test
    public void statusIsDEUCEWhenBothPlayersHaveTheSameAmountOfWinsWhenScoreIsForty() {
        player1.winsRound();
        player1.winsRound();
        player1.winsRound();
        player2.winsRound();
        player2.winsRound();
        player2.winsRound();

        assertThat(tennisGame.calculateResults(), equalTo(new Results(Status.DEUCE, "PlayerOne", "PlayerTwo", Score.FORTY, Score.FORTY)));

    }

    @Test
    public void statusIsAdVANTAGEWhenBothPlayersHaveFortyButDifferentAmountOfWins() {
        player1.winsRound();
        player1.winsRound();
        player1.winsRound();

        player2.winsRound();
        player2.winsRound();
        player2.winsRound();
        player2.winsRound();

        assertThat(tennisGame.calculateResults(), equalTo(new Results(Status.ADVANTAGE, "PlayerOne", "PlayerTwo", Score.FORTY, Score.FORTY)));

    }

    @Test
    public void statusIsDAUCEWhenBothPlayersHaveSameAmountOfWinsAbove4() {
        player1.winsRound();
        player1.winsRound();
        player1.winsRound();
        player1.winsRound();

        player2.winsRound();
        player2.winsRound();
        player2.winsRound();
        player2.winsRound();

        assertThat(tennisGame.calculateResults(), equalTo(new Results(Status.DEUCE, "PlayerOne", "PlayerTwo", Score.FORTY, Score.FORTY)));
    }

    @Test
    public void displaysResult(){
        tennisGame.displayResults();

        verify(resultsDisplayerMock).display(any(Results.class));
    }

}