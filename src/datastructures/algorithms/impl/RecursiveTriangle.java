
package datastructures.algorithms.impl;


public class RecursiveTriangle {
    
    public int triangle(int n){
        int res = 0;
        if (n == 1){
            res = 1;
        }else{
            res = n + triangle(n-1);
        }
        return res;
    }
    
}
