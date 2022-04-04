/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack.PastYear;

/**
 *
 * @author user
 */
public class testStack {
    public static void main (String[] args) {
        Stack stkl = new Stack();
        Stack stk2 = new Stack();
        Stack temp = new Stack();
        
        int count = 0;
        
        for (int n = 100; n < 110; n++) {
            stkl.push(n + count);
            count = count + 1;
            if (count >= 3)
                count = 1;
        }
        
        //Line XX
        stk2.push('a') ; 
        stk2.push('b'); 
        stk2.push('c' );
        stk2.push('d'); 
        stk2.push('e') ; 
        stk2.push('f') ;
        
        //Line YY. Add code statements here.
        
        //display
        System.out.println(stkl.pop());
        System.out.println(stk2.pop());
        System.out.println(stk2.toString());

    }//main
}//class
