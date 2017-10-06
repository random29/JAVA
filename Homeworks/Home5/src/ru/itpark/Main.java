package com.company;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество документов :");
        int size = scanner.nextInt();
        DocumentUtil document[] = new DocumentUtil[size];
        for (int i=0 ; i<size ; i++){
            document[i] = new DocumentUtil();
        }
        while (true) {
            int index;
            System.out.println("С каким документом мы работаем?");
            index =  scanner.nextInt();
            Menu.Showmenu();
            int command1;
            command1 = scanner.nextInt();
            switch (command1) {
                case 1: {
                      document[index].showdocument();
                }
                break;
                case 2: {
                    if (document[index].count == document.length) {
                        System.err.println("Нет места");
                        return;
                    }
                    System.out.println("Введите строку: ");
                    String newLine = scanner.next();
                    document[index].inbegin(newLine);
                }
                break;
                case 3: {
                    System.out.println("Введите строку: ");
                    String newLine = scanner.next();
                    document[index].inend(newLine);
                }
                break;
                case 4: {
                    System.out.println("Какую строку удалить? ");
                    int newLine = scanner.nextInt();
                    document[index].deletestring(newLine);
                }
                break;
                case 5: {
                    System.out.println("Какую строку заменить? ");
                    int index1 = scanner.nextInt();
                    System.out.println("Чем заменить? ");
                    String newLine = scanner.next();
                    document[index].changeme(index1,newLine);
                }
                break;
                case 6: { System.out.println("Какую строку очистить? ");
                    int index1 = scanner.nextInt();
                    document[index].cleanme(index1);
                }
                break;
                case 7:
                    System.exit(0);
            }
        }
    }
    }
