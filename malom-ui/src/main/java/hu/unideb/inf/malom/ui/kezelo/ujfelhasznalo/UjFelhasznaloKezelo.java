package hu.unideb.inf.malom.ui.kezelo.ujfelhasznalo;

import java.io.IOException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hu.unideb.inf.malom.db.entitas.Bejelentkezes;
import hu.unideb.inf.malom.db.entitas.EntitasKezelo;
import hu.unideb.inf.malom.db.entitas.TaroltFelhasznalok;
import hu.unideb.inf.malom.db.jelszotitkositas.JelszoTitkositas;
import hu.unideb.inf.malom.ui.kezelo.felulet.FeluletBetoltese;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class UjFelhasznaloKezelo implements Initializable {

	FeluletBetoltese betoltes = new FeluletBetoltese();

	@FXML
	private TextField keresztnev;

	@FXML
	private TextField felhasznalonev;

	@FXML
	private PasswordField jelszo;

	@FXML
	private Label uzenet;

	private List<Bejelentkezes> FelhasznaloLista = new ArrayList<>();
	private TaroltFelhasznalok felhasznalok = new TaroltFelhasznalok();

	private static Logger logolo = LoggerFactory.getLogger(UjFelhasznaloKezelo.class);

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		FelhasznaloLista = felhasznalok.taroltFelhasznalok();
		logolo.debug("Litába rakja a jelenlegi felhasználókat!");
	}

	@FXML
	private void UjFelhasznaloLetrehozas(ActionEvent event) throws NoSuchAlgorithmException, IOException {
		Bejelentkezes addnew = new Bejelentkezes();
		FelhasznaloLista = felhasznalok.taroltFelhasznalok();
		for (Bejelentkezes l : FelhasznaloLista) {
			if (felhasznalonev.getText().equals(l.getFelhasznalonev())) {
				logolo.info("Már van ilyen regisztrált felhasználó!");
				uzenet.setText("Már van ilyen regisztrált felhasználó.");
				felhasznalonev.clear();
				jelszo.clear();
				keresztnev.clear();
				return;
			}
		}
		if (felhasznalonev.getText().isEmpty() == true || jelszo.getText().isEmpty() == true) {
			uzenet.setText("Kérem írjon be felhasználónevet és jelszót!");
			logolo.info("Nem írt be felhasználónevet vagy jelszót!");
			return;
		} else {
			addnew.setKeresztnev(keresztnev.getText());
			addnew.setFelhasznalonev(felhasznalonev.getText());
			addnew.setJelszo(JelszoTitkositas.titkositas(jelszo.getText()));
			EntitasKezelo es = new EntitasKezelo();
			es.em.persist(addnew);
			es.em.getTransaction().commit();
			es.em.close();
			logolo.info("Létrehozva az új felhasználó és betöltve a táblázatba!");
			((Node) (event.getSource())).getScene().getWindow().hide();
			betoltes.ujFelhasznaloLetrehozva();
		}
	}
	
	@FXML
	private void visszaGomb(ActionEvent event) throws IOException {
		((Node) (event.getSource())).getScene().getWindow().hide();
		betoltes.inditasiKepernyo();
	}

}