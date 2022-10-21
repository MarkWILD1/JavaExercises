/*
 * 38.Faça um algoritmo que receba o ano de nascimento de uma pessoa e o ano atual, calcule e 
 * mostre: a) a idade dessa pessoa em anos; b) a idade dessa pessoa em meses; c) a idade dessa pessoa em dias; 
 * d) a idade dessa pessoa em semanas.
 */

package Exercices;

import java.util.Scanner;

public class Ex_38 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o seu ano de nascimento: ");
		int anoNascimento = input.nextInt();
		
		System.out.println("Digite o ano atual: ");
		int anoAtual = input.nextInt();
		
		int idade = anoAtual - anoNascimento;
		int meses = idade * 30; 
		int dias = idade * 360;
		
		System.out.println("Idade em anos: " + idade + "\nIdade em meses: " + meses + "\nIdade em días: " + dias);
		
		input.close();
	}

}
