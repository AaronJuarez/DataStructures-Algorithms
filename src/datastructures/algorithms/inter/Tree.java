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
public interface Tree {
    
    void addChild(int value);
    boolean contains(int value);
    Tree[] getChildren();
    int getValue();
    void setValue(int data);
}
