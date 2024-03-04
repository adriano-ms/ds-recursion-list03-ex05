package controller;

public class FibonacciController {

	public FibonacciController() {
		super();
	}

	public int fibonacciPositionValue(int position, int previous, int current) {
		//A funcao recursiva se encerra ao chegar no primeiro termo no Fibonacci,
		//retornando o valor do termo que foi solicitado na primeira chamada do metodo
		if(position == 1) {
			return current;
		} else {
			//A chamada e feita passando a posicao do termo anterior ao atual,
			//o termo atual e o proximo termo como parametros
			return fibonacciPositionValue(position - 1, current, current + previous);
		}
	}
}

