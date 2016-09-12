/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms.inter;

import datastructures.algorithms.impl.BinarySearchTreeNode;
import java.util.List;

/**
 *
 * @author Aaron
 */
public interface BinarySearchTree {
    void insert(int data);
    boolean contains(int data);
    int[] depthFirstLog();
    BinarySearchTreeNode getRoot();
}
