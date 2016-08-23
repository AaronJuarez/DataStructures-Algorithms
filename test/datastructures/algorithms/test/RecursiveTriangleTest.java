/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms.test;

import datastructures.algorithms.impl.RecursiveTriangle;
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
public class RecursiveTriangleTest {
    RecursiveTriangle triangle;
    int num;
    int res;
    
    @Before
    public void setUp() {
        triangle = new RecursiveTriangle();
        num = 4;
    }
    
    @Test
    public void happyPath() {
        res = triangle.triangle(num);
        System.out.println(res);
    }

}
