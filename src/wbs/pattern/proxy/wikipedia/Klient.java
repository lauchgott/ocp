package wbs.pattern.proxy.wikipedia;

public class Klient {
        
        public static void main(String[] args) {
                Subjekt realesSubjekt = new RealesSubjekt();
                Subjekt stellvertreter = new Stellvertreter(realesSubjekt);
                stellvertreter.operation();
        }
}
