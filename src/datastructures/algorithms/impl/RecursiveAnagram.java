/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms.impl;

/**
 *
 * @author Aaron
 */
public class RecursiveAnagram {
    char[] wordArray;
    int size;
    
    public void doAnagram(String word){
        wordArray = new char[word.length()];
        size = wordArray.length;
        for(int i=0; i<word.length(); i++){
            wordArray[i] = word.charAt(i);
        }
        anagram(wordArray.length);
    }
    
    public void anagram(int newSize){
        if(newSize == 1){
            return;
        }
        
        for(int i=0; i<newSize; i++){
            anagram(newSize-1);
            if(newSize == 2){
                display();
            }
        
            rotate(newSize);
        }
    }
    
    public void rotate(int newSize){
        int j;
        int position = size-newSize;
        char firstChar = wordArray[position];
        for(j=position+1; j<size; j++){
            wordArray[j-1] = wordArray[j];
        }
        wordArray[j-1] = firstChar;
    }
    
    public void display(){
        System.out.println();
        for(char c : wordArray){
            System.out.print(c);
        }
        System.out.println();
    }
    
}
