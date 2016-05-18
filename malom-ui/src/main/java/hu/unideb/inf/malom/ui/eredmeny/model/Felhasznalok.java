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
	 * 
	 */
	private SimpleIntegerProperty id;
	/**
	 * 
	 */
	private SimpleStringProperty keresztnev;
	/**
	 * 
	 */
	private SimpleIntegerProperty gyozelem;
	/**
	 * 
	 */
	private SimpleIntegerProperty vereseg;

	/**
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
	 * @return
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
	 * @return
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
	 * @return
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
	 * @return
	 */
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
