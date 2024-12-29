public class CustomThread extends Thread {

    public CustomThread(ThreadGroup group, String name) {
        super(group, name);
        Thread.currentThread().setName(name);
    }

    @Override
    public void run() {
        System.out.println("Current Thread name : " + Thread.currentThread().getName());
        System.out.println("Current Thread Group : " + Thread.currentThread().getThreadGroup().getName());
    }
}
