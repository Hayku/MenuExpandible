package com.haykuproductions.menuexpandible;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Hayku on 16/12/2016.
 */

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> PDAM = new ArrayList<String>();
        PDAM.add("Juan");
        PDAM.add("Jose");
        PDAM.add("Pepe");
        PDAM.add("Caranchoa");
        PDAM.add("Manolo");

        List<String> SDAM = new ArrayList<String>();
        SDAM.add("Jose");
        SDAM.add("Natalia");
        SDAM.add("Armando");
        SDAM.add("Javier");
        SDAM.add("Sel");

        expandableListDetail.put("1º DAM", PDAM);
        expandableListDetail.put("2º DAM", SDAM);
        return expandableListDetail;
    }
}
