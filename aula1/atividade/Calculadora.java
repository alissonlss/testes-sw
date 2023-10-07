package atividade;

public class Calculadora {
	// atributo
	private double resultado = 0;
	
	// método somar
	public double somar( int n1, int n2 ) {
		resultado = n1 + n2;
		return resultado;
	}
	
	// método subtrair
	public double subtrair( int n1, int n2 ) {
		resultado = n1 - n2;
		return resultado;
	}
	
	// método multiplicar
	public double multiplicar( int n1, int n2 ) {
		resultado = n1 * n2; 
		return resultado;
	}
	
	// método dividir, em caso de divisão por zero, retorna -1
	public double dividir( int n1, int n2 ) {
		
		if (n2 == 0) {
			return -1;
		}
		
		resultado = n1 / n2; 
		return resultado;
	}
}
