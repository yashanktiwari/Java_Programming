package Multithreading;

/*
Create three threads- with different priorities – MAX, MIN, NORM- and start the threads at the same time.
Observe the completion of the threads. (Thread priorities concept)
*/

class Mythread5 extends Thread {
    public void run() {
        System.out.println("Thread 0");
    }
}

class Mythread6 extends Thread {
    public void run() {
        System.out.println("Thread 1");
    }
}

class Mythread7 extends Thread {
    public void run() {
        System.out.println("Thread 2");
    }
}

public class Question5 {
    public static void main(String[] args) {
        Mythread5 t5 = new Mythread5();
        t5.start();
        t5.setPriority(Thread.MIN_PRIORITY);

        Mythread6 t6 = new Mythread6();
        t6.start();
        t6.setPriority(Thread.NORM_PRIORITY);

        Mythread7 t7 = new Mythread7();
        t7.start();
        t7.setPriority(Thread.MAX_PRIORITY);
    }
}
