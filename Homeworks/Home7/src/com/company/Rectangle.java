package com.company;

public class Rectangle extends Square {
    private int height;
    Rectangle (int lenght, int height){
        super(lenght);
        this.height = height;
    }

    @Override
    public double countSpace() {
        return height*lenght;
    }
    @Override
    public double countPerimeter() {
        return (2*(height*lenght));
    }
    public String getName(){
        return (" Прямоугольник");
    }
}
