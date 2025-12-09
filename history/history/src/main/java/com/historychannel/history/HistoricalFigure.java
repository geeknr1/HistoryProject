package com.historychannel.history;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.NotBlank;

@Document(collection="historical_figures")
public class HistoricalFigure{
    @Id 
    private String id;
    @NotBlank
    private String figureName;
    private String earlyLife;
    private String lifeStory;
    private String death;

    public HistoricalFigure(){}

    public HistoricalFigure(String name, String life, String story, String death){
        this.figureName = name;
        this.earlyLife = life;
        this.lifeStory = story;
        this.death = death;
    }

    public String getID(){
        return this.id;
    }

    public String getFigureName(){
        return this.figureName;
    }

    public String getEarlyLife(){
        return this.earlyLife;
    }

    public String getLifeStory(){
        return this.lifeStory;
    }

    public String getDeath(){
        return this.death;
    }

    public void setID(String otherID){
        this.id = otherID;
    }

    public void setFigureName(String otherName){
        this.figureName = otherName;
    }

    public void setEarlyLife(String otherEarlyLife){
        this.earlyLife = otherEarlyLife;
    }

    public void setLifeStory(String otherLifeStory){
        this.lifeStory = otherLifeStory;
    }

    public void setDeath(String otherDeath){
        this.death = otherDeath;
    }
}