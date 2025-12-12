package com.historychannel.history;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.NotBlank;

import java.util.ArrayList;

@Document(collection="true_history")
public class TrueHistory{
    @Id
    private String id;
    @NotBlank
    private String historyInANutshell;
    private ArrayList<String> funFacts;
    private ArrayList<HistoricalFigure> historicalFigures;
    private ArrayList<HistoricalPhase> historicalPhases;
    private ArrayList<HistoricalContribution> historicalContributions;

    public TrueHistory() {}

    public TrueHistory(String inANutshell){
        this.historyInANutshell = inANutshell;
        funFacts = new ArrayList<>();
        historicalFigures = new ArrayList<>();
        historicalPhases = new ArrayList<>();
        historicalContributions = new ArrayList<>();
    }

    public String getID(){
        return this.id;
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

    public void setID(String otherID){
        this.id = otherID;
    }
}