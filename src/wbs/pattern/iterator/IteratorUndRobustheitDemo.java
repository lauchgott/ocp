package wbs.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorUndRobustheitDemo {
        
        public static void main(String[] args) {
                List<Integer> list = new ArrayList<>();
                Integer i;
                Iterator<Integer> itr;
                for(int n = 0;n < 10;n++) {
                        list.add(Integer.valueOf(n));
                }
                itr = list.iterator();
                while(itr.hasNext()) {
                        i = itr.next();
                        if(i.equals(5)) {
//                                 list.remove(Integer.valueOf(5));
//                                 itr.remove();
                        }
                }
                System.out.println(list);
        }

}

