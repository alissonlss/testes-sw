package oficina;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class VeiculoTest {
	@Test
	public void testeCalculaGarantia() {
		int result;
		
		Veiculo v = new Veiculo("IFP0B23", "POPULAR", 0, 2023);
		result = v.calculaGarantia();
		Assert.assertTrue(result == 2025);
		
		Veiculo v1 = new Veiculo("HBG8I94", "SUV", 0, 2022);
		result = v1.calculaGarantia();
		/* Antes da letra f
		Assert.assertTrue(result == 2025);*/
		// Na letra f
		Assert.assertTrue(result == 2024);
		
		Veiculo v2 = new Veiculo("FAT1U72", "PICKUP", 0, 2020);
		result = v2.calculaGarantia();
		/* Antes da letra f
		Assert.assertTrue(result == 2025);*/
		// Na letra f
		Assert.assertTrue(result == 2022);
		
		Veiculo v3 = new Veiculo("TYT0W23", "UNO", 0, 2019);
		result = v3.calculaGarantia();
		Assert.assertTrue(result == -1);
	}
}