package katas.tennis;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void winRoundsIncreaseTheScore(){
        Player player = new Player("Yorgos");

        player.winsRound();

        assertThat(player.getScore(), equalTo(Score.FIFTEEN));
    }

    @Test
    public void winRoundsCannotIncreaseTheScoreBeyond40(){
        Player player = new Player("Yorgos");

        player.winsRound();
        player.winsRound();
        player.winsRound();
        player.winsRound();
        player.winsRound();

        assertThat(player.getScore(), equalTo(Score.FORTY));
    }
}