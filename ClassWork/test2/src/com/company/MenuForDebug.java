package com.company;

public abstract class MenuForDebug {
    public static void Showmenu() {
        System.err.println("МЕНЮ АДМИНИСТРАТОРА:");
        System.err.println("1. Добавить канал");
        System.err.println("2. Добавить передачу");
        System.err.println("3. Изменить передачу");
        System.err.println("4. Выйти из админ-меню");
    }
}
