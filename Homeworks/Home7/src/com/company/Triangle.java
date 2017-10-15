package com.company;

public class Triangle extends Figures {
    private int aSide;
    private int bSide;
    private int cSide;
    private int aHeight;
    Triangle (int aSide, int bSide, int cSide, int aHeight){
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
        this.aHeight = aHeight;
    }
    public double countPerimeter(){
        return (aSide + bSide + cSide);
    }
    public double countSpace(){
        return ((aSide * aHeight)/2);
    }
    public String getName(){
        return (" Треугольник");
    }
}
