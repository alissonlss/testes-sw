package atividade;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class LivroTest {
	@Test
	public void testLacamento() {
		Livro l = new Livro("A descoberta", 2022, "Desconhecido Araujo", "1254678422");
		Assert.assertFalse(l.verificaLancamento());
		Livro l2 = new Livro("A volta da chave", 2023, "Ruth Ware", "6555323329");
		Assert.assertTrue(l2.verificaLancamento());
		Livro l3 = new Livro("O Jogo do Assassino (Clube do crime)", 2023, "Ngaio Marsh", "6555114150");
		Assert.assertTrue(l3.verificaLancamento());
		Livro l4 = new Livro("O poder do hábito", 2012, "Charles Duhigg", "8539004119");
		Assert.assertFalse(l4.verificaLancamento());
		Livro l5 = new Livro("O Mito da Caverna", 2015, "Plato", "8572839410");
		Assert.assertFalse(l5.verificaLancamento());
	}
}
