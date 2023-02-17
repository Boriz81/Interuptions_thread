package example2;

public class Example2 {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new CustomThread();
        System.out.println(thread.isInterrupted());
        System.out.println(thread.isInterrupted());

        thread.start();
        Thread.sleep(1000);
        thread.interrupt();

    }
}
