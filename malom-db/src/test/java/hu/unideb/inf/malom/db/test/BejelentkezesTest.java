package hu.unideb.inf.malom.db.test;

import static org.junit.Assert.*;

import org.junit.Test;

import hu.unideb.inf.malom.db.entitas.Bejelentkezes;

public class BejelentkezesTest {

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
}
