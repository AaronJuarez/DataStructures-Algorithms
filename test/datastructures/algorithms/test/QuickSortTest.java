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

/**
 *
 * @author Aaron
 */
public class QuickSortTest {
    double[] elements;
    QuickSort quickSort;
    
    @Before
    public void setUp() {
        /*
        elements = new double[10];
        
        for(int i=0; i<elements.length; i++) {
            double num = Math.round(Math.random()*10000);
            elements[i] = num/100;
        }
        */
        elements = new double[] {77.85, 30.86, 22.99, 46.32, 48.01, 79.86, 68.73, 57.62, 28.04, 34.42};
        quickSort = new QuickSortImpl(elements);
    }
    
    @Test
    public void happyPath() {
        quickSort.display();
        quickSort.sortIt();
        quickSort.display();
    }
}
