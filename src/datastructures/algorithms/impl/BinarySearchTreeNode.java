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
public class BinarySearchTreeNode {

    private int data;
    private BinarySearchTreeNode right = null;
    private BinarySearchTreeNode left = null;

    public BinarySearchTreeNode(int value) {
        data = value;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinarySearchTreeNode getRight() {
        return right;
    }

    public void setRight(BinarySearchTreeNode right) {
        this.right = right;
    }

    public BinarySearchTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinarySearchTreeNode left) {
        this.left = left;
    }

}
