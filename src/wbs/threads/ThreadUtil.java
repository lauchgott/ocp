package wbs.threads;

import java.lang.management.*;
import java.util.Arrays;

public class ThreadUtil {

        public static void threadInfo() {
                
                RuntimeMXBean bean = ManagementFactory.getRuntimeMXBean();
                String jvmName = bean.getName();
//      System.out.println("Name = " + jvmName);
                // ProcessID holen mit splitting string returned from bean.getName()
                long pid = Long.valueOf(jvmName.split("@")[0]);
                System.out.println("PID = " + pid);

                ThreadMXBean threadMxBean = ManagementFactory.getThreadMXBean();
                long[] numbThreads = threadMxBean.getAllThreadIds();
                System.out.println("ThreadInfoID: " + Arrays.toString(numbThreads));
                for (ThreadInfo ti : threadMxBean.dumpAllThreads(true, true)) {
                        System.out.print(ti.toString());
                }
        }
}

class ImplementsRunnable2 implements Runnable {
        public void run() {
                System.out.println(Thread.currentThread());
                try {
                        Thread.sleep(2000);
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }
        }
}

class ImplementsRunnableDemo2 {
        public static void main(String[] args) {
                ImplementsRunnable implementsRunnable = new ImplementsRunnable();
                Thread thread = new Thread(implementsRunnable);
                thread.start();
                System.out.println(Thread.currentThread());
                ThreadUtil.threadInfo();
        }
}
