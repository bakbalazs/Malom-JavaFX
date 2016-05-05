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

@Entity
@Table(name = "user")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Bejelentkezes.findAll", query = "SELECT u FROM Bejelentkezes u"), })
public class Bejelentkezes implements Serializable {

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

	public Bejelentkezes() {
	}

	public Bejelentkezes(Integer id) {
		this.id = id;
	}

	public Bejelentkezes(String felhazsnalonev, String jelszo, String keresztnev) {
		this.setFelhasznalonev(felhazsnalonev);
		this.setKeresztnev(keresztnev);
		this.jelszo = jelszo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFelhasznalonev() {
		return felhasznalonev;
	}

	public void setFelhasznalonev(String felhasznalonev) {
		this.felhasznalonev = felhasznalonev;
	}

	public String getJelszo() {
		return jelszo;
	}

	public void setJelszo(String jelszo) {
		this.jelszo = jelszo;
	}

	public String getKeresztnev() {
		return keresztnev;
	}

	public void setKeresztnev(String keresztnev) {
		this.keresztnev = keresztnev;
	}

}
