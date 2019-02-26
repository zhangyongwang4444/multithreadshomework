package com.zhangyongwang.multithreadshomework;

public class RunnableMultiThreads {
    static class NewThread3 implements Runnable {
        private String name;

        private Thread t;

        NewThread3(String threadname) {
            name = threadname;
            t = new Thread(this, name);
            System.out.println("New Thread:" + t);
            t.start();
        }

        public void run() {
            System.out.println("就这一个逻辑，简单皮一下");
        }
    }
}
