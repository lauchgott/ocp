package wbs.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.*;
import java.util.stream.Collectors;

public class GroupingByDemo{


    public static void main(String[] args) {




HashMap<String, String> ideen =  new HashMap<>();
//        ideen.put("Singer", "Animal Liberation");
//        ideen.put("Heidegger","Sein und Zeit");
//
//        Map<String, Collection<String>> inverted = new HashMap<>();
//        inverted = MapUtil.invertMap(ideen);
//        System.out.println(ideen);
//        System.out.println(inverted);


        Map<String, String> Abgeordnete = new HashMap<>();


        for(int i = 0; i < 246; i++) {
        Abgeordnete.put("CDU-Abgeordnete*r" + i, "CDU/CSU"  +"\n");
        }

        for(int i = 0; i < 153; i++) {
        Abgeordnete.put("SPD-Abgeordnete*r" + i, "SPD"  +"\n");
        }

        for(int i = 0; i < 91; i++) {
        Abgeordnete.put("FCKAFD-Abgeordnete*r" + i, "Aldebaraner für Degenerierung"  +"\n");
        }

        for(int i = 0; i < 80; i++) {
        Abgeordnete.put("FDP-Abgeordnete*r " + i, "FDP" +"\n");
        }

        for(int i = 0; i < 69; i++) {
        Abgeordnete.put("Linke-Abgeordnete*r" + i, "Linke"  +"\n");
        }

        for(int i = 0; i < 67; i++) {
        Abgeordnete.put("Grüne-Abgeordnete*r" + i, "Grüne"  +"\n");
        }

//        System.out.println(Abgeordnete);

        Map<String, Collection<String>> inverted = new HashMap<>();
        inverted = MapUtil.invertMap(Abgeordnete);
        System.out.println(inverted);

//        Map<String, Collection<String>> sorted = new HashMap<>();
//        sorted = Abgeordnete.stream().collect(Collectors.groupingBy(Abgeordneter::getPartei));

}

}