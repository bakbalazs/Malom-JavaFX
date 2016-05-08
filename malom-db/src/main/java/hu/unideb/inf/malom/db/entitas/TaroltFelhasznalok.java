package hu.unideb.inf.malom.db.entitas;

import java.util.List;

/**
 * @author Balázs
 *
 */
public class TaroltFelhasznalok {
	
	/**
	 * @return
	 */
	public List<Bejelentkezes> taroltFelhasznalok() {
		EntitasKezelo es = new EntitasKezelo();
		return es.em.createNamedQuery("Bejelentkezes.findAll" , Bejelentkezes.class).getResultList();
	}
	
}

