package com.company;
import java.util.Scanner;

public class Television {
    /*static*/ int count=0;
    int size=0;
    Channel channels[];
    Television(){
        Channel channels[]= new Channel[5];
        size=5;
    }
    Television(int i){
        Channel channels[]= new Channel[i];
        size=i;
    }
    public void WriteChannel(String name) {
        if (count < size) {
            channels[count].nameOfChannel = name;
            count++;
        }
        else System.out.println("У вас нет столько каналов");
    }
    public void ShowChannel(String name, int time){
        for (int i=0; i<count; i++) {
            if ( channels[count].nameOfChannel == name){
                channels[count].WriteNameOfChannel(time);
            }
            else System.out.println("Извините, но такого канала нет, попробуйте ещё раз");
        }
    }


}
