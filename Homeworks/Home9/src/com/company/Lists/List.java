package com.company.Lists;

/**
 * Created by IVIlin on 24.10.2017.
 */
public interface List {
    void addToEnd(int element);
    void addToBegin(int element);
    Iterator iterator();
    int size();
    void doReverseList();
    void addByIndex(int index, int element);
    void deleteByIndex(int index);
    void deleteByElement(int element);
    void printList();
}
