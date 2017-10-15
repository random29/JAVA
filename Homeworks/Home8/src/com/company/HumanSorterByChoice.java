package com.company;

public class HumanSorterByChoice implements HumanSorter {

    public void sort(HumanComparator comparator, Human humans[]) {
        for (int i = 0; i < humans.length; i++) {

            int minValueIndex = i;

            for (int j = i + 1; j < humans.length; j++) {

                if (comparator.compare(humans[j],humans[minValueIndex]) < 0)
                    minValueIndex = j;
            }
            Human temp = humans[i];
            humans[i] = humans[minValueIndex];
            humans[minValueIndex] = temp;
        }

    }
}
