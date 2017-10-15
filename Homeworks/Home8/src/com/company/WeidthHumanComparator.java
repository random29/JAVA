package com.company;

public abstract class WeidthHumanComparator implements HumanComparator, HumanSorter {
    public int compare(Human a, Human b){
        if (a.getWeight() > b.getWeight())
            return 1;
        else if (a.getWeight() < b.getWeight())
            return -1;
        else return 0;
    }


}
