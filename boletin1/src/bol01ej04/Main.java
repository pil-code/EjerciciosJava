/*
 * Pedir un número e
 * indicar si es positivo o negativo.
 */
package bol01ej04;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double num; //numero que se introducira por scanner
		
		//instanciamos un nuevo objeto de la clase scanner
		Scanner sc= new Scanner (System.in);
		
		// Introducir el numero
		System.out.println("Introduzca un número");
		num=sc.nextDouble();
		
		//¿es positivo o negativo?
		if (num==0) {
			System.out.println("El cero es neutral");
		} else if(num<0) {
			System.out.println("Es negativo");
		}else {
			System.out.println("Es positivo");
		}
		
	}

}
