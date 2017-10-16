package com.company;

public class TV implements AutoFullFill {
    private int currentChannelsCount = 0;
    private Channel channels[] = new Channel[10];
    private static final TV instance;

    private TV() {
        System.err.println("Телевизор привязан к пульту");
        System.out.println();
    }

    static {
        instance = new TV();
    }

    static TV getTV() {
        return instance;
    }

    public void addChannel(String nameOfNewChannel) {
        for (int i = 0; i < currentChannelsCount; i++) {
            if (channels[i].getNameOfChannel().equals(nameOfNewChannel)) {
                System.err.println("Такой канал уже существует, попробуйте ещё раз!");
                System.out.println();
                return;
            }
        }
        if (currentChannelsCount < 10) {
            channels[currentChannelsCount] = new Channel(nameOfNewChannel);
            currentChannelsCount++;
            System.err.println("Канал успешно создан, добавьте пожалуйста расписание передач");
            return;
        }
    }
    public void addProgramInChannel(String nameOfRequestedChannel, String nameOfNewProgram, int timings[]) {
        boolean garbage = false;
        for (int i = 0; i < currentChannelsCount; i++) {
            if (channels[i].getNameOfChannel().equals(nameOfRequestedChannel)) {
                channels[i].addProgram(nameOfNewProgram, timings);
                garbage = true;
            }
        }
        if (garbage == false)
            System.err.println(" Такого канала нет, попробуйте сначала создать канал");
    }
    public void showChannel(String nameOfWantedChannel) {
        for (int i = 0; i < currentChannelsCount; i++) {
            if (channels[i].getNameOfChannel().equals(nameOfWantedChannel)) {
                channels[i].showCurrentProgram();
                return;
            }
        }
        System.err.println("Такого канала к сожалению нет, проверьте написание!");
        System.out.println();
    }
    public void changeProgram( String nameOfNeededChannel, String nameOfNewProgram, int time[]){
        int i;
        for (i = 0; i < currentChannelsCount; i++) {
            if (channels[i].getNameOfChannel().equals(nameOfNeededChannel)) {
             break;
            }
        }
        if (i == currentChannelsCount) {
            System.out.println(" Нет таких каналов");
            return;
        }
        for (int j = 0; j < channels[i].getPrograms().length; i++) {
            int temp[] = channels[i].showCurrentProgram().getTime();
            if (temp[0] < time[0] && temp[1] > time[0]) {
                channels[i].showCurrentProgram().setNameOfProgram(nameOfNewProgram);
                channels[i].showCurrentProgram().setTime(time);
                System.err.println("Изменил программу на " + channels[i].showCurrentProgram().getName() + " , идущую в промежуток между " + channels[i].showCurrentProgram().getTime()[0] + " и " + channels[i].showCurrentProgram().getTime()[1]);
            return;}
            }
        System.err.println(" Произошла ошибка, извините");

    }
    public void makeTVWork(TV tv[]){

    }

}
