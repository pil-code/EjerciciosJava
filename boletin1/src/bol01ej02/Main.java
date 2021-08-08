/*
 * Pedir el radio de un círculo
 * y calcular su area.
  */

package bol01ej02;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		double r; //radio
		double a; //area
		
		//instanciamos un objeto de la clase Scanner
		Scanner sc= new Scanner (System.in);
		
		//pedir el radio por consola
		System.out.println("Introduzca el radio del círculo");
		r=sc.nextDouble();
		
		//cálculo del área
		a=(Math.PI)*(Math.pow(r,2));
		
		//Resultado
		System.out.println("El área del círculo, de radio " + r + ", es: " + a);

	}

}
