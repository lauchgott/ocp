package wbs.pattern.iterator;

public class Test {

    public static void main(String[] args) {
        int x = 0;

        for (int i = 0; i <= 10; i++) {

            x++;

            if (x == 5) {
                System.out.println("Jetzt ist x eine 5");
            } else {
                System.out.println("X ist gerade keine 5");
            }
        }
    }
}
