package com.company;

public class Square extends Figures {
    protected int lenght;
    Square(int lenghtValue){
        lenght = lenghtValue;
    }
    public double countSpace() {
        return (lenght*lenght);
    }
    public double countPerimeter(){
        return (4*lenght);
    }
    public String getName(){
        return (" Квадрат");
    }
}
