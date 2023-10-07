package pratica_sala;

public class Imovel {
	
	private int codigo;
	private String tipo;
	private double tamanho;
	private double preco;
	
	public Imovel(int codigo, String tipo,  double tamanho, double preco) {
		this.codigo = codigo;
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.preco = preco;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public boolean oportunidade() {
		double valor =  this.preco/this.tamanho;
				
		if (tipo == "Apartamento") {
			return valor < 5000;
		}
		else if (tipo == "Casa") {
			return valor < 4000;
		}
		else {
			return false;
		}
	}
	
}

