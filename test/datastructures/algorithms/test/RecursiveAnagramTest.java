/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms.test;

import datastructures.algorithms.impl.RecursiveAnagram;
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
public class RecursiveAnagramTest {
    RecursiveAnagram recursiveAnagram;
    
    @Before
    public void setUp() {
        recursiveAnagram = new RecursiveAnagram();
    }
    
    @Test
    public void happyPath() {
        recursiveAnagram.doAnagram("cats");
    }

}
