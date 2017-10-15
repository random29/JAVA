package com.company;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4, 5);
        Circle circle = new Circle(3);
        Oval oval = new Oval(3 , 4);
        Triangle triangle = new Triangle(2, 3 ,4 , 6);
        Figures figures[] = {square, rectangle, circle, oval, triangle};
        for (int i=0 ; i < figures.length ; i++){
            System.out.println(figures[i].countPerimeter() + " - Это периметр фигуры" + figures[i].getName());
            System.out.println(figures[i].countSpace() + " - Это площадь фигуры" + figures[i].getName());
        }
    }
}
