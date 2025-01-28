package org.example.practice2;

/*public class ThreadP extends  Thread {
    public void run() {
        System.out.println("t is running");
    }

    public static void main(String[] args) {
        ThreadP t = new ThreadP();
        t.start();

    }
}*/

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;


     class ThreadP implements  Runnable{
        @Override
        public void run() {
            System.out.println("thread using run");
        }
    public static void main(String[] args) {
        ThreadP tp=new ThreadP();
        Thread t=new Thread(tp);
        t.start();

    }
    }

