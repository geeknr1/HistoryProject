import java.util.ArrayList;

public class Mithology{
    private ArrayList<String> deities;
    private ArrayList<String> stories;

    public Mithology(){
        deities = new ArrayList<>();
        stories = new ArrayList<>();
    }

    public void addDeities(String deityName){
        deities.add(deityName);
    }

    public void removeDeities(String deityName){
        deities.remove(deityName);
    }
}