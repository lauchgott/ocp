package wbs.threads.sync;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

class Task implements Runnable{
BigInteger from;
BigInteger to;
AtomicInteger ai;

public Task(BigInteger from, BigInteger to, AtomicInteger ai) {
    this.from = from;
    this.to = to;
    this.ai = ai;
}



    @Override
    public void run() {
    for(BigInteger bi = from; bi.compareTo(to) < 0;){
        bi = bi.nextProbablePrime();
        if(bi.compareTo(to) <= 0){
            ai.getAndIncrement();
        }
    }
    }
}




public class CompareTimesDemo {

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger ai = new AtomicInteger();
        Task task = new Task(BigInteger.valueOf(1_000_000),
                BigInteger.valueOf(2_000_000), ai);
        Thread thread = new Thread(task);
        long t11;
        long t12;

        t11 = System.currentTimeMillis();
        thread.start();
        thread.join();
        t12 = System.currentTimeMillis();
        System.out.println("--- one thread ---");
        System.out.println(ai);
        System.out.println(t12 - t11);

        ai.set(0);
        long t13;
        long t14;
        Task task2 = new Task(BigInteger.valueOf(1_000_000),
                BigInteger.valueOf(1_499_999), ai);
        Task task3 = new Task(BigInteger.valueOf(1_500_000),
                BigInteger.valueOf(2_000_000), ai);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);
        t13 = System.currentTimeMillis();
        thread2.start();
        thread3.start();
        thread2.join();
        thread3.join();
        t14 = System.currentTimeMillis();
        System.out.println(" --- two threads ---");
        System.out.println(ai);
        System.out.println(t14 - t13);
    }
}