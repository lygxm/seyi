package com;

public class TaskThreadDemo {
    public static void main(String[] args) {

          Runnable printA = new PrintChar('a', 100);
          Runnable printB = new PrintChar('b', 100);
          Runnable print100 = new PrintNum(100);

         Thread thread1 = new Thread(printA);
         Thread thread2 = new Thread(printB);
         Thread thread3 = new Thread(print100);

         thread1.start();
         thread2.start();
         thread3.start();
    }


}

class PrintChar implements Runnable {
    private char charToPrint;
    private int times;

    public PrintChar(char c, int t) {
        charToPrint = c;
        times = t;
    }

    @Override /** Override the run() method to tell the system    *  what the task to perform    */
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.print(charToPrint);
        }
    }
}

class PrintNum implements Runnable {
    private int lastNum;
    /** Construct a task for printing 1, 2, ... i */
    public PrintNum(int n) {
        lastNum = n;
    }
   /* @Override *//** Tell the thread how to run *//*
    public void run() {
        for (int i = 1; i <= lastNum; i++) {
            System.out.print(" " + i);
        }
    }*/


    public void run() {
        Thread thread4 = new Thread(new PrintChar('c', 40));
        thread4.start();
        try {
            for (int i = 1; i <= lastNum; i++) {
                System.out.println(" " + i);
                if (i == 50) thread4.join();
            }
        } catch (InterruptedException ex) {
        }
    }
}
