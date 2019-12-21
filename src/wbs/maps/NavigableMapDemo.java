package wbs.maps;

/*
Wir illustrieren die folgenden Methoden von NavigableMap:

ceilingEntry(), floorEntry(),
ceilingKey(),floorKey()
headmap(), tailmap()
firstEntry(),lastEntry()
subMap()

 */


import java.util.*;

public class NavigableMapDemo {

    public static void main(String[] args) {


        NavigableMap<Integer, Collection<Integer>> zahlen = new TreeMap<>();
        List<Integer> numbers100 = new ArrayList<>();
        List<Integer> numbers200 = new ArrayList<>();
        List<Integer> numbers300 = new ArrayList<>();
        List<Integer> numbers400 = new ArrayList<>();
        for (int i = 1; i <= 400; i++) {
            if (i <= 100) {
                numbers100.add(i);
            } else if (i > 100 && i <= 200) {
                numbers200.add(i);
            } else if (i > 200 && i <= 300) {
                numbers300.add(i);
            } else {
                numbers400.add(i);
            }
        }

        zahlen.put(1, numbers100);
        zahlen.put(2, numbers200);
        zahlen.put(3, numbers300);
        zahlen.put(4, numbers400);

        System.out.println("---- ceilingEntry/floorEntry---------");
        System.out.println(zahlen.ceilingEntry(1));
        System.out.println(zahlen.floorEntry(1));
        System.out.println("---- ceilingKey/floorKey----------");
        System.out.println(zahlen.floorKey(4));
        System.out.println(zahlen.ceilingKey(4));
        System.out.println("---------headMap/tailMap-----------");
        System.out.println(zahlen.headMap(2));
        System.out.println(zahlen.tailMap(2));
        System.out.println("----------firstEntry/lastEntry-----------");
        System.out.println(zahlen.firstEntry());
        System.out.println(zahlen.lastEntry());
        System.out.println("--------------- Submap ------------------");
        System.out.println(zahlen.subMap(2, 4));



//        NavigableMap<Integer,String> mappe = new TreeMap<>();
//        mappe.put(1,"eins");
//        mappe.put(2,"zwei");
//        mappe.put(3,"drei");
//        mappe.put(4,"vier");
//        mappe.put(5,"fünf");
//        mappe.put(6,"sechs");
//        mappe.put(7,"sieben");
//        mappe.put(8,"acht");
//        mappe.put(9,"neun");
//        mappe.put(10,"zehn");
//
//        Map<Integer,String> subMap = mappe.subMap(6,true,8,true);
//        Map<Integer,String> subMap2 = mappe.subMap(1,5);
//        Map.Entry<Integer,String> firstEntry = mappe.firstEntry();
//        Map.Entry<Integer,String> lastEntry = mappe.lastEntry();
//        Map<Integer,String> headMap = mappe.headMap(5);
//        Map<Integer,String> tailMap = mappe.tailMap(7);
//        int ceilingKey = mappe.ceilingKey(7);
//        int floorKey = mappe.floorKey(3);
//        Map.Entry<Integer,String> ceilingEntry = mappe.ceilingEntry(7);
//        Map.Entry<Integer,String> floorEntry = mappe.floorEntry(3);
//
//        System.out.println("SubMap von, true, bis, true:");
//        subMap.forEach((k,v) -> System.out.println(k + " -> " + v));
//        System.out.println("__________________________________");
//        System.out.println("SubMap von, bis:");
//        subMap2.forEach((k,v) -> System.out.println(k + " -> " + v));
//        System.out.println("__________________________________");
//        System.out.println("firstEntry: " + firstEntry);
//        System.out.println("lastEntry: " + lastEntry);
//        System.out.println("__________________________________");
//        System.out.println("headMap: ");
//        headMap.forEach((k,v) -> System.out.println(k + " -> " + v));
//        System.out.println("__________________________________");
//        System.out.println("tailMap: ");
//        tailMap.forEach((k,v) -> System.out.println(k + " -> " + v));
//        System.out.println("__________________________________");
//        System.out.println("ceilingKey: " + ceilingKey);
//        System.out.println("ceilingEntry: " + ceilingEntry);
//        System.out.println("__________________________________");
//        System.out.println("floorKey: "+ floorKey);
//        System.out.println("floorEntry: " + floorEntry);
//

    }

}
