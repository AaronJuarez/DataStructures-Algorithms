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
public interface QuickSort<E> {
    
    int partitionIt(int left, int right, double pivot);
    void sortIt();
    void recQuickSort(int left, int right);
    void swap(int elem1, int elem2);
    void display();
    
    
}
