package atividade;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
	@Test
	public void testeFundacao() {
		Biblioteca b = new Biblioteca("Biblioteca Municipal Machado de Assis", "74512856" , 1970);
		Assert.assertTrue(b.patrimonioHistorico());
		Biblioteca b1 = new Biblioteca("Biblioteca IFPB", "28567451" , 2012);
		Assert.assertFalse(b1.patrimonioHistorico());
		Biblioteca b2 = new Biblioteca("Biblioteca Caminho da Petra Filosofica", "28569745" , 2000);
		Assert.assertFalse(b2.patrimonioHistorico());
		Biblioteca b3 = new Biblioteca("Biblioteca Pau Brazil", "74512856" , 1700);
		Assert.assertTrue(b3.patrimonioHistorico());
	}
	
	@Test
	public void testeAcervoPremium() {
		Biblioteca b = new Biblioteca("Biblioteca IFPB", "28567451" , 2012);
		
		Livro l1 = new Livro("A descoberta", 2022, "Desconhecido Araujo", "1254678422");
		Livro l2 = new Livro("A volta da chave", 2023, "Ruth Ware", "6555323329");
		Livro l3 = new Livro("O Jogo do Assassino (Clube do crime)", 2023, "Ngaio Marsh", "6555114150");
		Livro l4 = new Livro("O poder do hábito", 2012, "Charles Duhigg", "8539004119");
		Livro l5 = new Livro("O Mito da Caverna", 2015, "Plato", "8572839410");
		
		b.adicionarLivro(l1);
		b.adicionarLivro(l2);
		b.adicionarLivro(l3);
		b.adicionarLivro(l4);
		b.adicionarLivro(l5);
		
		Assert.assertFalse(b.acervoPremium());
		
		Livro l6 = new Livro("Retrato de uma mulher desconhecida", 2023, "Daniel Silva", "6555115017");
		Livro l7 = new Livro("Testemunha fatal", 2023, "Robert Bryndza", "8582356897");
		Livro l8 = new Livro("Onze portas para a escuridão", 2023, "C. J. Tudor", "6555607351");
		
		b.adicionarLivro(l6);
		b.adicionarLivro(l7);
		b.adicionarLivro(l8);
		
		Assert.assertTrue(b.acervoPremium());
	}
	
	@Test
	public void testeConsultarLivro() {
		Biblioteca b = new Biblioteca("Biblioteca Pau Brazil", "74512856" , 1700);
		
		Livro l = new Livro("O poder do hábito", 2012, "Charles Duhigg", "8539004119");
		
		b.adicionarLivro(l);
		
		Assert.assertEquals(b.consultarLivro("O poder do hábito"), "Charles Duhigg");
		Assert.assertEquals(b.consultarLivro("Testemunha fatal"), "Livro não encontrado!");
	}

}