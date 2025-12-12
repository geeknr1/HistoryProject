package com.historychannel.history;

public class HistoricalContribution{
    private String contribution;

    public HistoricalContribution() {}

    public HistoricalContribution(String contribution){
        this.contribution = contribution;
    }

    public String getContribution(){
        return this.contribution;
    }

    public void setContribution(String otherContribution){
        this.contribution = otherContribution;
    }
}