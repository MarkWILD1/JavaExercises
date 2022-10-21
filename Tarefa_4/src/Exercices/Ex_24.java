/*
 * 24)Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, 
 * sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração máxima de 24 horas.
 */

package Exercices;

import java.util.Scanner;

public class Ex_24 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a hora de inicio: ");
		int hInicial = input.nextInt();
		
		System.out.println("Digite a hora de finalizacao: ");
		int hFinal = input.nextInt();

		if (hInicial > hFinal) { 
			System.out.println("O JOGO DUROU " + (24 - (hInicial - hFinal)) + " HORA(S)");
		} else if (hFinal > hInicial) {
			System.out.println("O JOGO DUROU " + (hFinal - hInicial) + " HORA(S)");
		} else {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		
		input.close();

	}

}
