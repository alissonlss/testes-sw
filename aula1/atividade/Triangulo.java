package atividade;

public class Triangulo {
	private int lado1;
	private int lado2;
	private int lado3;
	
	public Triangulo(int lado1, int lado2, int lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	public String classificaTriangulo() {
		boolean isTriangulo = existenciaTriangulo();
		
		if (isTriangulo) {
			if ((lado1 == lado2) && (lado2 == lado3) && (lado1 == lado3)) {
				return "Triângulo equilátero";
			}
			else {
				if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)){
					return "Triângulo isósceles";
				}
				else return "Triângulo escaleno";
			}
		}
		else return "Não é um triângulo";
	}
	
	private boolean existenciaTriangulo() {
		int soma12 = lado1 + lado2;
		int soma13 = lado1 + lado3;
		int soma23 = lado2 + lado3;
		
		int sub12 = Math.abs(lado1 - lado2);
		int sub13 = Math.abs(lado1 - lado3);
		int sub23 = Math.abs(lado2 - lado3);
		
		if (((sub12 < lado3 && lado3 <= soma12 ) && (sub13 < lado2 && lado2 < soma13 ) && (sub23 < lado1 && lado1 < soma23 )) && (lado1 > 0 && lado2 > 0 && lado3 > 0)){
			return true;
		}
		else return false;
	}
}
