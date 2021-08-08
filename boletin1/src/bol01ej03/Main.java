/*
 * Pedir el radio de un círculo
 * y calcular su longitud.
  */

package bol01ej03;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double l, r; //longitud y radio
		
		Scanner sc= new Scanner(System.in);
		
		//pedir el radio de la circunferencia
		System.out.println("Introduzca el radio de la circunferencia");
		r=sc.nextDouble();
		
		//calcular longitud
		l=2*Math.PI*r;
		
		System.out.println("La longitud de la circunferencia con radio "+r+ " es: "+ l);
		

	}

}
