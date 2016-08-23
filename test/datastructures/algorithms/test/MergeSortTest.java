/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms.test;

import datastructures.algorithms.inter.MergeSort;
import datastructures.algorithms.impl.MergeSortImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aaron
 */
public class MergeSortTest<E> {
    MergeSort mergeSort;
    /**
    @Test
    public void intTest() {
        Object[] elements = new Integer[]{9,8,7,6,5,4,3,2,1,0};
        
        try{
            mergeSort = new MergeSortImpl(elements);
            //assertFalse(mergeSort.getElements()[0] instanceof String);
            mergeSort.doMerge();
            mergeSort.display();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    **/
    @Test
    public void doubleTest(){
        Object[] elements = new Double[]{9.4,8.4,7.6,6.3,5.9,4.7,3.2,2.8,1.3,0.8};
        
        try{
            mergeSort = new MergeSortImpl(elements);
            //assertFalse(mergeSort.getElements()[0] instanceof String);
            mergeSort.doMerge();
            mergeSort.display();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    /**
    @Test
    public void stringTest() {
        Object[] elements = new String[]{"this","is","a","string", "test"};
        
        try{
            mergeSort = new MergeSortImpl(elements);
            mergeSort.doMerge();
            mergeSort.display();
        }catch(Exception e){
            System.out.println("String array");
        }
    }
    **/
    
}
