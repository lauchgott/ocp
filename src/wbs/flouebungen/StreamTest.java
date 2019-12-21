package wbs.flouebungen;

import java.util.*;

enum Color {
    RED, GREEN;
}

class Widget{
    Color getColor(){
        return null;
    }
    int getWeight(){
        return 0;
    }
}


public class StreamTest {

    public static void main(String[] args) {
        Collection<Widget> widgets = new HashSet<>();

        int sum = 0;

        for(Widget widget : widgets){
            if(widget.getColor() == Color.RED) {
                sum += widget.getWeight();
            }
        }
        System.out.println(sum);
    }

}