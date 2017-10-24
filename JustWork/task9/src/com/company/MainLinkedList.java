package com.company;



import com.company.Lists.Iterator;
import com.company.Lists.LinkedList;

public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToBegin(6);
        list.addToBegin(8);
        list.addToBegin(9);
        list.addToBegin(1);

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}