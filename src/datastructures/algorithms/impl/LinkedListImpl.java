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
        temp.next = getFirst();
        setFirst(temp);
        setSize(getSize() + 1);
    }

    @Override
    public E delete() {
        Link temp = getFirst();
        setFirst(getFirst().next);
        return temp.data;
    }

    @Override
    public E find(E elem) {
        Link current = getFirst();
        E data = null;
        
        while(current != null){
            if(current.data.equals(elem)){
                data = current.data;
                break;
            }
        }
        return data;
    }
    
    @Override
    public boolean isEmpty(){
        return getSize() == 0;
    }

    @Override
    public void display() {
        Link current = getFirst();
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        
    }
    
    @Override
    public E returnFirst(){
        if(!isEmpty()){
            return first.data;
        }
        return null;
    }


    public Link getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(Link first) {
        this.first = first;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    
    
    public class Link {
        private E data;
        private Link next;
        
        public Link(E elem){
            this.data = elem;
        }
        
        public void displayLink(){
            System.out.println(data);
        }
        
    }
    
}
