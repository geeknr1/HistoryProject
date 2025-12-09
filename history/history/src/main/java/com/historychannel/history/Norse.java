package com.historychannel.history;

import java.util.ArrayList;

public class Norse extends Mithology{
    private ArrayList<String> norseDruidNames; 
    public Norse()  {
        super();
        norseDruidNames = new ArrayList<>();
    }

    public void addDruids(String druidName){
        deities.add(druidName);
    }

    public void removeDruids(String druidName){
        deities.remove(druidName);
    }

}