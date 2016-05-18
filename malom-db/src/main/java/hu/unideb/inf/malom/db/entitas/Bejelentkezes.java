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
 * Az adatbázisban a felhasználókat reprezentáló osztály. Ez egy entitás amit az
 * adatbázisba leképezve egy user nevű táblát kapunk a megfelelő oszlopokkal.
 *
 **/
@Entity
@Table(name = "usersss")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Bejelentkezes.findAll", query = "SELECT u FROM Bejelentkezes u"), })
public class Bejelentkezes implements Serializable {

	/**
	 * Alapértelmezett szerializációs azonosító.
	 **/
	private static final long serialVersionUID = 1L;

	/**
	 * A játékos egyedi azonosítója.
	**/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	/**
	 * A játékos felhasználóneve.
	 **/
	@Column(name = "felhasznalonev")
	private String felhasznalonev;

	/**
	 * A játékos jelszava.
	* */
	@Column(name = "jelszo")
	private String jelszo;

	/**
	 * A játákos keresztneve.
	 **/
	@Column(name = "keresztnev")
	private String keresztnev;

	/**
	 * Mennyi győzelme volt egy játékosnak, alapból 0 értéket kap.
	 **/
	@Column(name = "gyozelem")
	private Integer gyozelem = 0;

	/**
	 * Mennyi veresége volt egy játékosnak, alapból 0 értéket kap.
	 **/
	@Column(name = "vereseg")
	private Integer vereseg = 0;

	/**
	 * Üres konstruktor a szerializálhatóság miatt.
	 **/
	public Bejelentkezes() {
	}

	/**
	 * Visszaadja a játékos id-ját.
	 * 
	 * @return a játékos id-ja
	 **/
	public Integer getId() {
		return id;
	}

	/**
	 * Beállítja a játékos id-ját.
	 * 
	 * @param id A beállítandó Id.
	 **/
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Visszaadja a játékos felhasználónevét.
	 * 
	 * @return A játékos felhasználóneve.
	 **/
	public String getFelhasznalonev() {
		return felhasznalonev;
	}

	/**
	 * Beállítja a játékos felhasználónevét.
	 * 
	 * @param felhasznalonev A beállítandó felhasználónév.
	 **/
	public void setFelhasznalonev(String felhasznalonev) {
		this.felhasznalonev = felhasznalonev;
	}

	/**
	 * Visszaadja a játékos jelszavát.
	 * 
	 * @return A játékos jelszava.
	 **/
	public String getJelszo() {
		return jelszo;
	}

	/**
	 * Beállítja a játékos jelszavát.
	 * 
	 * @param jelszo A beállítandó jelszó.
	 **/
	public void setJelszo(String jelszo) {
		this.jelszo = jelszo;
	}

	/**
	 * Visszaadja a játékos keresztnevét.
	 * 
	 * @return A játékos keresztneve.
	 **/
	public String getKeresztnev() {
		return keresztnev;
	}

	/**
	 * Beállítja a játékos keresztnevét.
	 * 
	 * @param keresztnev A beállítandó keresztnév.
	 **/
	public void setKeresztnev(String keresztnev) {
		this.keresztnev = keresztnev;
	}

	/**
	 * Visszaadja hogy a játékos hányszor nyert játékot.
	 * 
	 * @return A játékos győzelmeinek a száma.
	 **/
	public Integer getGyozelem() {
		return gyozelem;
	}

	/**
	 * Beállítja a játékos gyözelmeinek a számát.
	 * 
	 * @param gyozelem A beállítandó szám.
	 **/
	public void setGyozelem(Integer gyozelem) {
		this.gyozelem = gyozelem;
	}

	/**
	 * Visszaadja hogy a játékos hányszor vesztett játékot.
	 * 
	 * @return A játékos vereségeinek a száma.
	**/
	public Integer getVereseg() {
		return vereseg;
	}

	/**
	 * Beállítja a játékos vereségének a számát.
	 * 
	 * @param vereseg A beállítandó szám.
	 **/
	public void setVereseg(Integer vereseg) {
		this.vereseg = vereseg;
	}

}
