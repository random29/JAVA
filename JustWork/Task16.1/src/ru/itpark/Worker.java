package ru.itpark;


public class Worker extends Thread {
    private static final Object MUTEX = new Object();
    private int array[];
    private int start;
    private int end;

    Worker() {
        array = new int[10];
        start = 0;
        end = 3;
    }

    Worker(int[] a, int b, int c) {
        array = a;
        start = b;
        end = c;
    }

    public void run() {
        for (int i = start; i < end; i++) {
            synchronized (MUTEX) {
                System.out.println(Thread.currentThread().getName());
                Main.result += array[i];
            }
        }
    }
}
