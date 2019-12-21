package wbs.maps;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapUtilDemo {


        public static void main(String[] args) {

//            Map<String, String> ideen =  new HashMap<>();
//            ideen.put("Singer", "Animal Liberation");
//            ideen.put("Heidegger","Sein und Zeit");
//
//            Map<String, Collection<String>> inverted = new HashMap<>();
//            inverted = MapUtil.invertMap(ideen);
//            System.out.println(ideen);
//            System.out.println(inverted);

            Map<Integer, Integer> map = new HashMap<>();

            for(int i = 0; i < 80; i++){
                map.put(i, Integer.bitCount(i));
            }

            MapUtil.invertMap(map).forEach((k,v) -> System.out.println(k + " -> " + v));


            System.out.println("------------------");

            Comparator<Integer> cmp = (n1,n2) -> Integer.compare(n2,n1);

            MapUtil.invertMap(map,cmp,cmp).forEach((k,v) -> System.out.println(k + " -> " + v));


/*
Was passiert, wenn man im Constructor von TreeSet oder TreeMap null übergibt?
null ist erlaubt in beiden Constructoren. Dann wird auf das natural Ordering zurückgegriffen, wenn vorhanden
ansonsten schmeißt er eine ClassCast-Exception.
 */



        }


    }


