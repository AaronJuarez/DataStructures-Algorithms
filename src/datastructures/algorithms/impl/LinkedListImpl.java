/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms.impl;

import datastructures.algorithms.inter.LinkedList;

/**
 *
 * @author Aaron
 */
public class LinkedListImpl<E> implements LinkedList<E>{
    private Link first;
    private int size;

    
    @Override
    public void insert(E elem) {
        Link temp = new Link(elem);
        temp.setNext(first);
        first = temp;
        size++;
    }

    @Override
    public E delete() {
        Link temp = first;
        first = first.getNext();
        size--;
        return temp.getData();
    }

    @Override
    public E find(E elem) {
        Link current = first;
        E data = null;
        
        while(current != null){
            if(current.getData().equals(elem)){
                data = current.getData();
                break;
            }
        }
        return data;
    }
    
    @Override
    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public void display() {
        Link current = first;
        while(current != null){
            System.out.print(current.getData());
            current = current.getNext();
        }
        System.out.println();
        
    }
    
    @Override
    public E returnFirst(){
        if(!isEmpty()){
            return first.getData();
        }
        return null;
    }
    
    class Link {
        private final E data;
        private Link next;
        
        public Link(E elem){
            this.data = elem;
        }

        public E getData() {
            return data;
        }

        public Link getNext() {
            return next;
        }

        public void setNext(Link next) {
            this.next = next;
        }
        
        
    }
    
}
