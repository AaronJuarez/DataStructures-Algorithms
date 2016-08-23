/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms.impl;

import datastructures.algorithms.inter.DoubleEndedList;
import datastructures.algorithms.inter.LinkQueue;

/**
 *
 * @author Aaron
 */
public class LinkQueueImpl<E> implements LinkQueue<E> {
    DoubleEndedList<E> list = new DoubleEndedListImpl<>();

    @Override
    public void insert(E elem) {
        list.insertFirst(elem);
    }

    @Override
    public E remove() {
        return list.deleteLast();
    }

    @Override
    public E peek() {
        return list.returnFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    @Override
    public void displayQueue(){
        list.displayList();
    }
}
