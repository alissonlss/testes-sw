package atividade;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class AplicacaoTest {
	@Test
	public void testeAplicacao() {
		Aplicacao a = new Aplicacao("soma");
		
		double result = a.realizaCalculo(1, 8);
		Assert.assertTrue(result == 9);
		
		a.setOperacao("subtração");
		
		result = a.realizaCalculo(6, 7);
		Assert.assertTrue(result == -1);
		
		
		a.setOperacao("multiplicação");
		
		result = a.realizaCalculo(6, 7);
		Assert.assertTrue(result == 42);
		
		a.setOperacao("divisão");
		
		result = a.realizaCalculo(35, 5);
		Assert.assertTrue(result == 7);
		
		// Testa divisão por zero
		result = a.realizaCalculo(487, 0);
		Assert.assertTrue(result == -1);
		
		// Testa tag inexistente
		a.setOperacao("adição");
		
		result = a.realizaCalculo(35, 5);
		Assert.assertTrue(result == -1);
	}

}
