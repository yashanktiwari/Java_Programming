package Multithreading;

/*
Create a thread which prints 1 to 10.
After printing 5, there should be a delay of 5000 milliseconds before printing 6.
( Thread Control Mechanism concept)
*/

class MyThread4 extends Thread {
    public void run() {
        for(int i=1; i<=10; i++) {
            if(i==6)
            {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(i);
        }
    }
}

public class Question4 {
    public static void main(String[] args) {
        MyThread4 t4 = new MyThread4();
        t4.start();
    }
}
