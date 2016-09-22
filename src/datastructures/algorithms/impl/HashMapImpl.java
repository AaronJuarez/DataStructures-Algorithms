/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms.impl;

import datastructures.algorithms.inter.HashMap;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aaron
 */
public class HashMapImpl implements HashMap{
    private List[] elements;
    private final int arraySize;
    
    public HashMapImpl(int size) {
        arraySize = size;
        elements = new ArrayList[arraySize];
    }

    @Override
    public void insert(String key, String value) {
        int index = hashFunc(key);
        HashMapElement elem = new HashMapElement(key, value);
        List<HashMapElement> innerList;
        
        if(elements[index] == null) {
            innerList = new ArrayList<>();
            elements[index] = innerList;
            
        }else {
            innerList = elements[index];
        }
        
        innerList.add(elem);
        
        for(HashMapElement e : innerList) {
            if(key.equals(e.getKey())) {
                e.setValue(value);
            }
        }
        
        
    }

    @Override
    public void remove(String key) {
        int index = hashFunc(key);
        List<HashMapElement> innerList = elements[index];
        HashMapElement removedElem = null;
        
        if(innerList != null) {
            for(HashMapElement e : innerList) {
                if(key.equals(e.getKey())) {
                    removedElem = e;
                    break;
                }
            }
            innerList.remove(removedElem);
        }
        
    }

    @Override
    public String retreive(String key) {
        int index = hashFunc(key);
        List<HashMapElement> elems = elements[index];
        String retreived = null;
        
        if(elems != null) {
           
            for(HashMapElement e : elems) {
                if(key.equals(e.getKey())) {
                    retreived = e.getValue();
                }   
            }
        
        }
        
        
        return retreived;
    }
    
    @Override
    public int hashFunc(String key) {
        int pow27 = 1;
        int hashVal = 0;
        key = key.toLowerCase();
        
        for(int i = key.length()-1; i>=0; i--) {
            
            int letter = key.charAt(i)-96;
            hashVal += letter * pow27;
            pow27 *= 27;
        }

        return hashVal % arraySize;
    }
    
    private class HashMapElement {
        private final String key;
        private String value;
        
        public HashMapElement(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
        
        public void setValue(String value) {
            this.value = value;
        }
 
    }
    
}
