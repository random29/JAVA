package com.company;
import java.time.LocalTime;

public class Channel {
    private LocalTime localTime = LocalTime.now();
    private int hour = localTime.getHour();
    private int currentCountOfPrograms;


    private String nameOfChannel;
    private Program programs[] = new Program[10] ;

    public String getNameOfChannel() {
        return nameOfChannel;
    }
    Channel (String name){
        nameOfChannel = name;
        currentCountOfPrograms = 0;
    }

    public void addProgram(String nameOfNewProgram, int timeCur[]){
        boolean check = false;
        for (int i = 0; i < currentCountOfPrograms; i++){
            int current[] = programs[i].getTime();
            if ((current[0] <= timeCur[0]) && (current[1] >= timeCur[0]))
                check = true;
        }
        if ((check == false) && (currentCountOfPrograms < 10)){
            programs[currentCountOfPrograms] = new Program(nameOfNewProgram, timeCur);
            currentCountOfPrograms++;
            System.err.println(" Передача добавлена!");
        }
        else System.err.println(" Возникла ошибка, извините");

    }
    public void showCurrentProgram(){
        for (int i = 0; i < currentCountOfPrograms; i++){
            int current[] = programs[i].getTime();
            if (current[0] <= hour && current[1] > hour) {
                System.err.println("Вы смотрите передачу " + programs[i].getName() + " на телеканале " + nameOfChannel);
                System.out.println();
                return;
            }
        }
        System.err.println("Сейчас по каналу ничего не показывают, извините:)");
        System.out.println();
    }



}
