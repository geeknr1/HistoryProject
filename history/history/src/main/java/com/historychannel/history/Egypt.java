package com.historychannel.history;

import java.util.ArrayList;

public class Egypt extends Mithology{
    private ArrayList<String> egyptianTemplePriestNames; 
    public Egypt()  {
        super();
        egyptianTemplePriestNames = new ArrayList<>();
    }

    public void addEgyptianPriestNames(String egyptianTemplePriestName){
        egyptianTemplePriestNames.add(egyptianTemplePriestName);
    }

    public void removeEgyptianPriestNames(String egyptianTemplePriestName){
        egyptianTemplePriestNames.remove(egyptianTemplePriestName);
    }
}