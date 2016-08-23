/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms.impl;

import datastructures.algorithms.inter.LinkStack;
import datastructures.algorithms.inter.LinkedList;

/**
 *
 * @author Aaron
 * @param <E>
 */
public class LinkStackImpl<E> implements LinkStack<E> {
    LinkedList<E> linkedList = new LinkedListImpl<>();

    @Override
    public void push(E elem) {
        linkedList.insert(elem);
    }

    @Override
    public E pop() {
        return linkedList.delete();
    }

    @Override
    public E peek() {
        return linkedList.returnFirst();
    }

    @Override
    public void displayStack() {
        linkedList.display();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }
    
}
