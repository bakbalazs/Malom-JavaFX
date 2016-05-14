package hu.unideb.inf.malom.ui.bejelentkezo.kezelo;

import java.io.IOException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hu.unideb.inf.malom.db.entitas.Bejelentkezes;
import hu.unideb.inf.malom.db.entitas.TaroltFelhasznalok;
import hu.unideb.inf.malom.db.jelszotitkositas.JelszoTitkositas;
import hu.unideb.inf.malom.ui.feluletek.betoltes.FeluletBetoltese;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class BejelentkezoKezelo implements Initializable {

	FeluletBetoltese betoltes = new FeluletBetoltese();

	private static Logger logolo = LoggerFactory.getLogger(BejelentkezoKezelo.class);

	private String elsoFelhasznalo;
	private String masodikFelhasznalo;
	private static String elsoKeresztNev;
	private static String masoidkKeresztNev;
	private boolean elsoFelhasznaloBelepve = false;
	private boolean masodikFelhasznaloBelepve = false;

	@FXML
	private TextField elsoFelhasznalonev;

	@FXML
	private TextField masodikFelhasznalonev;

	@FXML
	private PasswordField elsoJelszo;

	@FXML
	private PasswordField masodikJelszo;

	@FXML
	private Label uzenet;

	@FXML
	private Label uzenet1;

	@FXML
	private Label uzenetOsszes;

	@FXML
	private Label infoElso;

	@FXML
	private Label infoFelhasznalonev;

	@FXML
	private Label infoJelszo;

	@FXML
	private Label infoMasodik;

	@FXML
	private Label infoFelhasznalonev2;

	@FXML
	private Label infoJelszo2;

	@FXML
	private Button bejelentkezoGomb;

	@FXML
	private Button bejelentkezoGomb2;

	@FXML
	private Button jatekIndit;

	private List<Bejelentkezes> FelhasznaloLista = new ArrayList<>();
	private TaroltFelhasznalok felhasznalok = new TaroltFelhasznalok();

	@FXML
	private void elsoBejelentkezes(ActionEvent event) throws NoSuchAlgorithmException {
		elsoFelhasznalo = elsoFelhasznalonev.getText();
		if (elsoFelhasznalo.equals(masodikFelhasznalo)) {
			uzenet.setText("Már beléptek ezzel a felhasználóval!");
		} else if (masodikFelhasznalo == null || !masodikFelhasznalo.equals(elsoFelhasznalo)) {
			for (Bejelentkezes l : FelhasznaloLista) {
				if (elsoFelhasznalo.equals(l.getFelhasznalonev())
						&& JelszoTitkositas.titkositas(elsoJelszo.getText()).equals(l.getJelszo())) {
					elsoFelhasznaloElemekTorlese();
					logolo.debug(
							"Az első felhasználó bejelentkezo elemeinek letiltása hogy a bejelentekzés valós legyen!");
					elsoKeresztNev = l.getKeresztnev();
					logolo.info("Az első felhasználó sikeresen belépett , a keresztneve: " + elsoKeresztNev);
					uzenet.setText("Sikeres beléptél az első felhazsnálóval Neve: " + elsoKeresztNev);
					elsoFelhasznaloBelepve = true;
					jatekIndit();
					break;
				} else {
					logolo.debug("Nem sikerült belépni az első felhasználóval!");
					uzenet.setText("Nem sikerült bejelentkezni!");
				}
			}
			uzenetOsszes.setVisible(false);
		}
	}

	@FXML
	private void masoidkBejelentkezes(ActionEvent event) throws NoSuchAlgorithmException {
		masodikFelhasznalo = masodikFelhasznalonev.getText();
		if (masodikFelhasznalo.equals(elsoFelhasznalo)) {
			uzenet1.setText("Már beléptek ezzel a felhasználóval!");
		} else if (elsoFelhasznalo == null || !elsoFelhasznalo.equals(masodikFelhasznalo)) {
			for (Bejelentkezes l : FelhasznaloLista) {
				if (masodikFelhasznalo.equals(l.getFelhasznalonev())
						&& JelszoTitkositas.titkositas(masodikJelszo.getText()).equals(l.getJelszo())) {
					masodikFelhasznaloElemekTorlese();
					logolo.debug(
							"A második felhasználó bejelenetkező elemeinek letiltása hogy a bejelentekzés valós legyen!");
					masoidkKeresztNev = l.getKeresztnev();
					logolo.info("Az első felhasználó sikeresen belépett , a keresztneve: " + masoidkKeresztNev);
					uzenet1.setText("Sikeres beléptél a második felhazsnálóval Neve: " + masoidkKeresztNev);
					masodikFelhasznaloBelepve = true;
					jatekIndit();
					break;
				} else {
					logolo.debug("Nem sikerült belépni a második felhasználóval!");
					uzenet1.setText("Nem sikerült bejelentkezni!");
				}
			}
			uzenetOsszes.setVisible(false);
		}
	}

	@FXML
	private void ujFelhasznalo(ActionEvent event) throws IOException {
		betoltes.Regisztralas();
		((Node) (event.getSource())).getScene().getWindow().hide();
	}

	@FXML
	private void JatekInditasa(ActionEvent event) throws IOException {
		betoltes.MalomKinezet();
		((Node) (event.getSource())).getScene().getWindow().hide();
	}

	public void elsoFelhasznaloElemekTorlese() {
		elsoFelhasznalonev.setVisible(false);
		elsoJelszo.setVisible(false);
		infoElso.setVisible(false);
		infoFelhasznalonev.setVisible(false);
		infoJelszo.setVisible(false);
		bejelentkezoGomb.setVisible(false);
	}

	public void masodikFelhasznaloElemekTorlese() {
		masodikFelhasznalonev.setVisible(false);
		masodikJelszo.setVisible(false);
		infoMasodik.setVisible(false);
		infoFelhasznalonev2.setVisible(false);
		infoJelszo2.setVisible(false);
		bejelentkezoGomb2.setVisible(false);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		FelhasznaloLista = felhasznalok.taroltFelhasznalok();
		jatekIndit.setVisible(false);

	}

	public void jatekIndit() {
		if (elsoFelhasznaloBelepve == true && masodikFelhasznaloBelepve == true) {
			jatekIndit.setVisible(true);
		}
	}

	public void informacio(String info) {
		uzenetOsszes.setText(info);
	}

	public static String elsoKeresztNev() {
		return elsoKeresztNev;
	}

	public static String maosodikKeresztNev() {
		return masoidkKeresztNev;
	}
}
