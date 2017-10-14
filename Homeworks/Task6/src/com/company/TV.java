package com.company;

public class TV {
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
            if (channels[i].getNameOfChannel() == nameOfNewChannel) {
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

}
