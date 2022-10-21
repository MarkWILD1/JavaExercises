/*
 * 22)Escrever um algoritmo que leia o tempo de duração em segundos de um determinado evento em uma fábrica e 
 * informe-o expresso no formato horas:minutos:segundos.
 */

package Exercices;

import java.util.Scanner;

public class Ex_22 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a duracao em segundos: ");
		int segundos = input.nextInt();
		
		int horas = segundos / 3600;
		int minutos = (segundos % 3600) / 60;
		int seg = (segundos % 3600 % 60);
		
		System.out.println("horas: " + horas + "\nminutos: " + minutos + "\nsegundos: " + seg);
		input.close();
		
		
	}

}
