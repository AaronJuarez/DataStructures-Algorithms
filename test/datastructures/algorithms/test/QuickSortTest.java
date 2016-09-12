/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms.test;

import datastructures.algorithms.impl.QuickSortImpl;
import datastructures.algorithms.inter.QuickSort;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Aaron
 */
public class QuickSortTest {
    Double[] elements;
    QuickSort quickSort;
    
    //@Rule
    //public ExpectedException thrown = new ExpectedException.none();
    
    @Before
    public void setUp() throws Exception{
        
        elements = new Double[10];
        
        for(int i=0; i<elements.length; i++) {
            double num = Math.round(Math.random()*10000);
            elements[i] = num/100;
        }
        
        quickSort = new QuickSortImpl();
        quickSort.setElements(elements);
    }
    
    @Test
    public void happyPath() {
        quickSort.display();
        quickSort.sortIt();
        quickSort.display();
    }
    
    @Test
    public void stringArray() throws Exception{
        String[] elems = new String[] {"string", "test"};
        quickSort.setElements(elems);
    }
}
