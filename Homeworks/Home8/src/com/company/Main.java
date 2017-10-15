package com.company;

public class Main {

    public static void main(String[] args) {
        AgeHumanComparator age = new AgeHumanComparator();
	Human human = new Human( "Илья", 19, 196,  75);
        Human human1 = new Human( "Марсель", 24, 180,  70);
        Human human2 = new Human( "Артём", 19, 194,  82);
        Human humanMass[] = {human, human1, human2};
        HumanSorterByBubble bubble = new HumanSorterByBubble();
        bubble.sort(age, humanMass);
        for (int i = 0; i < humanMass.length; i++){
            humanMass[i].printHuman();
        }
    }
}
