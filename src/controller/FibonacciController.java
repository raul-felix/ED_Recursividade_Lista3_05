package controller;

public class FibonacciController {
	
	public FibonacciController() {
		super();
	}
	
	public int retornaValorNaPosicao(int posicao) {
		// se a posição for 1 ou 2, retorna 1, como são os dois primeiros números da sequência
		if (posicao <= 2) {
			return 1;
		} else {
			// se não, retornamos a soma da função (passando o parâmetro da posição anterior) com a função (passando o parâmetro da posição anterior da anterior) 
			return retornaValorNaPosicao(posicao - 1) + retornaValorNaPosicao(posicao - 2);
		}
	}
}
