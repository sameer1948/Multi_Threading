public class MultiThreading1 {
    public static void main(String[] args) {

        CustomThread customThread = new CustomThread(new ThreadGroup("Sameer - Group"), "Reemas");
        CustomThread customThread1 = new CustomThread(new ThreadGroup("Sameer1 - Group"), "Reemas1++");

        customThread1.start();
        customThread.start();

    }
}
