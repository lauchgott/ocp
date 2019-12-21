package wbs.pattern.proxy.wikipedia;

public class RealesSubject implements Subject {

    @Override
    public void operation() {
        System.out.println("I am Delegating");
    }
}
