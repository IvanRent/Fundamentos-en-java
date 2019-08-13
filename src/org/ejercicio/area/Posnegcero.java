package org.ejercicio.area;

import java.util.Scanner;

public class Posnegcero {	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Ingresa un numero:  ");
		num = sc.nextInt();
		
		if(num > 0)
		{
			System.out.println("El numero "+num+ " es positivo");
		}else {
			if(num < 0 )
			{
				System.out.println("El numero " + num + " es negativo");
				
			}else {
				System.out.println("El numero " + num + " es cero");
			}
		}
		
		
	}
	
		
	
	
}
