package oficina;

import java.util.ArrayList;

public class Mecanico {
	private int matricula;
	private String nome;
	private ArrayList<String> listaEspecialidades = new ArrayList<>();
	
	public Mecanico() {
		
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<String> getListaEspecialidades() {
		return listaEspecialidades;
	}
	
	public void setListaEspecialidades(ArrayList<String> listaEspecialidades) {
		this.listaEspecialidades = listaEspecialidades;
	}
	
	public void adicionarEspecialidade(String s) {
		this.listaEspecialidades.add(s);
	}
	
	public void removerEspecialidade(String s) {
		this.listaEspecialidades.remove(s);
	}
	
	public int quantidadeEspecialidades() {
		return this.listaEspecialidades.size();
	}
	
	public boolean funcionarioPremium() {
		/* Antes da letra f
		return quantidadeEspecialidades() > 2;*/ 
		
		// Na letra f
		return quantidadeEspecialidades() > 1;
	}
}