package Multithreading;

class Mythread1 extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
}

class Mythread2 extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
}

public class Question1 {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        t1.setName("Scooby");
        t1.start();

        Mythread2 t2 = new Mythread2();
        t2.setName("Shaggy");
        t2.start();
    }
}
