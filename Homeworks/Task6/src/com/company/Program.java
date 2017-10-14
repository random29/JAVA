package com.company;

public class Program {

    private int time[] = new int[2];
    private String nameOfProgram;
    Program(String name, int timings[]){//int beginTime, int endTime){
        /*if (beginTime > endTime) {
            time[0] = beginTime;
            time[1] = endTime;
        }else {
            time[1] = beginTime;
            time[0] = endTime;
        }*/
        time[0] = timings[0];
        time[1] = timings[1];
        nameOfProgram = name;
    }


    public int[] getTime() {
        return time;
    }
    public String getName() {
        return nameOfProgram;
    }
}
