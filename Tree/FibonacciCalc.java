/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author user
 */
public class FibonacciCalc {
    
    public static int fibonacciRecursion(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
    }
    public static void main(String args[]) {
        int maxNumber = 10;
        System.out.print("Fibonacci Series of "+maxNumber+" numbers: ");
        for(int i = 0; i < maxNumber; i++){
            System.out.print(fibonacciRecursion(i) +" ");
        }
    }
}

