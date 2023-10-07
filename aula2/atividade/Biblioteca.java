package atividade;

import java.time.LocalDate;
import java.util.ArrayList;

public class Biblioteca {
	
	private String nome;
	private String CNPJ;
	private int anoFundacao;
	private ArrayList<Livro> listaLivros;
	
	public Biblioteca(String nome, String cnpj, int ano) {
		this.nome = nome;
		this.CNPJ = cnpj;
		this.anoFundacao = ano;
		this.listaLivros = new ArrayList<Livro>();
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCNPJ() {
		return CNPJ;
	}
	
	public void setCNPJ(String cnpj) {
		CNPJ = cnpj;
	}

	public int getAnoFundacao() {
		return anoFundacao;
	}

	public void setAnoFundacao(int anoFundacao) {
		this.anoFundacao = anoFundacao;
	}
	
	public boolean patrimonioHistorico() {
		return (anoFundacao < 1980);
	}
	
	public void adicionarLivro(Livro l) {
		this.listaLivros.add(l);
	}
	
	public void removerLivro(Livro l) {
		this.listaLivros.remove(l);
	}
	
	public int quantidadeLivros() {
		return this.listaLivros.size();
	}
	
	// Ao consultar um livro por nome, é retornado o nome do autor
	public String consultarLivro(String nome) {
		for (int i = 0; i < quantidadeLivros(); i++ ) {
			Livro l = listaLivros.get(i);
			
			if (l.getNome() == nome) {
				return l.getAutor();
			}
		}
		return "Livro não encontrado!";
	}
	
	public boolean acervoPremium() {
		int count = 0;
		
		// Obtendo o ano atual
		LocalDate dataAtual = LocalDate.now();
		int anoAtual = dataAtual.getYear();
		
		for (int i = 0; i < quantidadeLivros(); i++ ) {
			Livro l = listaLivros.get(i);
			
			if (l.getEdicao() == anoAtual) {
				count++;
			}
		}
		
		return (count >= 5);
	}
}
