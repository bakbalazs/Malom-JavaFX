package hu.unideb.inf.malom.db.entitas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Bak Balázs
 *
 */
public class EntitasKezelo {

	public EntityManager em;
	EntityManagerFactory emf;

	/**
	 * 
	 */
	public EntitasKezelo() {
		emf = Persistence.createEntityManagerFactory("malom-db.MYSQL");
		em = emf.createEntityManager();

		em.getTransaction().begin();
	}

}
