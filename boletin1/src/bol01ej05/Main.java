/*
 * Pedir dos números y
 * decir si uno es múltiplo del otro.
 */
package bol01ej05;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		double n1, n2;
		
		//instanciamos un nuevo objeto de la clase scanner
		Scanner sc= new Scanner (System.in);
		
		// Introducir el numero
		System.out.println("Introduzca un número");
		n1=sc.nextDouble();
		
		System.out.println("Introduzca otro número");
		n2=sc.nextDouble();
		
		//¿multiplo?
		if((n1%n2)==0) {
			System.out.println(n1 + " es múltiplo de " + n2);
			
		}else if((n2%n1)==0) {
			System.out.println(n2 + " es múltiplo de " + n1);
			
		}else if(((n1%n2)!=0) || (n2%n1)!=0) {
			System.out.println("No son múltiplos");
		}

	}


}
