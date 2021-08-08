/*
 * Pedir el radio de un c�rculo
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
		System.out.println("Introduzca el radio del c�rculo");
		r=sc.nextDouble();
		
		//c�lculo del �rea
		a=(Math.PI)*(Math.pow(r,2));
		
		//Resultado
		System.out.println("El �rea del c�rculo, de radio " + r + ", es: " + a);

	}

}
