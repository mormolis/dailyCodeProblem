package katas.tennis;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ResultsDisplayerTest {

    @Test
    public void callsFormatResultsToDisplayToTheConsole() {
        TennisResultsFormater tennisResultsFormaterMock = mock(TennisResultsFormater.class);
        Results resultsMock = mock(Results.class);
        ResultsDisplayer resultsDisplayer = new ResultsDisplayer(tennisResultsFormaterMock);

        resultsDisplayer.display(resultsMock);

        verify(tennisResultsFormaterMock).formatResults(resultsMock);
    }

}