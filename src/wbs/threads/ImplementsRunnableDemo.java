package wbs.threads;

class ImplementsRunnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread());
    }
}

public class ImplementsRunnableDemo {
    public static void main(String[] args) {
//        ImplementsRunnable implementsRunnable = new
//                ImplementsRunnable();
        new Thread(() -> System.out.println(Thread.currentThread())).start();
        System.out.println(Thread.currentThread());

//        Thread thread = new Thread(implementsRunnable);
//        thread.start();
        //thread.run();
//        System.out.println(Thread.currentThread());
    }
}