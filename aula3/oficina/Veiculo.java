package oficina;

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;

public class Veiculo {
	private String placa;
	private String tipo;
	private int numOcorrencias;
	private int anoFabricacao;
	
	public Veiculo(String placa, String tipo, int num, int ano) {
		this.placa = placa;
		this.tipo = tipo;
		this.numOcorrencias = num;
		this.anoFabricacao = ano;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumOcorrencias() {
		return numOcorrencias;
	}

	public void setNumOcorrencias(int numOcorrencias) {
		this.numOcorrencias = numOcorrencias;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	// Caso passe um tipo de carro diferente dos listados, será retornado -1
	public int calculaGarantia() {
		
		/* Antes da letra f
		Map<String, String> garantia = new HashMap<String, String>();
		garantia.put("PICKUP", "5");
		garantia.put("SUV", "3");
		garantia.put("POPULAR", "2");
		
		if (garantia.containsKey(getTipo())) {
			return anoFabricacao + Integer.parseInt(garantia.get(getTipo()));
		}
		else return -1;
		*/
		
		// Na letra f
		List<String> garantia = Arrays.asList("PICKUP", "SUV", "POPULAR");
		
		if (garantia.contains(getTipo())) {
			return anoFabricacao + 2;
		}
		else return -1;
	}

}
