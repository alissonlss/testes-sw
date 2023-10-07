package oficina;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MecanicoTest {
	@Test 
	public void testeFuncionarioPremium() {
		Mecanico c = new Mecanico();
		c.setNome("Carlos");
		c.setMatricula(320);
		c.adicionarEspecialidade("Consultor Automotivo");
		c.adicionarEspecialidade("Especialista em Carros de Corrida");
		c.adicionarEspecialidade("Preparador e Customizador");
		
		Assert.assertTrue(c.funcionarioPremium());
		
		Mecanico c2 = new Mecanico();
		c2.setNome("Nando");
		c2.setMatricula(231);
		c2.adicionarEspecialidade("Especialista em Carros de Luxo");
		c2.adicionarEspecialidade("Reparador de Sistemas Específicos");
		
		/* Antes da letra f
		Assert.assertFalse(c2.funcionarioPremium());*/
		
		// Na letra f
		Assert.assertTrue(c2.funcionarioPremium());
		
		Mecanico c3 = new Mecanico();
		c3.setNome("Melo");
		c3.setMatricula(298);
		
		Assert.assertFalse(c3.funcionarioPremium());
	}
}
