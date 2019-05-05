package packkonekta4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TaulaTest {
	Taula taula=Taula.getNireTaula();
	@Before
	public void setUp() throws Exception {
		
	}
	//atributuak

	@After
	public void tearDown() throws Exception {
		taula=null;
	}

	@Test
	public void testGetNireTaula() {
		assertNotNull(taula);
	}

	@Test
	public void testBeteta() {
		assertFalse(taula.beteta());
	}
	public void testZutabBeteta(){
		assertFalse(taula.zutabBeteta(1));
	}
	public void testFitxaKolorezAldatu(){
		taula.fitxaKolorezAldatu(2);
	}
	public void testInprimatuTaula(){
		taula.inprimatuTaula();
	}
	//eraikitzailea(k)

	//gainontzeko metodoak
}
