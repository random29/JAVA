package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите сколько нужно снять денег :");
        int money = scanner.nextInt();
        int fiveThousand = 0;
        int thousand = 0;
        int fiveHundred = 0;
        int oneHundred = 0;
        int fifty = 0;
        int ten = 0;
        int five = 0;
        int two = 0;
        int one = 0;
        if (money >= 5000) {
            fiveThousand = money / 5000;
            money -= 5000 * fiveThousand;
        }
        if (money >= 1000) {
            thousand = money / 1000;
            money -= 1000 * thousand;
        }
        if (money >= 500) {
            fiveHundred = money / 500;
            money -= 500 * fiveHundred;
        }
        if (money >= 100) {
            oneHundred = money / 100;
            money -= 100 * oneHundred;
        }
        if (money >= 50) {
            fifty = money / 50;
            money -= 50 * fifty;
        }
        if (money >= 10) {
            ten = money / 10;
            money -= 10 * ten;
        }
        if (money >= 5) {
            five = money / 5;
            money -= 5 * five;
        }
        if (money >= 2) {
            two = money / 2;
            money -= 2 * two;
        }
        if (money >= 1) {
            one = money / 1;
            money -= 1 * one;
        }
        System.out.println("5000 - " + fiveThousand + " 1000 - " + thousand + " 500 - " + fiveHundred + " 100 - " + oneHundred + " 50 - " + fifty + " 10 - " + ten + " 5 - " + five + " 2 - " + two + " 1 - " + one );
    }
}
