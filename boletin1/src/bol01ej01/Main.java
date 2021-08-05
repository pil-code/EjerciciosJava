/* Pedir los coeficientes de una ecuacion de segundo grado, y muestre sus soluciones reales.
 * Si no existen, debe indicarlo */

package bol01ej01;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a, b, c; //coeficientes ax^2+bx+c=0
		double x1, x2, d; //solucion 1, solucion 2 y determinacion de si tiene solucion o no
		Scanner sc = new Scanner(System.in);
		boolean flag= false; //se pondrá True cuando haya alguna solucion

		do {
			
			//Introducimos el valor de los coeficientes
			System.out.println("Introduzca el valor del coeficiente 'a'");
			a=sc.nextInt();
			
			System.out.println("Introduzca el valor del coeficiente 'b'");
			b=sc.nextInt();
			
			System.out.println("Introduzca el valor del coeficiente 'c'");
			c=sc.nextInt();
			
			//Calculamos la determinacion de si tiene solucion o no
			if(a==0) {
				x1=-c/b;
				System.out.println("Solución 1 = " + x1);
			}
			
			else {
				d=(b*b)-4*a*c;
				if (d<0) {
					System.out.println("La ecuación no tiene solución posible");
				}
				else {
					flag=true;
					x1=(-b+Math.sqrt(d))/(2*a);
					x2=(-b-Math.sqrt(d))/(2*a);
					System.out.println("Solución 1 = " + x1);
					System.out.println("Solución 2 = " + x2);
				}
			}
		
		} while (flag==false);

	}
}
