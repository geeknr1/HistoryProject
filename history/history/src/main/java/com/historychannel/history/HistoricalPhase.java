package com.historychannel.history;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.NotBlank;

@Document(collection="historical_phase")
public class HistoricalPhase{
    @Id
    private String id;
    @NotBlank
    private String historicalPhase;

    public HistoricalPhase(){}

    public HistoricalPhase(String phase){
        this.historicalPhase = phase;
    }

    public String getID(){
        return this.id;
    }

    public String getHistoricalPhase(){
        return this.historicalPhase;
    }

    public void setID(String otherID){
        this.id = otherID;
    }

    public void setHitoricalPhase(String otherHistoricalPhase){
        this.historicalPhase = otherHistoricalPhase;
    }
}