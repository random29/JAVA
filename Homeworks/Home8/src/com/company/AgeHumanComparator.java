package com.company;

public class AgeHumanComparator implements HumanComparator{

    @Override
    public int compare(Human a, Human b){
        if (a.getAge() > b.getAge())
            return (1);
        else if (a.getAge() < b.getAge())
            return (-1);
        else return (0);
    }


}
