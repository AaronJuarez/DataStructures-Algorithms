/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms.inter;

import datastructures.algorithms.impl.LinkedListImpl;

/**
 *
 * @author Aaron
 */
public interface LinkedList<E> {
    void insert(E elem);
    E delete();
    E find(E elem);
    void display();
    boolean isEmpty();
    E returnFirst();
}
