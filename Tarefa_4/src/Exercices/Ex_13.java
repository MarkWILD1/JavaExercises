/*
 * 13.Ler um número inteiro (assuma até três dígitos) e imprimir a saída da seguinte forma: 
 * CENTENA = x DEZENA = x UNIDADE = x
 */

package Exercices;

import java.util.Scanner;

public class Ex_13 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número de 3 dígitos: ");
		
		int numero = input.nextInt();
		int centena = numero / 100;
		int dezena = (numero % 100) / 10;
		int unidade = (numero % 100 % 10);
		
		System.out.println("CENTENA: " + centena + "\nDEZENA: " + dezena + "\nUNIDADE: " + unidade);
		
		input.close();
	}

}
