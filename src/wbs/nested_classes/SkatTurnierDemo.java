package wbs.nested_classes;

import java.util.Arrays;
import java.util.List;


                public class SkatTurnierDemo {

                        /*
                         * wir organisieren ein skat-turnier, an dem 10 spieler teilnehmen. wir
                         * listen alle möglichen kombinationen von genau 3 skatspielern auf. wie
                         * viele kombinationen gibt es insgesamt?
                         */
                        public static void main(String[] args) {
                                String[] skatSpieler = {"anton", "bernd", "chris", "dieter",
                                        "elfriede", "friedrich", "gustav", "heinrich", "isidor",
                                        "judith"};

                                int counter = 0;

                                // TODO
                                MyList<String> Spieler = new MyList<>(Arrays.asList(skatSpieler));
                                for (List<String> subList : Spieler){
                                        if (subList.size() == 3){
                                                System.out.println(subList);
                                                counter++;
                                        }
                                }
                                System.out.println(counter);
                        }
                }