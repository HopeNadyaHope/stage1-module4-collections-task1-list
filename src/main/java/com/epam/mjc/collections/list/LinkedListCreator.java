package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(Integer integer: sourceList){
            if(integer % 2 == 1) {
                linkedList.addFirst(integer);
            } else {
                linkedList.addLast(integer);
            }
        }
        return linkedList;

    }
}