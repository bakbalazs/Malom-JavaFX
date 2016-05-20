package hu.unideb.inf.malom.db.test;

import static org.junit.Assert.*;

import org.junit.Test;

import hu.unideb.inf.malom.db.jelszotitkositas.JelszoTitkositas;

public class JelszoTitkositasTest {
	
	@Test
	public void titkositas() throws Exception{
		String titkosTest = JelszoTitkositas.titkositas("test");
		assertEquals(JelszoTitkositas.titkositas("test"),titkosTest );
	}

}
