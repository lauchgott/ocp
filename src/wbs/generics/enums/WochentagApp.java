package wbs.generics.enums;

enum Wochentag {
MO, DI, MI, DO, FR, SA, SO
}
public class WochentagApp {
public static void m(Wochentag tag) {
switch (tag) {
case MO:
case DI:
case MI:
case DO:
case FR:
// do some stuff
break;
case SA:
// do some stuff
break;
case SO:
// do some stuff
break;
default:
// strange!
break;
}
}
public static void main(String[] args) {
Wochentag[] values = Wochentag.values();
for (Wochentag tag : values) {
System.out.println(tag.name() + " " + tag.ordinal());


}
}
}