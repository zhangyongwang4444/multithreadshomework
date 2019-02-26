package com.zhangyongwang.multithreadshomework;

public class NewThread1 extends Thread {
    NewThread1(String name) {
        super(name);
        System.out.println("Child Thread:" + this);
        start();
    }

    public void run() {
        try {
            for (char c = 'A'; c <= 'Z'; c++) {
                System.out.println(String.valueOf(c));
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread1 interrupted");
        }
    }
}
