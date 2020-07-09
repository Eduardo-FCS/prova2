package br.edu.univas.main;
import java.util.Scanner;
public class questao1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float contaA[] = new float[12];
		float contaB[] = new float[12];
		float maiorA = 0;
		float maiorB = 0;
		float menorA = 999999;
		float menorB = 999999;
		float somaA = 0;
		float somaB = 0;
		for (int i = 0; i < 12; i++) {
			System.out.println("Digite abaixo o valor da conta de luz do vizinho A:");
			contaA[i] = scanner.nextInt();
			System.out.println("Digite abaixo o valor da conta de luz do vizinho B:");
			contaB[i] = scanner.nextInt();

			if(contaA[i] > maiorA) {
				maiorA = contaA[i];
			} 
			if(contaA[i] < menorA) {
				menorA = contaA[i];
			}
			somaA += contaA[i];
			
			if(contaB[i] > maiorB) {
				maiorB = contaB[i];
			} 
			if(contaB[i] < menorB) {
				menorB = contaB[i];
			}
			somaB += contaB[i];
		}
		System.out.println("A conta com o maior valor do vizinho A é igual a R$" + maiorA);
		System.out.println("A conta com o maior valor do vizinho B é igual a R$" + maiorB);
		System.out.println("A conta com o menor valor do vizinho A é igual a R$" + menorA);
		System.out.println("A conta com o menor valor do vizinho B é igual a R$" + menorB);
		System.out.println("A soma das contas do vizinho A é igual a R$" + somaA);
		System.out.println("A soma das contas do vizinho B é igual a R$" + somaB);
	}
}
