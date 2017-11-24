package ru.itpark;


import java.util.Random;
import java.util.Scanner;

public class Main {
    static int array[];
    static int result;

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int numbersCount = scanner.nextInt();
        array = new int[numbersCount];
        Random random = new Random();
        long summ = 0;
        for (int i = 0; i < numbersCount; i++) {
            array[i] = random.nextInt(1001);
            summ += array[i];
        }
        System.out.println(summ);
        int blocksCount = scanner.nextInt();
        int start = 0;
        int end = 0;
        Worker worker[] = new Worker[blocksCount];
        int temp = numbersCount / blocksCount;
        int count = 0;
        while (true) {
            while (count < blocksCount - 1) {
                end += temp;
                worker[count] = new Worker(array, start, end);
                start = end;
                worker[count].start();
                count++;
            }
            end = numbersCount;
            worker[blocksCount - 1] = new Worker(array, start, end);
            worker[count].start();
            break;
        }
        for (int i = 0; i < blocksCount; i++){
            worker[i].join();
        }
        System.out.println(result);
    }

}
