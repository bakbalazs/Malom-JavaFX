package hu.unideb.inf.malom.db.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.junit.BeforeClass;
import org.junit.Test;

import hu.unideb.inf.malom.db.entitas.Bejelentkezes;
import hu.unideb.inf.malom.db.entitas.EntitasKezelo;
import hu.unideb.inf.malom.db.entitas.TaroltFelhasznalok;

public class BejelentkezesTest {

	private static EntitasKezelo es = new EntitasKezelo();

	@Test
	public void beallitja() {

		Bejelentkezes b = new Bejelentkezes();
		b.setId(1);
		b.setFelhasznalonev("felhasznalonev");
		b.setJelszo("jelszó");
		b.setKeresztnev("keresztnév");
		b.setGyozelem(1);
		b.setVereseg(2);
	}

	@Test
	public void visszaAdja() {
		Bejelentkezes b = new Bejelentkezes();
		b.setId(1);
		b.setFelhasznalonev("felhasznalonev");
		b.setJelszo("jelszó");
		b.setKeresztnev("keresztnév");
		b.setGyozelem(1);
		b.setVereseg(2);
		int id = b.getId();
		int gyozelem = b.getGyozelem();
		int vereseg = b.getVereseg();
		assertEquals(id, 1);
		assertEquals(b.getFelhasznalonev(), "felhasznalonev");
		assertEquals(b.getJelszo(), "jelszó");
		assertEquals(b.getKeresztnev(), "keresztnév");
		assertEquals(gyozelem, 1);
		assertEquals(vereseg, 2);
	}

	@BeforeClass
	public static void sqlBeallitas() throws Exception {
		es.em = (EntityManager) Persistence.createEntityManagerFactory("malom-db.h2").createEntityManager();
	}
	
	@Test
	public void adazbazisMuveletek() {

		Bejelentkezes b = new Bejelentkezes();
		b.setFelhasznalonev("Felhasznalo");
		b.setJelszo("jelszo");
		b.setKeresztnev("keresztnev");
		b.setGyozelem(2);
		b.setVereseg(0);
		es.em.persist(b);
		es.em.clear();
		es.em.remove(b);
	}
	
	private List<Bejelentkezes> FelhasznaloLista = new ArrayList<>();
	private TaroltFelhasznalok felhasznalok = new TaroltFelhasznalok();
	
	@Test
	public void taroltFelhazsnalok() {
		
		Bejelentkezes b = new Bejelentkezes();
		b.setFelhasznalonev("Felhasznalo");
		b.setJelszo("jelszo");
		b.setKeresztnev("keresztnev");
		b.setGyozelem(2);
		b.setVereseg(0);
		es.em.persist(b);

		FelhasznaloLista = felhasznalok.taroltFelhasznalok();
		FelhasznaloLista.stream().map(s -> s.getFelhasznalonev()).forEach(System.out::println);
		for (Bejelentkezes l : FelhasznaloLista) {
			assertEquals("Felhasznalo", l.getFelhasznalonev());
			assertEquals("jelszo", l.getJelszo());
			assertEquals(2, l.getGyozelem().intValue());
			assertEquals(0, l.getVereseg().intValue());
			}
	}

}
