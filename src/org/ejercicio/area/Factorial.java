package org.ejercicio.area;

import java.util.Scanner;

public class Factorial 
{
	 public static void main(String[] args) {
	        //Ej.: El factorial de 5 es: 5*4*3*2*1
	        long factorial=1;
	        int num;
	        Scanner numero = new Scanner(System.in);
	        System.out.println("===================");
	        System.out.print("Introduce un número: ");
	        
	      
	        num = numero.nextInt();
	        for (int i = num; i > 0; i--) {
	            factorial = factorial * i;

	        }
	        System.out.println("El factorial de " + num + " es: " + factorial);
	    }
}




