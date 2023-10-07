package oficina;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ServicoTest {
	@Test 
	public void testeOrdemServico() {
		
		Mecanico c = new Mecanico();
		c.setNome("Carlos");
		c.setMatricula(320);
		c.adicionarEspecialidade("Consultor Automotivo");
		c.adicionarEspecialidade("Especialista em Carros de Corrida");
		
		Veiculo v = new Veiculo("HBG8I94", "SUV", 0, 2022);
		
		Servico s = new Servico(12, "", c, v);
		s.ordemServico("Pintura");
		s.ordemServico("Alinhamento");
		
		Assert.assertTrue(v.getNumOcorrencias() == 2);
		
		
		Mecanico c2 = new Mecanico();
		c2.setNome("Melo");
		c2.setMatricula(298);
		
		Veiculo v2 = new Veiculo("IFP0B23", "POPULAR", 0, 2023);
		
		Servico s2 = new Servico(12, "", c2, v2);
		s2.ordemServico("Troca de óleo");
		
		Assert.assertTrue(v2.getNumOcorrencias() == 1);
	}
}
