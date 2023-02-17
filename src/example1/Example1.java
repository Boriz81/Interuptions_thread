package example1;

public class Example1 {
    public static void main(String[] args) {
        Thread thread = new HelloThread1();
        System.out.println(thread.isInterrupted());
        thread.interrupt();
        System.out.println(thread.isInterrupted());
        
    }
}
