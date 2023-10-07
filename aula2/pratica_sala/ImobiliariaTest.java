package pratica_sala;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertFalse;

public class ImobiliariaTest {
	@Test
	public void testeCorretor(){
		Corretor C = new Corretor ();
		C.setNome("Maria");
		C.setCRECI(656635);
		
		Imovel i = new Imovel(462, "Casa", 120.5, 125000);
		C.setMeusImoveis(new ArrayList<Imovel>());
		C.adicionarImovel(i);

		
		assertFalse(C.vendedorEstrela());
		}
}
