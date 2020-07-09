package br.edu.univas.main;

import java.util.Scanner;

public class questao2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int contador = 0;
		int i = 0;
		int musica[] = new int[10000];
		for(i = 0;;i++){
			System.out.println("Digite abaixo os números de acordo com as notas:");
			System.out.println("1 - DÓ");
			System.out.println("2 - RÉ");
			System.out.println("3 - MI");
			System.out.println("4 - FÁ");
			System.out.println("5 - SOL");
			System.out.println("6 - LA");
			System.out.println("7 - SI");
			musica[i] = scanner.nextInt();

			if (musica[i] == 0) {
				break;
			}
			contador++;
			
		} 
		for (int h = 0; h < i; h++) {
				System.out.println(musica[contador]);
				if (h > 1) {
					contador -= 1;
					System.out.println(musica[contador]);
			}
		}
		
	}

}
