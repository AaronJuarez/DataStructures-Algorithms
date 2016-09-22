/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms.test;

import datastructures.algorithms.impl.HashMapImpl;
import datastructures.algorithms.inter.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 *
 * @author Aaron
 */
public class HashMapTest {
    
    
    @Test
    public void storeValues() {
        HashMap hashMap = new HashMapImpl(8);
        hashMap.insert("Steven", "Seagal");
        assertEquals("Seagal", hashMap.retreive("Steven"));
        
    }
    
    @Test
    public void notInsertedValues() {
        HashMap hashMap = new HashMapImpl(8);
        hashMap.insert("Steven", "Spilberg");
        assertThat(hashMap.retreive("Steven"), not("Seagal"));
        
    }
    
    @Test
    public void overWriteSameKey() {
        HashMap hashMap = new HashMapImpl(8);
        hashMap.insert("Bob", "Loblaw");
        hashMap.insert("Bob", "Barker");
        assertEquals(hashMap.retreive("Bob"), "Barker");
        
    }
    
    @Test
    public void containRemoved() {
        HashMap hashMap = new HashMapImpl(8);
        hashMap.insert("Steven", "Tyler");
        hashMap.remove("Steven");
        assertNull(hashMap.retreive("Steven"));
        
    }
    
    
}
