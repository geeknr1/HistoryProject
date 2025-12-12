package com.historychannel.history;

import java.util.ArrayList;

public class Norse extends Mithology{
    private ArrayList<String> norseDruidNames; 

    public Norse()  {
        super();
        norseDruidNames = new ArrayList<>();
    }

    public void addDruids(String druidName){
        norseDruidNames.add(druidName);
    }

    public void removeDruids(String druidName){
        norseDruidNames.remove(druidName);
    }

}