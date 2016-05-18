package hu.unideb.inf.malom.db.entitas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Bak Balázs
 *
 **/

/**
 * Ebben az osztályban TODO.
* */
public class EntitasKezelo {

	/**
	 * TODO.
	 */
	public EntityManager em;
	/**
	 * TODO.
	 */
	EntityManagerFactory emf;

	/**
	 * Csatlakozik az adatbázishoz és betölti a tartalmat.
	 **/
	public EntitasKezelo() {
		emf = Persistence.createEntityManagerFactory("malom-db.MYSQL");
		em = emf.createEntityManager();

		em.getTransaction().begin();
	}

}
