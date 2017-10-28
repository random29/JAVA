package com.company;

import com.company.Lists.ArrayList;
import  com.company.Lists.LinkedList;


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

        arrayList.printList();
        System.out.println(arrayList.size());
        System.out.println("------------");
        linkedList.printList();
        System.out.println(linkedList.size());
        System.out.println("------------");
        arrayList.doReverseList();
        arrayList.printList();
        System.out.println("------------");
        linkedList.doReverseList();
        linkedList.printList();
        System.out.println("------------");
        arrayList.addByIndex(3, 10);
        arrayList.printList();
        System.out.println("------------");
        linkedList.addByIndex(2, 10);
        linkedList.printList();
        System.out.println("------------");
        arrayList.deleteByElement(10);
        arrayList.printList();
        System.out.println(arrayList.size());
        System.out.println("------------");
        linkedList.deleteByElement(10);
        linkedList.printList();
        System.out.println(linkedList.size());
        System.out.println("------------");
        arrayList.deleteByIndex(1);
        arrayList.printList();
        System.out.println(arrayList.size());
        System.out.println("------------");
        linkedList.deleteByIndex(1);
        linkedList.printList();
        System.out.println(linkedList.size());
    }
}