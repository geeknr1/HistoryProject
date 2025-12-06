import java.util.ArrayList;

public class TrueHistory{
    private String historyInANutshell;
    private ArrayList<String> funFacts;
    private ArrayList<HistoricalFigure> historicalFigures;
    private ArrayList<HistoricalPhase> historicalPhases;
    private ArrayList<HistoricalContribution> historicalContributions;

    public TrueHistory(String inANutshell){
        this.historyInANutshell = inANutshell;
        funFacts = new ArrayList<>();
        historicalFigures = new ArrayList<>();
        historicalPhases = new ArrayList<>();
        historicalContributions = new ArrayList<>();
    }

    public String getHistory(){
        return this.historyInANutshell;
    }

    public void setHistory(String otherHistory){
        this.historyInANutshell = otherHistory;
    }

    public void addFunFacts(String funFact){
        funFacts.add(funFact);
    }

    public void removeFunFacts(String funFact){
        funFacts.remove(funFact);
    }
}