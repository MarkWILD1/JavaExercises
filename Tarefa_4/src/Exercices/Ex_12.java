/*
 * 12.Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%. 
 * Após o aumento, desconte 8% de impostos. Imprima o salário inicial, o salário com o 
 * aumento e o salário final.
 */

package Exercices;

import java.util.Scanner;

public class Ex_12 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o salario: ");
		
		double salario = input.nextDouble();
		double aumento = salario * 0.15;
		double comAumento = salario + aumento;
		double impostos = salario * 0.08;
		
		double total = (salario + aumento) - impostos;
		
		System.out.println("Salario inicial: " + salario + "\nSalario com aumento: " + comAumento + "\nSalario final: " + total);
		input.close();
	}

}
