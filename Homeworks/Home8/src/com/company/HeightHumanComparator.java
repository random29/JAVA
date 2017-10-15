package com.company;

public class HeightHumanComparator implements HumanComparator {
    public int compare(Human a, Human b){
        if (a.getHeight() > b.getHeight())
            return (1);
        else if (a.getHeight() < b.getHeight())
            return (-1);
        else return (0);
    }


}
