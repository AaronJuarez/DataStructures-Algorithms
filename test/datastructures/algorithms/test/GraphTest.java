/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms.test;

import datastructures.algorithms.impl.GraphImpl;
import datastructures.algorithms.inter.Graph;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aaron
 */
public class GraphTest {
    
    
    @Test
    public void storeNodes() {
        Graph graph = new GraphImpl();
        
        graph.addNode(1);
        assertTrue(graph.contains(1));
    }
    
    @Test
    public void removeNodes() {
        Graph graph = new GraphImpl();
        
        graph.addNode(2);
        assertTrue(graph.contains(2));
        graph.removeNode(2);
        assertFalse(graph.contains(2));
    }
    
    @Test
    public void createEdges() {
        Graph graph = new GraphImpl();
        
        graph.addNode(2);
        graph.addNode(1);
        graph.addNode(3);
        
        graph.addEdge(3, 2);
        assertTrue(graph.hasEdge(3, 2));
        assertFalse(graph.hasEdge(3, 1));
        
    }
    
    @Test
    public void removeEdges() {
        Graph graph = new GraphImpl();
        
        graph.addNode(4);
        graph.addNode(5);
        
        graph.addEdge(5, 4);
        assertTrue(graph.hasEdge(5, 4));
        
        graph.removeEdge(5, 4);
        assertFalse(graph.hasEdge(5, 4));
        
    }
    
    @Test
    public void eachNode() {
    }
}
