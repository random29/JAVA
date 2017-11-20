package ru.itpark;

public class Main {

    public static void main(String[] args) throws Exception {
        ChickenThread chickenThread = new ChickenThread();
        EggThread eggThread = new EggThread();
//        Thread thread = Thread.currentThread(); - не обязательно
        chickenThread.start();
        eggThread.start();

        chickenThread.join();
        eggThread.join();

        for (int i = 0; i < 100; i++)
            System.out.println("Человек");

    }
}
