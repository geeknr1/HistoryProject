package com.historychannel.history;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.NotBlank;

import java.util.ArrayList;

@Document(collection="mythology")
public class Mithology{
    @Id
    private String id;
    @NotBlank
    private String deityName;
    private ArrayList<String> deities;
    private ArrayList<String> stories;

    public Mithology() {}

    public Mithology(String name){
        this.deityName = name;
        deities = new ArrayList<>();
        stories = new ArrayList<>();
    }

    public String getDeityName(){
        return this.deityName;
    }

    public String getID(){
        return this.id;
    }

    public void setID(String otherID){
        this.id = otherID;
    }

    public void addDeities(String deityName){
        deities.add(deityName);
    }

    public void removeDeities(String deityName){
        deities.remove(deityName);
    }

    public ArrayList<String> getAllDeities(){
        return deities;
    }
}