package com.zhangyongwang.multithreadshomework;

public class NewThread2 extends Thread {
    NewThread2(String name) {
        super(name);
        System.out.println("Child Thread :" + this);
        start();
    }

    public void run() {
        try {
            for (char c = 'a'; c <= 'z'; c++) {
                System.out.println(String.valueOf(c));
                Thread.sleep(480);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread2 Interrupted");
        }
    }
}
