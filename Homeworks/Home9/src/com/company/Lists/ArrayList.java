package com.company.Lists;

public class ArrayList implements List {
    private static final int MAX_SIZE = 10;
    private int elements[];
    private int count;

    public ArrayList() {
        this.elements = new int[MAX_SIZE];
        this.count = 0;
    }
    public void addByIndex(int index, int element){
            if (index == count && index < elements.length){
                elements[index] = element;
                count++;
                return;
            }
        if (index < count)
        {
            elements[index] = element;
        }
        return;
    }

    @Override
    public void deleteByIndex(int index){
        if (index >= count)
            return;
        if (index == count-1)
        {
            count--;
            return;
        }
        for (int i = index; i < count - 1; i++){
            elements[i] = elements[i + 1];
        }
        count--;
        return;
    }

    @Override
    public int size(){
        return count;
    }

    @Override
    public void addToEnd(int element) {
        if (count < MAX_SIZE) {
            elements[count] = element;
            count++;
        } else {
            System.err.println("Нет места");
        }
    }
    public void printList(){// Решил реализовать не через итератор
        System.out.print("Array List = ");
        for (int i = 0; i < count; i++){
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
    public void doReverseList(){
//        System.out.println(count);
        if (count == 0 || count == 1) {
            return;
        }
        for (int i = count-1; i >= count/2  ; i--){
            int temp = elements[i];
            elements[i] = elements[count-1-i];
            elements[count-1-i] = temp;
        }
        return;
    }
   public void deleteByElement(int element){
        for (int i = 0; i < count; i++)
        {
            if (elements[i] == element){
                for (int j = i; j < count; j++){
                    elements[j] = elements[j + 1];
                }
                count--;
                return;
            }
        }
       System.out.printf("Увы, но такого элемента нет");
       return;
    }

    @Override
    public void addToBegin(int element) {
        if (count < elements.length){
            for (int i = count-1; i >= 0  ; i--){
                elements[i+1] = elements[i];
            }
            elements[0] = element;
        }
    }

    @Override
    public Iterator iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator {

        private int current;

        public ArrayListIterator() {
            current = 0;
        }

        @Override
        public int next() {
            int element = elements[current];
            current++;
            return element;
        }

        @Override
        public boolean hasNext() {
            return current < count;
        }
    }
}