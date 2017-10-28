package com.company;

public class Main {

    public static void main(String[] args) {
        Auto auto = Auto.builder()
                 .color("Красный")
                .name("Ламборгини")
                .build();
            auto.printAuto();
    }
}
