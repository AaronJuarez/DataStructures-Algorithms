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
public interface HashMap {
    void insert(String key, String value);
    void remove(String key);
    String retreive(String key);
    int hashFunc(String key);
}
