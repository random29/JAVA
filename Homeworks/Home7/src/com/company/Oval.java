package com.company;

public class Oval extends Figures {
    private int small;
    private int big;
    Oval (int small, int big){
        this.small = small;
        this.big = big;
    }
    public double countSpace(){
        return (Math.PI * small * big);
    }
    public double countPerimeter(){
        return (4*((Math.PI * small * big + (big - small)*(big - small))/(small + big)));
    }
    public String getName(){
        return (" Овал");
    }
}
