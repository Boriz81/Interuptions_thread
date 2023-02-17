package example1;

public class HelloThread1 extends Thread{
    @Override
    public void run() {
        String helloMsg = String.format("Hello I'm %s", getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(helloMsg);
    }
}
