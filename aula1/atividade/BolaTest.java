package atividade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BolaTest {
	@Test
	public void corTest() {
		Bola bola = new Bola("azul");
		
		Assertions.assertEquals(bola.getCor(),"azul");
		
		bola.setCor("vermelho");
		Assertions.assertEquals(bola.getCor(),"vermelho");
	}
}