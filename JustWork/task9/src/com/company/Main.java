package com.company;

import com.company.Lists.ArrayList;
import  com.company.Lists.Iterator;
import  com.company.Lists.LinkedList;
import  com.company.Lists.List;

public class Main{

  /*  public static void printList(List list) {
        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }*/

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.addToEnd(10);
        arrayList.addToEnd(5);
        arrayList.addToEnd(1);
        arrayList.addToEnd(8);
        arrayList.addToEnd(2);

        LinkedList linkedList = new LinkedList();
        linkedList.addToBegin(6);
        linkedList.addToBegin(8);
        linkedList.addToBegin(9);
        linkedList.addToBegin(1);

        printList(arrayList);
        System.out.println("------------");
        printList(linkedList);
    }
}