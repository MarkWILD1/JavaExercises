/*
 * 23)Escrever um algoritmo que leia a idade de uma pessoa em dias e informe-a em anos, meses e dias.
 */

package Exercices;

import java.util.Scanner;

public class Ex_23 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a sua idade em días: ");
		int idadeEmDias = input.nextInt();
		
		int anos = idadeEmDias / 360;
		int meses = (idadeEmDias % 360) / 30;
		int dias = (idadeEmDias % 360 % 30);
		
		System.out.println("Voce tem: " + anos + " anos, " + meses + " meses e " + dias + " dias.");
		input.close();
	}

}
