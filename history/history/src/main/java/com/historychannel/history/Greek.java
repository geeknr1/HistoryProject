package com.historychannel.history;

import java.util.ArrayList;

public class Greek extends Mithology{
    private ArrayList<String> greekTemplePriestNames; 

    public Greek()  {
        super();
        greekTemplePriestNames = new ArrayList<>();
    }

    public void addGreekPriestNames(String templePriestName){
        greekTemplePriestNames.add(templePriestName);
    }

    public void removeGreekPriestNames(String templePriestName){
        greekTemplePriestNames.remove(templePriestName);
    }
}