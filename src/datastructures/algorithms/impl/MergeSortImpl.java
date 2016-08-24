
package datastructures.algorithms.impl;

import datastructures.algorithms.inter.MergeSort;


public class MergeSortImpl<E> implements MergeSort<E>{
    private Double[] elements;
    
    public MergeSortImpl(E[] elemArray) throws Exception {
        
        if(elemArray.length != 0) {
        
            if(elemArray[0] instanceof Double || elemArray[0] instanceof Integer
                    || elemArray[0] instanceof Float) {
                System.out.println("is supported");
                elements = (Double[]) elemArray;
            } else {
                throw new Exception("Value not supported");
            }
            
        }else {
            throw new Exception("Array length must not be cero");
        }
        
    }
    
    @Override
    public void doMerge(){
        double[] workspace = new double[elements.length];
        split(0, elements.length-1, workspace);
    }

    @Override
    public void merge(int startIdx1, int endIdx1, int startIdx2, int endIdx2, double[] workspace) {
        int start = startIdx1;
        int position = startIdx1;
        
        while(startIdx1 <= endIdx1 && startIdx2 <= endIdx2){
            if(elements[startIdx1] < elements[startIdx2]){
                workspace[position] = elements[startIdx1];
                startIdx1++;
                position++;
            }else{
                workspace[position] = elements[startIdx2];
                startIdx2++;
                position++;
            }
        }
        
        while(startIdx1 <= endIdx1){
            workspace[position] = elements[startIdx1];
            startIdx1++;
            position++;
        }
        
        while(startIdx2 <= endIdx2){
            workspace[position] = elements[startIdx2];
            startIdx2++;
            position++;
        }
        addToElements(start, endIdx2, workspace);
    }

    @Override
    public void split(int startIdx, int endIdx, double[] workspace) {
        
        if(startIdx != endIdx){
            int midIdx = (startIdx + endIdx)/2;
            split(startIdx, midIdx, workspace);
            split(midIdx+1, endIdx, workspace);
            merge(startIdx, midIdx, midIdx+1, endIdx, workspace);
        }
    }
    
    @Override
    public void addToElements(int startIdx, int endIdx, double[] workspace){
        for(int i = startIdx; i <= endIdx; i++){
            elements[i] = workspace[i];
        }
    }
    
    @Override
    public void display(){
        for(int i=0; i<getElements().length; i++){
            System.out.print(getElements()[i] + " ");
        }
        System.out.println();
    }

    @Override
    public E[] getElements() {
        E[] elems = (E[]) elements;
        return elems;
    }
    
}
