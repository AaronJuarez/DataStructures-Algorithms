/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms.test;

import datastructures.algorithms.inter.LinkQueue;
import datastructures.algorithms.impl.LinkQueueImpl;
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
public class LinkQueueTest {
    LinkQueue linkQueue;
    int[] elements;
    
    @Before
    public void setUp() {
        linkQueue = new LinkQueueImpl();
        elements = new int[] {1,2,3,4,5};
    }
    
    @Test
    public void happyPath() {
        for(int i=0; i<elements.length; i++){
            linkQueue.insert(elements[i]);
        }
        linkQueue.displayQueue();
        linkQueue.remove();
        linkQueue.remove();
        linkQueue.peek();
        linkQueue.displayQueue();
    }

}
