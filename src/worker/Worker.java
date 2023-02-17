package worker;

import static worker.InterruptedExample.mainThreadId;

class Worker extends Thread {

    @Override
    public void run() {

        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException("You need to wait longer!", e);
        }

        final long currentId = Thread.currentThread().getId();


        long mainThreadId = 0;
        if (currentId == mainThreadId) {
            throw new RuntimeException("You must start a new thread!");
        }

        while (true) {
            if (isInterrupted()) {
                System.out.println("Interrupted");
                break;
            }
        }
    }
}
