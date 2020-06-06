/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author Harlericho
 */
public class Ejercicio2 {
 
    public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    int mcd=0;
    int num;
        System.out.println("Ingrese numero a calcular el mcd: ");
        num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            if(num % i ==0){
                mcd =i;
            }
        }
        
        System.out.println("El numero ingresado que es: "+num+"\nSu mcd es: "+mcd);
    }
}
