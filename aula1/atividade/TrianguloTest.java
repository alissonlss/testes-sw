package atividade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrianguloTest{
	@Test
	public void classificaTriangulo() {
		Triangulo t1 = new Triangulo(3, 4, 5);
		Assertions.assertTrue(t1.classificaTriangulo() == "Triângulo escaleno");
		
		Triangulo t2 = new Triangulo(3, 3, 5);
		Assertions.assertTrue(t2.classificaTriangulo() == "Triângulo isósceles");
		
		Triangulo t3 = new Triangulo(3, 3, 3);
		Assertions.assertEquals(t3.classificaTriangulo() == "Triângulo equilátero", true);
	}
	
	@Test
	public void naoEhTriangulo() {
		// Lado informado pelo usuário com valor zero 
		Triangulo t1 = new Triangulo(0, 0, 0);
		Assertions.assertTrue(t1.classificaTriangulo() == "Não é um triângulo");
		
		// Situação onde a soma de 2 lados é igual ao terceiro lado 
		Triangulo t2 = new Triangulo(100, 10, 1);
		Assertions.assertTrue(t2.classificaTriangulo() == "Não é um triângulo");
		
		// Lado informado pelo usuário com valor negativo 
		Triangulo t3 = new Triangulo(-3, -4, 5);
		Assertions.assertTrue(t3.classificaTriangulo() == "Não é um triângulo");
	}
}
