/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms.inter;

/**
 *
 * @author Aaron
 */
public interface LinkStack<E> {
    void push(E elem);
    E pop();
    E peek();
    void displayStack();
    boolean isEmpty();
}
