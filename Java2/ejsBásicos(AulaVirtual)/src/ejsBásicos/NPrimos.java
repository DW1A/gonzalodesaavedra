package ejsBásicos;

import java.util.Scanner;

public class NPrimos {
	public static void main(String[] args ) {
		Scanner scanner= new Scanner(System.in);
		double numPrimos;
		double num = 0;
		int contDivis = 0;
		
		System.out.println("Introduce cuántos números primos quieres ver");
		numPrimos = scanner.nextDouble();
		if ((int) numPrimos == numPrimos && numPrimos >= 0) {
			for (int j = 1; j<=numPrimos; j++ ) {  //Se lleva la cuenta de primos impresos
				contDivis=0;
				for (int i = 1; i<=num; i++) {     //Se comprueba si num es primo
						if (num % i == 0) {
							contDivis++;
						}
				}
			if (contDivis > 2 || num == 0 || num == 1) {j--;}
			else {System.out.println((int) num);}  //Num se imprime si es primo
			num++;
			}
		}
		else {System.out.println("El número debe ser positivo y entero");}
		
		System.out.println("Fin");
		scanner.close();
	}
}