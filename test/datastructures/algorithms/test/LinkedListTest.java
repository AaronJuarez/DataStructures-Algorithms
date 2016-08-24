/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms.test;

import datastructures.algorithms.inter.LinkedList;
import datastructures.algorithms.impl.LinkedListImpl;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
public class LinkedListTest {
    LinkedList linkedList;
    int[] elements;
    
    @Before
    public void setUp() {
        linkedList = new LinkedListImpl();
        elements = new int[] {1,2,3,4,5};
        
    }
    
    @Test
    public void happyPath() {
        
        for(int i=0; i<elements.length; i++){
            linkedList.insert(elements[i]);
        }
        linkedList.display();
        linkedList.delete();
        linkedList.display();
        
    }

}
