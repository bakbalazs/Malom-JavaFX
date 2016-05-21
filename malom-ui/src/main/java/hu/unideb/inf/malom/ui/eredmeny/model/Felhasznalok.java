package hu.unideb.inf.malom.ui.eredmeny.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * @author Bak Balázs
 *
 */

/**
 * A felhasználókat állítja be és adja vissza az eredménylista maitt szükséges.
 */
public class Felhasznalok {

	/**
	 * Az eredménylista számára létrehozott id.
	 */
	private SimpleIntegerProperty id;
	/**
	 * Az eredménylista számára létrehozott keresztnév.
	 */
	private SimpleStringProperty keresztnev;
	/**
	 * Az eredménylista számára létrehozott győzelem.
	 */
	private SimpleIntegerProperty gyozelem;
	/**
	 * Az eredménylista számára létrehozott vereség.
	 */
	private SimpleIntegerProperty vereseg;

	/**
	 * Konstruktor amivel létre tudunk hozni egy felhasználót, az eredménylista számára.
	 * 
	 * @param id a játékos beállítandó id-ja.
	 * @param keresztnev a játákos beállítandó keresztneve.
	 * @param gyozelem a játékoshoz tartozó győzelmi szám.
	 * @param vereseg a játékoshoz tartozó vereség száma.
	 */
	public Felhasznalok(Integer id, String keresztnev, Integer gyozelem, Integer vereseg) {
		this.id = new SimpleIntegerProperty(id);
		this.keresztnev = new SimpleStringProperty(keresztnev);
		this.gyozelem = new SimpleIntegerProperty(gyozelem);
		this.vereseg = new SimpleIntegerProperty(vereseg);
	}
	
	/**
	 * Visszaadja a játékos ID-ját.
	 * 
	 * @return A játékos id-ja.
	 */
	public Integer getId() {
		return id.get();
	}
	
	/**
	 * Visszaadja a játékos ID-ját az eredménylista számára.
	 * 
	 * @return A játékos id-ja.
	 */
	public SimpleIntegerProperty getIdProperty() {
		return id;
	}
	
	/**
	 * Beállítja a jáékos ID-ját.
	 * 
	 * @param id a beállítandó id.
	 */
	public void setId(Integer id) {
		this.id = new SimpleIntegerProperty(id);
	}
	
	/**
	 * Visszaadja a játékos keresztnevét.
	 * 
	 * @return A játékos keresztneve.
	 */
	public String getKeresztnev() {
		return keresztnev.get();
	}
	
	/**
	 * Visszaadja a játékos keresztnevét az eredménylista számára.
	 * 
	 * @return A játékos keresztneve.
	 */
	public SimpleStringProperty getKeresztnevProperty() {
		return keresztnev;
	}
	
	/**
	 * Beállítja a játékos keresztnevét.
	 * 
	 * @param keresztnev a beállítandó keresztnév.
	 */
	public void setKeresztnev(String keresztnev) {
		this.keresztnev = new SimpleStringProperty(keresztnev);
	}
	
	/**
	 * Visszaadja hogy az adott játékosnak mennyi győzelme van.
	 * 
	 * @return a játékos győzelmeinek a száma.
	 */
	public Integer getGyozelem() {
		return gyozelem.get();
	}
	
	/**
	 * Visszaadja hogy az adott játékosnak mennyi győzelme van az eredménylista számára.
	 * 
	 * @return a játékos győzelmeinek a száma.
	 */
	public SimpleIntegerProperty getGyozelemProperty() {
		return gyozelem;
	}
	
	/**
	 * Beállítja a játékos gyözelmeinek a számát.
	 * 
	 * @param gyozelem A beállítandó szám.
	 **/
	public void setGyozelem(Integer gyozelem) {
		this.gyozelem = new SimpleIntegerProperty(gyozelem);
	}
	
	/**
	 * Visszaadja hogy a játékos hányszor vesztett játékot.
	 * 
	 * @return A játékos vereségeinek a száma.
	**/
	public Integer getVereseg() {
		return vereseg.get();
	}
	
	/**
	 * Visszaadja hogy a játékos hányszor vesztett játékot az eredménylista számára.
	 * 
	 * @return A játékos vereségeinek a száma.
	**/
	public SimpleIntegerProperty getVeresegProperty() {
		return vereseg;
	}
	
	/**
	 * Beállítja a játékos vereségének a számát.
	 * 
	 * @param vereseg A beállítandó szám.
	 **/
	public void setVereseg(Integer vereseg) {
		this.vereseg = new SimpleIntegerProperty(vereseg);
	}

}
