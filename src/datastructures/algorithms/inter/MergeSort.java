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
public interface MergeSort<E> {
    void doMerge();
    void merge(int startIdx1, int endInx1, int startIdx2, int endIdx2, double[] workspace);
    void split(int index1, int index2, double[] workspace);
    void addToElements(int startIdx, int endIdx, double[] workspace);
    void display();
    public E[] getElements();
}
