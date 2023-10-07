package atividade;

public class Aplicacao {
	
	private Calculadora calculadora;
	private String operacao;
	
	public Aplicacao(String operacao) {
		this.operacao = operacao;
		this.calculadora = new Calculadora();
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	
	// Em caso de erro ao encontrar a operação, retorna -1 
	public double realizaCalculo(int n1, int n2) {
		if (this.operacao == "soma") {
			return this.calculadora.somar(n1, n2);
		}else {
			if (this.operacao == "subtração") {
				return this.calculadora.subtrair(n1, n2);
			}
			else {
				if (this.operacao == "multiplicação") {
					return this.calculadora.multiplicar(n1, n2);
				}
				else {
					if (this.operacao == "divisão") {
						return this.calculadora.dividir(n1, n2);
					}
					else {
						return -1;
					}
				}
			}
		}
	}
}
