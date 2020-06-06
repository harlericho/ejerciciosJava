/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimalbinario;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.util.Scanner;

/**
 *
 * @author Harlericho
 */
public class Ejercicio {
     public static void main(String[] args) {
        // TODO code application logic here
        /*
        int numero;
        Scanner scn =new Scanner(System.in);
        System.out.println("Ingrese un numero entero mayor que 0");
        numero = scn.nextInt();
        int residuo;
        int r=0;
        double bin =0;
        while(numero!=0){
        r = numero %2;
        bin = bin + r * Math.pow(10, r);
        r++;
        numero = numero/2;
        }
        System.out.printf("Binario: %.0f %n", bin);
*/
         System.out.println(2+6>>2);
    }
}
