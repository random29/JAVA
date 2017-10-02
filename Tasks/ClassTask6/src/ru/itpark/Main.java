package ru.itpark;

import java.util.Scanner;

public class Main {
    static int count = 0;


    public static void main(String[] args) {

        String document[] = new String[6];
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu.showmenu();
            int command1;
            command1 = scanner.nextInt();
            switch (command1) {
                case 1: {
                    DocumentUtil.showdocument(document);
                }
                break;
                case 2: {
                    if (count == document.length) {
                        System.err.println("Нет места");
                        return;
                    }
                    System.out.println("Введите строку: ");
                    String newLine = scanner.next();
                    DocumentUtil.inbegin(document,newLine);
                }
                break;
                case 3: {
                    if (DocumentUtil.count == document.length) {
                        System.err.println("Нет места");
                        break;
                    }
                    System.out.println("Введите строку: ");
                    String newLine = scanner.next();
                    DocumentUtil.inend(document,newLine);
                }
                break;
                case 4: {
                    System.out.println("Какую строку удалить? ");
                    int newLine = scanner.nextInt();
                    DocumentUtil.deletestring(document,newLine);
                }
                break;
                case 5: {
                    System.out.println("Какую строку заменить? ");
                    int index = scanner.nextInt();
                    System.out.println("Чем заменить? ");
                    String newLine = scanner.next();
                    DocumentUtil.changeme(document,index,newLine);
                }
                break;
                case 6: { System.out.println("Какую строку очистить? ");
                    int index = scanner.nextInt();
                    DocumentUtil.cleanme(document,index);
                }
                break;
                case 7:
                    System.exit(0);
            }
        }
    }
}