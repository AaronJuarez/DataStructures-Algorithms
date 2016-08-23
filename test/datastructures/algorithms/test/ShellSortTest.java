/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms.test;

import datastructures.algorithms.inter.ShellSort;
import datastructures.algorithms.impl.ShellSortImpl;
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
public class ShellSortTest {
    ShellSort shellSort;
    int size = 10;
    int[] elem;
    
    @Before
    public void setUp() {
        
        elem = new int[size];
        int count = 0;
        
        while(count < size){
            int temp =(int) Math.round(Math.random()*100);
            elem[count] = temp;
            count++;
        }
        shellSort = new ShellSortImpl(elem);
    }
    
    @Test
    public void happyPath() {
        shellSort.display();
        shellSort.sort();
        //int minPos = shellSort.findMin(0);
        //shellSort.orderElem(minPos);
        shellSort.display();
    }

}
