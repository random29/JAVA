package com.company;

public class Human  {
    private String name;
    private int age;
    private int height;
    private int weight;

    Human(String name, int age, int height, int weight){
        this.name = name;
        this.height = height;
        this.age = age;
        this.weight = weight;
        }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
    public void printHuman(){
        System.out.println(name + " Возраст - " + age + " Рост - " + height + " Вес - " + weight);
    }
}
