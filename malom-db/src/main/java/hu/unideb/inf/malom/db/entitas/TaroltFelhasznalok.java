package hu.unideb.inf.malom.db.entitas;

import java.util.List;

/**
 * @author Balázs
 *
 */
public class TaroltFelhasznalok {
	
	/**
	 * A tárolt játékosokat adja vissza minden adatukkal egy listában.
	 * 
	 * @return A jázékosról tárolt információk.
	 */
	public List<Bejelentkezes> taroltFelhasznalok() {
		EntitasKezelo es = new EntitasKezelo();
		return es.em.createNamedQuery("Bejelentkezes.findAll" , Bejelentkezes.class).getResultList();
	}
	
}

