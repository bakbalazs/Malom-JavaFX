package hu.unideb.inf.malom.ui.eredmeny.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Felhasznalok {

	private SimpleIntegerProperty id;
	private SimpleStringProperty keresztnev;
//	private SimpleIntegerProperty gyozelem;
//	private SimpleIntegerProperty vereseg;

	public Felhasznalok(Integer id, String keresztnev/*, Integer gyozelem, Integer vereseg*/) {
		this.id = new SimpleIntegerProperty(id);
		this.keresztnev = new SimpleStringProperty(keresztnev);
//		this.gyozelem = new SimpleIntegerProperty(gyozelem);
//		this.vereseg = new SimpleIntegerProperty(vereseg);
	}
	
	public Integer getId() {
		return id.get();
	}
	
	public SimpleIntegerProperty getIdProperty() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = new SimpleIntegerProperty(id);
	}
	
	public String getKeresztnev() {
		return keresztnev.get();
	}
	
	public SimpleStringProperty getKeresztnevProperty() {
		return keresztnev;
	}
	
	public void setKeresztnev(String keresztnev) {
		this.keresztnev = new SimpleStringProperty(keresztnev);
	}
	
//	public Integer getGyozelem() {
//		return gyozelem.get();
//	}
//	
//	public SimpleIntegerProperty getGyozelemProperty() {
//		return gyozelem;
//	}
//	
//	public void setGyozelem(Integer gyozelem) {
//		this.gyozelem = new SimpleIntegerProperty(gyozelem);
//	}
//	
//	public Integer getVereseg() {
//		return vereseg.get();
//	}
//	
//	public SimpleIntegerProperty getVeresegProperty() {
//		return vereseg;
//	}
//	
//	public void setVereseg(Integer vereseg) {
//		this.vereseg = new SimpleIntegerProperty(vereseg);
//	}

}
