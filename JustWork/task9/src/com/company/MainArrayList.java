package com.company;
import com.company.Lists.ArrayList;
import com.company.Lists.Iterator;

public class MainArrayList {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(5);
        list.add(1);
        list.add(8);
        list.add(2);

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}