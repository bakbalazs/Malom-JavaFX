package hu.unideb.inf.malom.db.entitas;

import java.util.List;

public class TaroltFelhasznalok {
	
	public List<Bejelentkezes> taroltFelhasznalok() {
		EntitasKezelo es = new EntitasKezelo();
		return es.em.createNamedQuery("Bejelentkezes.findAll" , Bejelentkezes.class).getResultList();
	}
	
}

