package katas.tennis;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class TennisResultsFormaterTest {

    TennisResultsFormater tennisResultsFormater;

    @Before
    public void setup(){
        tennisResultsFormater = new TennisResultsFormater();
    }

    @Test
    public void returnsAFormatedStringWithTheResults() {
        Results results = new Results(Status.ONGOING, "Yorgos","Emily", Score.LOVE, Score.FIFTEEN);

        String formatedResults = tennisResultsFormater.formatResults(results);

        assertThat(formatedResults, equalTo("Game ONGOING, Score: LOVE - FIFTEEN"));
    }

    @Test
    public void announcesTheWinner(){
        Results results = new Results(Status.FINISHED, "Yorgos","Emily", Score.LOVE, Score.FORTY);
        results.setWinner("Emily");

        String formatedResults = tennisResultsFormater.formatResults(results);

        assertThat(formatedResults, equalTo("Game FINISHED, Score: LOVE - FORTY, Winner: Emily"));

    }

}