/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.algorithms.impl;

import datastructures.algorithms.inter.ShellSort;

/**
 *
 * @author Aaron
 */
public class ShellSortImpl implements ShellSort {

    int size;
    int h = 1;
    int[] elements;

    public ShellSortImpl(int[] elem) {
        elements = elem;
        size = elements.length;
    }

    @Override
    public void knuthSecuence() {

        while (h <= size / 3) {
            h = (3 * h) + 1;
        }
        System.out.println(h);
    }

    @Override
    public void inverseknuthSecuence() {
        h = (h - 1) / 3;
        System.out.println(h);
    }

    @Override
    public void sort() {
        int out;
        int in;
        
        knuthSecuence();
        
        while(h != 1) {
            for(out=h; out<elements.length; out=out+h){
                in = out;
                int temp = elements[out];
                while(in>0 && elements[in-h]>temp){
                    elements[in] = elements[in-h];
                    in = in - h;
                }
                elements[in] = temp;
            }
            inverseknuthSecuence();
        }
    }



    @Override
    public void display() {
        System.out.println();
        for (int elem : elements) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
