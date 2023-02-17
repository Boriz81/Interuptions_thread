package worker;

public class InterruptedExample {
    static long mainThreadId = Thread.currentThread().getId();
    public static void main(String[] args) throws InterruptedException {

        Worker worker = new Worker();
        worker.start();
        Thread.sleep(3000);
        worker.interrupt();

    }
}
