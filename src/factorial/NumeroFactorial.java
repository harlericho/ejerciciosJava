/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author Harlericho
 */
public class NumeroFactorial {
    
    public static void main(String[] args){
    int a=0;
    int b=1;
    int c, j;
    int serie =15;
        for (j = 1; j<serie; j++) {
            c=a+b;
            a=b;
            b=c;
            System.out.println(" "+a);
        }
    
    }
}
