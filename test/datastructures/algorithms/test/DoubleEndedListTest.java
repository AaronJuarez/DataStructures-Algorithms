/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms.test;

import datastructures.algorithms.inter.DoubleEndedList;
import datastructures.algorithms.impl.DoubleEndedListImpl;
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
public class DoubleEndedListTest {
    DoubleEndedList doubleEndedList;
    int[] elements; 
    
    @Before
    public void setUp() {
        doubleEndedList = new DoubleEndedListImpl();
        elements= new int[]{1,2,3,4,5};
    }
    
    @Test
    public void happyPath() {
        for(int i = 0 ; i<elements.length; i++){
            doubleEndedList.insertFirst(elements[i]);
        }
        
        doubleEndedList.displayList();
        
        doubleEndedList.deleteFirst();
        doubleEndedList.deleteLast();
        doubleEndedList.displayList();
        doubleEndedList.insertAfter(8, 3);
        doubleEndedList.displayList();
        doubleEndedList.insertLast(10);
        doubleEndedList.displayList();
    }
}
