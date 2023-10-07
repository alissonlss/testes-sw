package oficina;

public class Servico {
	private int id;
	private String motivo;
	private Mecanico mecanico; 
	private Veiculo veiculo;
	
	public Servico(int id, String motivo, Mecanico mecanico, Veiculo veiculo) {
		this.id = id;
		this.motivo = motivo;
		this.mecanico = mecanico;
		this.veiculo = veiculo;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Mecanico getMecanico() {
		return mecanico;
	}

	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public void ordemServico(String motivo) {
		setMotivo(motivo);
		veiculo.setNumOcorrencias((veiculo.getNumOcorrencias()+1));
	}
}
