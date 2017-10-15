package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean boolDigits[] = new boolean[1000];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 1000; i++){
            int temp = scanner.nextInt();
            boolDigits[temp-1] = true;
        }
        boolean check = false;
        int i = 0 ;
        while (check != true) {
            if (boolDigits[i] == false){
                System.out.println(i+1 + " - Это число вы пропустили");
                break;
            }
            else i++;
        }
    }
}
