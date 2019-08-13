package org.ejercicio.area;

import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double area, base, altura;
		
		
		System.out.println("========================");
		System.out.println("Ingresa la base: ");
		base = sc.nextDouble();
		System.out.println("Ingresas la altura: ");
		altura = sc.nextDouble();
		
		area = ((base*altura)/2);
		System.out.println("El area es: " + area);
					
	}
}
