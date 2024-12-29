import java.awt.*;

public class MultiThreading {
    public static void main(String[] args) {

        System.out.println("Current Thread Group Name : " + Thread.currentThread().getThreadGroup().getName() + " - Thread");
        System.out.println("Current Thread Parent Group Name : " + Thread.currentThread().getThreadGroup().getParent().getName() + " - Group");

        ThreadGroup threadGroup = new ThreadGroup("Sameer - Group");
        System.out.println("Current Thread Group Name : " + threadGroup.getName());

        System.out.println("--------------------------------------------------------------------");

        /* DisplayMode System level Thread Groups */

        ThreadGroup systemGroup = Thread.currentThread().getThreadGroup().getParent(); // provides main/current thread's parents threads.

        Thread[] threads = new Thread[systemGroup.activeCount()];
        systemGroup.enumerate(threads); // copies all parent level thread into Threads[].

        for (Thread thread : threads) {
            System.out.println(thread.getName());
        }


    }
}
