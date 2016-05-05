package hu.unideb.inf.malom.db.entitas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntitasKezelo {

	public EntityManager em;
	EntityManagerFactory emf;

	public EntitasKezelo() {
		emf = Persistence.createEntityManagerFactory("malom-db");
		em = emf.createEntityManager();

		em.getTransaction().begin();
	}

	public void commit() {
		em.getTransaction().commit();
		em.close();
	}

}
