/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms.test;

import datastructures.algorithms.impl.BinarySearchTreeImpl;
import datastructures.algorithms.inter.BinarySearchTree;
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
public class BinarySearchTreeTest {
    BinarySearchTree tree;
    int[] elements;
    
    @Before
    public void setUp() {
        tree = new BinarySearchTreeImpl(5);
        elements = new int[]{2,3,7,6};
    }

    @Test
    public void testInsert() {
        
        for(int data : elements){
            tree.insert(data);
        }
        
        assertEquals(tree.getRoot().getLeft().getRight().getData(), 3);
        assertEquals(tree.getRoot().getRight().getLeft().getData(), 6);
        
    }
    
    @Test
    public void testContains() {
        for(int data : elements){
            tree.insert(data);
        }
        assertEquals(tree.contains(7), true);
    }
    
    @Test
    public void testDepthFirstLog() {
        tree = new BinarySearchTreeImpl(5);
        elements = new int[]{2,3};
        int[] expected = new int[]{5, 2, 3};
        
        
        for(int data : elements){
            tree.insert(data);
        }
        
        assertArrayEquals(expected, tree.depthFirstLog());
    }
}
