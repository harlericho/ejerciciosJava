/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioJava;

import java.util.Scanner;

/**
 *
 * @author Harlericho
 */
public class java {
    
  
     public static void main(String[] args){
         Scanner scn=new Scanner(System.in);
       int a=10;
       int b=0;
       int c=0;
         try {
             c=a/b;
             //System.out.println("Division es: "+c);
         } catch (Exception e) {
             System.out.println(""+e);
         }finally{
             System.out.println("Division es: "+c);
         }
       int numero=0;
         System.out.println("Digite un numero:");
         try {
             numero=scn.nextInt();
         } catch (Exception e) {
             System.out.println("No me diste un numero entero");
         }
         finally{
             System.out.println(numero);
         }
     }
}
