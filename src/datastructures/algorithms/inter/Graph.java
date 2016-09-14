/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms.inter;

/**
 *
 * @author Aaron
 */
public interface Graph {
    void addNode(int value);
    boolean contains(int value);
    void removeNode(int value);
    boolean hasEdge(int from, int to);
    void addEdge(int from, int to);
    void removeEdge(int from, int to);
    
}
