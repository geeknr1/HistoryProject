public class HistoricalFigure{
    private String figureName;
    public String earlyLife;
    public String lifeStory;
    public String death;

    public HistoricalContribution(String name, String life, String story, String death){
        this.figureName = name;
        this.earlyLife = life;
        this.lifeStory = story;
        this.death = death;
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