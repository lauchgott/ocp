package wbs.flouebungen;

public class tes {

    public static long randomTipp() {
        long tippAsBits = 0;
        while (Long.bitCount(tippAsBits) != 6) {
            tippAsBits |= (1L << (int) (Math.random() * 49 + 1));
        }
        return tippAsBits;
    }

    public static String tippAsString(long tippAsBits)
            throws IllegalArgumentException {

       StringBuilder sb = new StringBuilder("[");
        for (int n = 1, counter = 0; counter < 6 && n < 50; n++) {
            if ((tippAsBits & (1L << n)) != 0) {
                sb.append(n).append(counter < 5 ? " " : "]");
                counter++;
            }
        }
        return sb.toString();



    }

    CharSequence neuerString = new StringBuilder("Bier");


    public static void main(String[] args) {

        System.out.println(tippAsString(randomTipp()));


        System.out.println("///////////////// for-Loop Alberei /////////////////////////////");

        int x = 0;

        for(int y = 2, z = 4; x < 10; x++ ){
            System.out.println(x);
        }
        System.out.println("außerhalb des Loops ist x: " + x);




    }

}
