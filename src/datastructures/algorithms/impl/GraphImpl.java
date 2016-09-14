/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms.impl;

import datastructures.algorithms.inter.Graph;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Aaron
 */
public class GraphImpl implements Graph {
    List<GraphNode> vertices = new ArrayList<>();

    @Override
    public void addNode(int value) {
        GraphNode node = new GraphNode();
        node.setValue(value);
        vertices.add(node);
    }

    @Override
    public boolean contains(int value) {
        boolean containsNode = false;
        
        for(GraphNode n : vertices) {
            if(n.getValue() == value) {
                containsNode = true;
                break;
            }
        }
        
        return containsNode;
    }

    @Override
    public void removeNode(int value) {
        
        for(GraphNode n : vertices) {
            if(n.getValue() == value) {
                vertices.remove(n);
                break;
            }
        }
    }

    @Override
    public boolean hasEdge(int from, int to) {
        boolean hasEdge = false;
        
        for(GraphNode n : vertices) {
            if(n.getValue() == from && n.getEdges().contains(to)) {
                hasEdge = true;
                break;  
            }
        }
        
        return hasEdge;
    }

    @Override
    public void addEdge(int from, int to) {
        
        for(GraphNode n : vertices) {
            if(n.getValue() == from) {
                n.getEdges().add(to);
                break;
            }
        }
        
    }

    @Override
    public void removeEdge(int from, int t) {
        List<Integer> edges = null;
        Integer to = t;
        
        for(GraphNode n : vertices) {
            if(n.getValue() == from) {
                edges = n.getEdges();
                break;
            }
        }
        
        if(edges != null) {
            edges.remove(to);
        }
        
    }
    
    
    private class GraphNode {
        private int value;
        private List<Integer> edges = new ArrayList<>();

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
        
        public List<Integer> getEdges() {
            return edges;
        }
        
    }
    
}
