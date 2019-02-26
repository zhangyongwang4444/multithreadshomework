package com.zhangyongwang.multithreadshomework;

public class MainThread {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();

        System.out.println("Currrent thread:" + t);

        t.setName("My Thread");
        System.out.println("Thread id : " + t.getId());
        System.out.println("After name change : " + t);

        // 创建新的子线程1
        NewThread1 t1 = new NewThread1("Thread1");


        // 创建新的子线程2
        NewThread2 t2 = new NewThread2("Thread2");

        // 创建新的子线程3
        RunnableMultiThreads.NewThread3 t3 = new RunnableMultiThreads.NewThread3("Thread3");
        try {
            for (int n = 1; n <= 100; n++) {
                System.out.println(n);
                Thread.sleep(600);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

    }
}
