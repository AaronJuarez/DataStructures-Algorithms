/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms.impl;

import datastructures.algorithms.inter.Tree;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aaron
 */
public class TreeImpl implements Tree{
    
    private int value;
    private List<Tree> children = new ArrayList<>();
    
    
    @Override
    public void addChild(int value) {
        Tree child = new TreeImpl();
        child.setValue(value);
        children.add(child);
    }

    @Override
    public boolean contains(int value) {
        boolean containsValue = false;
        
        if(value == this.getValue()) {
            containsValue = true;
            
        }else {
            if(this.getChildren().length > 0) {
                
               for(Tree child : this.getChildren()) {
                    if(child.contains(value)) {
                        containsValue = true;
                        break;
                    }
                } 
            }
           
        }
        return containsValue;
    }
    
    @Override
    public Tree[] getChildren() {
        Tree[] elements = new TreeImpl[children.size()];
        
        for(int i=0; i<elements.length; i++) {
            elements[i] = children.get(i);
        }
        
        return elements;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    @Override
    public void setValue(int value) {
        this.value = value;
    }
    
    
}
