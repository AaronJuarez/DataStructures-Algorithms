/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms.impl;

import datastructures.algorithms.inter.QuickSort;

/**
 *
 * @author Aaron
 */
public class QuickSortImpl<E> implements QuickSort<E>{
    private double[] elements;
    private int nElems;
    
    public QuickSortImpl(double[] elements) {
        this.elements = elements;
        nElems = elements.length;
        System.out.println("nElems: " + nElems);
    }
    
    @Override
    public void sortIt() {
        recQuickSort(0, nElems-1);
    }
    
    @Override
    public void recQuickSort(int left, int right) {
        if(right-left <= 0) {
            return;
        }else {
            double pivot = elements[right];
            int partition = partitionIt(left, right, pivot);
            recQuickSort(left, partition-1);
            recQuickSort(partition+1, right);
        }
    }

    @Override
    public int partitionIt(int left, int right, double pivot) { 
        int leftPtr = left-1 ;
        int rightPtr = right;
        int partition;
        
        while(true) {
        
            while(elements[++leftPtr] < pivot) {
                ;
            }

            while(rightPtr > 0 && elements[--rightPtr] > pivot) {
                ;
            }
            
            if(leftPtr >= rightPtr) {
                break;
            }

            swap(leftPtr, rightPtr);
        
        }
        partition = leftPtr;
        swap(partition, right);
        display();
        
        return partition;
    }

    @Override
    public void swap(int elem1, int elem2) {
        double temp = elements[elem1];
        elements[elem1] = elements[elem2];
        elements[elem2] = temp;
    }
    
    @Override
    public void display() {
        for(double e : elements) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
    
}
