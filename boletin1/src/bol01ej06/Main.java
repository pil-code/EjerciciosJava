/*
 * Pedir dos números y decir cual es el mayor
 */


package bol01ej06;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double n1, n2;
		
		Scanner sc= new Scanner (System.in);
		
		//pedir los numeros
		System.out.println("Introdizca un número");
		n1=sc.nextDouble();
		
		System.out.println("Introdizca otro número");
		n2=sc.nextDouble();
		
		//¿cual es mayor?
		if(n1==n2) {
			System.out.println(n1 +" y "+ n2 + " es el mismo número");
		}
		else if(n1>n2) {
			System.out.println(n1 +" es mayor que "+ n2);
		}else System.out.println(n2 +" es mayor que "+ n1);
	
	}
}
