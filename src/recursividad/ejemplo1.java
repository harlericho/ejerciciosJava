/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author Harlericho
 */
public class ejemplo1 {
    public static double potencia(double x, double n)
      {
        if(n==0) return 1;
        else return x*potencia(x,n-1);
      }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n;
        double x;
        System.out.print("Valor de x :");
        x= in.nextDouble();
        do{
            System.out.print("valor de n : ");
            n=in.nextInt();
        }while(n<=0);
        System.out.println(x+" elevado a la "+n+
                        " es igual a "+potencia(x,n));
    }
}
