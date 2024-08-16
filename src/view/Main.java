package view;

import java.util.Scanner;

import controller.FibonacciController;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		FibonacciController fibController = new FibonacciController();
		int posicao;
		
		do {
			System.out.println("Digite um número inteiro de 1 a 20:");
			posicao = sc.nextInt();
		}
		while (posicao < 1 || posicao > 20);
		
		int resultado = fibController.retornaValorNaPosicao(posicao);
		System.out.println(String.format("Na sequência de Fibonacci, o número na posição %d é: %d", posicao, resultado));
	}
}
