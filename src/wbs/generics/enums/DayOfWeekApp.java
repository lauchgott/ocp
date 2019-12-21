package wbs.generics.enums;

import java.io.IOException;

enum DayOfWeek {
    MO("montag"), DI("dienstag");
    // class body
    private String bez;

    private DayOfWeek(String bez) {
        this.bez = bez;
    }

    public String getBez() {
        return this.bez;
    }

    public void setBez(String bez) {
        this.bez = bez;
    }

    @Override
    public String toString() {
        return this.bez;
    }


}

public class DayOfWeekApp {
    public static void main(String[] args) throws Exception {
        DayOfWeek day = DayOfWeek.MO;
        System.out.println(day); // montag
        day.setBez("monday");
        System.out.println(day); // monday
        System.out.println(day.name()); // MO
    }
}


/*
Könnte der Constructor auch als public oder protected deklariert werden?
Nein, darf er nicht.


Falls Nein: Wer ruft ihn auf und wann wird er aufgerufen?
Der Classloader ruft ihn auf.
Er wird aufgerufen, wenn die Enum-Klasse geladen wird(hier DayOfWeekApp)


Kann in einem Enum die Methode toString() überschrieben werden?
Ja, das darf sie.


Können in einem Enum die Methoden equals() und hashCode() überschrieben werden?
equals nein.

hashCode ist final, darf auch nicht überschrieben werden.


Ist hier das Semikolon nach der letzten Konstante notwendig?
ja.


Darf der Constructor eine checkedException deklarieren?
Er darf nicht.

 */