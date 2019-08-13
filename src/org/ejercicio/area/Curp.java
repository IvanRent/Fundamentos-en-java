package org.ejercicio.area;

import java.util.Scanner;

public class Curp {		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String nombre;
			String apat;
			String amat;
			String fecha;
			
			
			
				System.out.println("Escribe el nombre:  ");
				nombre = sc.nextLine();
				System.out.println("Escribe el apellido paterno:  ");
				apat = sc.nextLine();
				System.out.println("Escribe el apellido materno:  ");
				amat = sc.nextLine();
				System.out.println("Escribe la fecha:  ");
				fecha = sc.nextLine();
				
				System.out.println("el CURP es "+apat.charAt(0)+apat.charAt(1)+amat.charAt(0)+nombre.charAt(0)+"84"+
				fecha.charAt(6)+fecha.charAt(7)+fecha.charAt(3)+fecha.charAt(4)+fecha.charAt(0)+fecha.charAt(1));
		}

	
		


}
