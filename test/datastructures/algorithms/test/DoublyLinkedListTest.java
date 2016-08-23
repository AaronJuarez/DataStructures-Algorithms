/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms.test;

import datastructures.algorithms.inter.DoublyLinkedList;
import datastructures.algorithms.impl.DoublyLinkedListImpl;
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
public class DoublyLinkedListTest {
    
    DoublyLinkedList doublyLinkedList;
    int[] elements; 
    
    @Before
    public void setUp() {
        doublyLinkedList = new DoublyLinkedListImpl();
        elements= new int[]{1,2,3,4,5};
    }
    
    @Test
    public void happyPath() {
        for(int i = 0 ; i<elements.length; i++){
            doublyLinkedList.insertFirst(elements[i]);
        }
        
        doublyLinkedList.displayForward();

        System.out.println(doublyLinkedList.deleteFirst());
        System.out.println(doublyLinkedList.deleteLast());
        doublyLinkedList.displayForward();
        doublyLinkedList.insertAfter(8, 3);
        doublyLinkedList.displayBackward();
        doublyLinkedList.insertLast(10);
        doublyLinkedList.displayForward();
        System.out.println(doublyLinkedList.deleteElement(8));
        doublyLinkedList.displayForward();
        System.out.println(doublyLinkedList.deleteElement(8));
    }
}
