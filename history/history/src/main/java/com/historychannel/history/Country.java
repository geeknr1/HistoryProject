import java.util.ArrayList;

public class Country{
    private String countryName;
    private String geography;
    private ArrayList<String> currentLeaders;
    private Mithology mithology;
    private TrueHistory trueHistory;

    public Country(String name, String geo, Mithology mith, TrueHistory trueH){
        this.countryName = name;
        this.geography = geo;
        currentLeaders = new ArrayList<>();
        this.mithology = mith;
        this.trueHistory = trueH;
    }

    public String getName(){
        return this.countryName;
    }

    public String getGeography(){
        return this.geography;
    }

    public Mithology getMithology(){
        return this.mithology;
    }

    public TrueHistory getTrueHistory(){
        return this.trueHistory;
    }

    public void setName(String otherCountryName){
        this.countryName = otherCountryName;
    }

    public void setGeography(String otherGeography){
        this.geography = otherGeography;
    }

    public void setMithology(Mithology otherMithology){
        this.mithology = otherMithology;
    }

    public void setTrueHistory(TrueHistory otherTrueHistory){
        this.trueHistory = otherTrueHistory;
    }

    public void addLeader(String leaderName){
        currentLeaders.add(leaderName);
    }

    public void removeLeader(String leaderName){
        currentLeaders.remove(leaderName);
    }
}