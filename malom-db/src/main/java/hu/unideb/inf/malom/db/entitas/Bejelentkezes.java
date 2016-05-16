package hu.unideb.inf.malom.db.entitas;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Bak Balázs
 *
 */

/**
 * Az adatbázisban a felhasználókat reprezentáló osztály.
 * Ez egy entitás amit az adatbázisba leképezve egy user nevű táblát kapunk a megfelelő oszlopokkal.
 *
 */
@Entity
@Table(name = "usersss")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Bejelentkezes.findAll", query = "SELECT u FROM Bejelentkezes u"), })
public class Bejelentkezes implements Serializable {

	/**
	 * Alapértelmezett szerializációs azonosító.
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "felhasznalonev")
	private String felhasznalonev;
	@Column(name = "jelszo")
	private String jelszo;
	@Column(name = "keresztnev")
	private String keresztnev;
	@Column(name = "gyozelem")
	private Integer gyozelem = 0;
	@Column(name = "vereseg")
	private Integer vereseg = 0;

	/**
	 * Üres konstruktor a szerializálhatóság miatt.
	 */
	public Bejelentkezes() {
	}

	/**
	 * Visszaadja a felhasználó id-ját.
	 * 
	 * @return a felhasználó id-ja
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Beállítja a felhasználó id-ját
	 * 
	 * @param id
	 *            A beállítandó Id.
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Visszaadja a felhasználó felhasználónevét.
	 * 
	 * @return A felhasználó felhasználóneve.
	 */
	public String getFelhasznalonev() {
		return felhasznalonev;
	}

	/**
	 * Beállítja a felhasználó felhasználónevét.
	 * 
	 * @param felhasznalonev
	 *            A beállítandó felhasználónév.
	 */
	public void setFelhasznalonev(String felhasznalonev) {
		this.felhasznalonev = felhasznalonev;
	}

	/**
	 * Visszaadja a felhasználó jelszavát.
	 * 
	 * @return A felhasználó jelszava.
	 */
	public String getJelszo() {
		return jelszo;
	}

	/**
	 * Beállítja a felhasználó jelszavát.
	 * 
	 * @param jelszo
	 *            A beállítandó jelszó.
	 */
	public void setJelszo(String jelszo) {
		this.jelszo = jelszo;
	}

	/**
	 * Visszaadja a felhasználó keresztnevét.
	 * 
	 * @return A felhasználó keresztneve.
	 */
	public String getKeresztnev() {
		return keresztnev;
	}

	/**
	 * Beállítja a felhasználó keresztnevét.
	 * 
	 * @param keresztnev
	 *            A beállítandó keresztnév.
	 */
	public void setKeresztnev(String keresztnev) {
		this.keresztnev = keresztnev;
	}
	
	public Integer getGyozelem() {
		return gyozelem;
	}

	public void setGyozelem(Integer gyozelem) {
		this.gyozelem = gyozelem;
	}

	public Integer getVereseg() {
		return vereseg;
	}

	public void setVereseg(Integer vereseg) {
		this.vereseg = vereseg;
	}

}
