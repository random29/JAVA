package com.company.Lists;

public class LinkedList implements List {

    private Node head;
    private int count;

    public LinkedList() {
        this.head = null;
        this.count = 0;
    }

    @Override
    public void addToEnd(int element) {
        Node newNode  = head;
        while (newNode.next != null){
            newNode = newNode.next;
        }
        Node node = new Node(element);
        newNode.next = node;
        node.next = null;
        count++;
    }
    public void doReverseList(){
        if (head != null) {
            Node newNode = head;
            Node node = head.next;
            head.next = null;
            while (node != null) {
                Node temp = newNode;
                newNode = node;
                node = node.next;
                newNode.next = temp;
            }
            head = newNode;
            return;
        }
        else System.out.println("Список пустой");
        return;
    }
    public void addByIndex(int index, int element){
        int i = 0;
        if (index <= count){
            Node temp = head;
            while (i < index){
                temp = temp.next;
                i++;
            }
            if (temp != null) {
                temp.value = element;
            }
            else if (temp == null){
                temp = new Node(element);
                temp.next = null;
                count++;
            }
            return;
        }
    }
    public void deleteByIndex(int index){
        int i = 1;
        if (index < count && count != 1){
            Node temp = head;
            Node temp1 = head.next;
            while (i < index){
                temp = temp.next;
                temp1 = temp1.next;
                i++;
            }
                temp.next = temp1.next;
                count--;
        }
        else if (count == 1 && index == 0){
            head = null;
        }
    }
    public void deleteByElement(int element){
        if (count >= 2){
            Node temp = head;
            Node temp1 = head.next;
            if (temp.value == element)
        {
            head = temp1;
            count--;
            return;
        }
        while (temp1 != null){
            if (temp1.value == element){
                temp.next = temp1.next;
                count--;
                return;
            }
            temp1 = temp1.next;
            temp = temp.next;
         }
        }
        if (count == 1){
            if (head.value == element){
                head = null;
                count--;
                return;
            }
        }
    }
    public void printList(){
        Node node = head;
        System.out.print("Linked List = ");
        while (node != null){
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();
    }


    public void addToBegin(int element) {
        Node newNode = new Node(element);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
        count++;
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator {

        private Node currentNode;

        LinkedListIterator() {
            currentNode = head;
        }

        @Override
        public int next() {
            int element =  currentNode.value;
            currentNode = currentNode.next;
            return element;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }
    }

    private static class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
        Node(){}
    }
    public int size(){
        return count;
    }
}