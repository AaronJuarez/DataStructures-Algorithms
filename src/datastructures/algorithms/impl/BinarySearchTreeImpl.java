/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms.impl;

import datastructures.algorithms.inter.BinarySearchTree;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Aaron
 */
public class BinarySearchTreeImpl implements BinarySearchTree {
    private BinarySearchTreeNode root;
    
    public BinarySearchTreeImpl(int value) {
        root = new BinarySearchTreeNode(value);
    }

    @Override
    public void insert(int data) {
        BinarySearchTreeNode current = root;
        
        while(current.getData() != data) {
            
            if(data < current.getData()) {
                if(current.getLeft() == null) {
                    current.setLeft(new BinarySearchTreeNode(data));  
                }
                current = current.getLeft();
                
            }else {
                if(current.getRight() == null) {
                    current.setRight(new BinarySearchTreeNode(data));   
                }
                current = current.getRight();
            }

        }
        
    }

    @Override
    public boolean contains(int data) {
        BinarySearchTreeNode current = root;
        boolean containsValue = false;
        
        while(true) {
            
            if(data < current.getData()) {
                current = current.getLeft();
            }else {
                current = current.getRight();
            }
            
            if(current.getData() == data) {
                containsValue = true;
                break;
            }
        }
        
        return containsValue;
    }

    @Override
    public int[] depthFirstLog() {
        List<Integer> elements = new ArrayList<>();
        BinarySearchTreeNode current = root;
        
        preorder(current, elements);
        
        int[] returnElements = new int[elements.size()];
        Iterator<Integer> iter = elements.iterator();
        
        for(int i=0; i<returnElements.length; i++) {
            returnElements[i] = iter.next().intValue();
        }
        
        return returnElements;
    }
    
    public void preorder(BinarySearchTreeNode current, List<Integer> elems) {
        elems.add(current.getData());
        
        if(current.getLeft() != null) {
            preorder(current.getLeft(), elems);
        }
        
        if(current.getRight() != null) {
            preorder(current.getRight(), elems);
        }
        
    }
    
    @Override
    public BinarySearchTreeNode getRoot() {
        return root;
    }
    
    
}
