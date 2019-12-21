package wbs.pattern.proxy.wikipedia;

public class Stellvertreter implements Subjekt {
        
        private Subjekt subjekt;

        public Stellvertreter(Subjekt subjekt) {
                this.subjekt = subjekt;
        }

        @Override
        public void operation() {
                System.out.println("i am delegating...");
                subjekt.operation();
        }
}