package wbs.generics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
@SuppressWarnings(value = "rawtypes")
class UCL {
@SuppressWarnings("unchecked")
public static void m(Collection c) {
c.add(new Object());
}
}
public class CheckedCollectionDemo {
public static void main(String[] args) {
List<String> strings = new ArrayList<>();
strings.add("abc");
strings.add("def");
strings.add("ghijkl");
UCL.m(strings); // noch keine ClassCastException
// String s = strings.get(1); // jetzt erst ClassCastException
List<String> checkedStrings = Collections.checkedList(
new ArrayList<String>(), String.class);
checkedStrings.add("abc");
UCL.m(checkedStrings); // jetzt schon ClassCastException
}
}