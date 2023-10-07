package pratica_sala;

import java.util.ArrayList;

public class Corretor {
	
	private int CRECI;
	private String nome;
	private ArrayList<Imovel> meusImoveis;
	
	public Corretor() {
		
	}

	public int getCRECI() {
		return CRECI;
	}

	public void setCRECI(int cRECI) {
		CRECI = cRECI;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Imovel> getMeusImoveis() {
		return meusImoveis;
	}

	public void setMeusImoveis(ArrayList<Imovel> meusImoveis) {
		this.meusImoveis = meusImoveis;
	}
	
	public void adicionarImovel(Imovel i) {
		this.meusImoveis.add(i);
	}
	
	public void removerImovel(Imovel i) {
		this.meusImoveis.remove(i);
	}
	
	public int quantidadeImoveis() {
		return this.meusImoveis.size();
	}
	
	public boolean vendedorEstrela() {
		int count = 0;
		
		for (int i = 0; i < quantidadeImoveis(); i++ ) {
			Imovel im = meusImoveis.get(i);
			
			if (im.getTipo() == "Oportunidade") {
				count ++;
			}
		}
		
		return (count >= 2);
	}
	
}
