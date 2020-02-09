package katas.tennis;

public class ResultsDisplayer {

    TennisResultsFormater tennisResultsFormater;

    public ResultsDisplayer(TennisResultsFormater resultsFormater){
        this.tennisResultsFormater = resultsFormater;
    }

    public void display(Results results){
        System.out.println(tennisResultsFormater.formatResults(results));
    }
}
