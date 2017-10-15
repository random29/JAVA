package com.company;

public class Circle extends Figures {
    private int radius;
    Circle(int radius){
        this.radius = radius;
    }
    public double countSpace(){
        return (Math.PI * radius);
    }
    public double countPerimeter(){
        return (2 * Math.PI * radius);
    }
    public String getName(){
        return (" Круг");
    }
}
