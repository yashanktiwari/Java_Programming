package Multithreading;

import java.util.Random;
/*
store colours in the form of an array
ex: String colours[]={"white","blue","black","green","red","yellow"};
display all colours repeatedly by generating colour index from Random class. If the random colour index matches to red stop display.
Note: perform this task by implementing Runnabe interface
*/

class Mythread3 implements Runnable {
    public void run() {
        String[] str = {"white", "blue", "black", "green", "red", "yellow"};
        Random r = new Random();
        int n;
        for(int i=0; i<6; i++) {
            n = r.nextInt((5)+1);
            if(str[n].equalsIgnoreCase("red")) {
                System.out.println(str[n]);
                break;
            } else {
                System.out.println(str[n]);
            }
        }
    }
}

public class Question2 {
    public static void main(String[] args) {
        Mythread3 t3 = new Mythread3();
        Thread t0 = new Thread(t3);
        t0.start();
    }
}
