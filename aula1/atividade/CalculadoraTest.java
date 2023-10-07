package atividade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest{
	
	@Test
	public void somarTest() {
		double result = 0;
		Calculadora c = new Calculadora();
		
		result = c.somar(9, 3);
		Assertions.assertTrue(result == 12);
	}
	
	@Test
	public void subtrairTest() {
		double result = 0;
		Calculadora c1 = new Calculadora();
		
		result = c1.subtrair(13, 5);
		Assertions.assertTrue(result == 8);
	}
	
	@Test
	public void multiplicarTest() {
		double result = 0;
		Calculadora c2 = new Calculadora();
		
		result = c2.multiplicar(6, 7);
		Assertions.assertTrue(result == 42);
	}
	
	@Test
	public void dividirTest() {
		double result = 0;
		Calculadora c3 = new Calculadora();
		
		result = c3.dividir(28, 7);
		Assertions.assertTrue(result == 4);
	}
}
