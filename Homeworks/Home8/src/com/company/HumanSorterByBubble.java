package com.company;

public class HumanSorterByBubble implements HumanSorter {

    public void sort(HumanComparator comparator, Human humans[]) {
        for(int i = 1; i < humans.length; i++) {
            for(int j = i; (j >= 1) && (comparator.compare(humans[j],humans[j-1]) < 0); j--) {
               Human temp = humans[j];
               humans[j] = humans[j-1];
               humans[j-1] = temp;
            }
        }
    }

}
