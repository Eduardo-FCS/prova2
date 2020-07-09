package br.edu.univas.main;
import java.util.Scanner;
public class questao3 {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float valor = 0;
		float soma = 0;
		for(int i = 0; i == 150; i++) {
			System.out.println("Digite abaixo o valor do salário do empregado:");
			valor = scanner.nextInt();
			soma += valor;
		}
		float aumentoValor = soma*1.15f;
		System.out.println("O valor da folha salarial era de R$" + soma + " e seu aumento de 15% será igual a R$" + aumentoValor);
	}

}
