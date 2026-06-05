package thread_homework;

public class MultiThread {

    /* 3.*/     static class MyThread extends Thread {
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("3.Hello from MyThread - " + Thread.currentThread().getName());
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /*5.*/      static class MyRunnable implements Runnable {
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("5.Hello from MyRunnable - " + Thread.currentThread().getName());
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /*6.*/    static class CounterThread extends Thread {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("6.Number - " + i);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /*7.*/    static class NamePrinter extends Thread {
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("7.Thread name - " + Thread.currentThread().getName());
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        /*
        1.Print main thread name
         */
        System.out.println("1.Thread name - " + Thread.currentThread().getName());

        System.out.println();
        /*
        2.Create 5 threads with  Thread. Print a message (e.g., "Hello from MyThread" + currentThreadName) from each thread.
         */
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(() -> {
                System.out.println("2.Hello from MyThread - " + Thread.currentThread().getName());
            });
            t.start();
        }
        Thread.sleep(500);

        System.out.println();
        /*
        3.Create a  thread with  Thread. Print a message (e.g., "Hello from MyThread") and 5 times with a small delay between prints.
         */
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.join();

        System.out.println();
        /*
        4.Create 5 threads with  Runnable. Print a message (e.g., "Hello from MyRunnable" + currentThreadName) from each thread.
         */
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(() -> {
                System.out.println("4.Hello from MyRunnable - " + Thread.currentThread().getName());
            });
            t.start();
        }
        Thread.sleep(500);

        System.out.println();
        /*
        5.Create a thread with  Runnable. Print a message (e.g., "Hello from MyRunnable") and 5 times with a small delay between prints.
         */
        Thread runnableThread = new Thread(new MyRunnable());
        runnableThread.start();
        runnableThread.join();

        System.out.println();
        /*
        6.Create a thread that prints numbers from 1 to 5 with a short delay.
        In main(), start that thread and wait for it to finish using join().
        After that, print "Worker finished, main ends."
         */
        CounterThread counter = new CounterThread();
        counter.start();
        counter.join();
        System.out.println("Worker finished, main ends.");

        System.out.println();
        /*
        7.Create 3 threads.Each thread prints its name 3 times with a delay.
        In main(), start all 3 threads, and wait for all of them to finish using join().
        Finally, print "All threads finished."
         */
        NamePrinter t1 = new NamePrinter();
        NamePrinter t2 = new NamePrinter();
        NamePrinter t3 = new NamePrinter();

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("All threads finished.");


    }
}
