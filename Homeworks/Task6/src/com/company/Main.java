package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TV tv = TV.getTV();
        while (true){
            int index;
            System.out.println("1. Использовать пульт дистанционного управления");
            System.out.println("2. Войти в меню отладки телевизора");
            System.out.println("3. Выйти из программы");
            index =  scanner.nextInt();
                if (index == 1) {
                    while (true){
                        int index1;
                        MenuForController.Showmenu();
                        index1 = scanner.nextInt();
                        if (index1 == 1) {
                            System.out.println("На какой канал вы хотите переключить?");
                            String newLine = scanner.next();
                             tv.showChannel(newLine);
                             break;
                        }
                        else
                            System.out.println("Такого пункта нет в меню, повторите");
                    }
                }
                else if (index == 2) {
                    System.out.println("Введите пароль администратора: ");
                    String password = scanner.next();
                    String rightPassword = "123456";
                    if (password.equals(rightPassword)) {
                        boolean garbage = true;
                        while (garbage == true){
                        MenuForDebug.Showmenu();
                            int command1;
                            command1 = scanner.nextInt();
                            switch (command1) {
                                case 1 : {
                                    System.out.println("Введите название нужного канала :");
                                    String newLine = scanner.next();
                                    tv.addChannel(newLine);
                                } break;
                                case 2 : {
                                    System.out.println("В какой канал вы хотите вставить передачу? ");
                                    String newLine = scanner.next();
                                    System.out.println("Напишите её имя :");
                                    String nameProgram = scanner.next();
                                    System.out.println("Напишите время её начала и конца");
                                    int timings[] = new int[2];
                                    timings[0] = scanner.nextInt();
                                    timings[1] = scanner.nextInt();
                                    tv.addProgramInChannel(newLine, nameProgram, timings);
                                } break;
                                case 3 : {
                                    garbage = false;
                                } break;
                            }
                        }
                    }
                    else System.out.println(" Пароль неправильный, попробуйте ещё раз");

                }
                else if (index == 3){
                    System.exit(0);
                }
                else System.out.println(" Вы ввели неверную команду, попробуйте ещё раз");
        }

    }
}
