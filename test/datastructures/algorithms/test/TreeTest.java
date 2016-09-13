/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms.test;

import datastructures.algorithms.impl.TreeImpl;
import datastructures.algorithms.inter.Tree;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aaron
 */
public class TreeTest {
    
    @Test
    public void addChildren() {
        Tree tree = new TreeImpl();
        tree.addChild(5);
        Tree[] children =  tree.getChildren();
        assertEquals(children[0].getValue(), 5);
    }
    
    @Test
    public void containsElement() {
        Tree tree = new TreeImpl();
        tree.addChild(5);
        assertTrue(tree.contains(5));
    }
    
    @Test
    public void notContainsElement() {
        Tree tree = new TreeImpl();
        tree.addChild(5);
        assertFalse(tree.contains(6));
    }
    
    @Test
    public void addChildrenToChild() {
        Tree tree = new TreeImpl();
        tree.addChild(5);
        
        Tree child = tree.getChildren()[0];
        child.addChild(6);
        
        int value = child.getChildren()[0].getValue();
        assertEquals(value, 6);
    }
    
    @Test
    public void detectNestedChildren() {
        Tree tree = new TreeImpl();
        tree.addChild(5);
        tree.addChild(6);
        
        Tree child = tree.getChildren()[0];
        child.addChild(7);
        
        child = tree.getChildren()[1];
        child.addChild(8);
        
        assertTrue(tree.contains(7));
        assertTrue(tree.contains(8));
    }
    
}
