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
public class EjercicioP {
public static void main(String[] args){
    Scanner entrada=new Scanner(System.in);
        System.out.println("Digite cuantos paises desea ingresar");
        int numpais=entrada.nextInt();
        
        String [] paises=new String[numpais];
        
        for (int i = 0; i < paises.length; i++) {
        System.out.println("Digite el pais " + (i+1));     
            paises[i]=entrada.next();
        }
        
        for (int i = 0; i < paises.length; i++) {
            System.out.println("El pais " + (i+1) + " es: " + paises[i]);
            
        }

}
}
