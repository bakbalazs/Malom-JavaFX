package hu.unideb.inf.malom.ui.ujfelhasznalo.kinezet;

import java.io.IOException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import hu.unideb.inf.malom.db.entitas.Bejelentkezes;
import hu.unideb.inf.malom.db.entitas.EntitasKezelo;
import hu.unideb.inf.malom.db.entitas.TaroltFelhasznalok;
import hu.unideb.inf.malom.db.jelszotitkositas.JelszoTitkositas;
import hu.unideb.inf.malom.ui.bejelentkezo.kezelo.BejelentkezoKezelo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class UjFelhasznaloKezelo implements Initializable {

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

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		FelhasznaloLista = felhasznalok.taroltFelhasznalok();
	}

	@FXML
	private void UjFelhasznaloLetrehozas(ActionEvent event) throws NoSuchAlgorithmException, IOException {
		Bejelentkezes addnew = new Bejelentkezes();
		FelhasznaloLista = felhasznalok.taroltFelhasznalok();
		for (Bejelentkezes l : FelhasznaloLista) {
			if (felhasznalonev.getText().equals(l.getFelhasznalonev())) {
				uzenet.setText("Már van ilyen regisztrált felhasználó.");
				felhasznalonev.clear();
				jelszo.clear();
				keresztnev.clear();
				return;
			}
		}
		if (felhasznalonev.getText().isEmpty() == true || jelszo.getText().isEmpty() == true) {
			uzenet.setText("Kérem írjon be felhasználónevet és jelszót!");
			return;
		} else {
			addnew.setKeresztnev(keresztnev.getText());
			addnew.setFelhasznalonev(felhasznalonev.getText());
			addnew.setJelszo(JelszoTitkositas.titkositas(jelszo.getText()));
			EntitasKezelo es = new EntitasKezelo();
			es.em.persist(addnew);
			es.em.getTransaction().commit();
			es.em.close();
			((Node) (event.getSource())).getScene().getWindow().hide();
			ujFelhasznaloLetrehozva();
		}
	}

	public void ujFelhasznaloLetrehozva() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		Pane parent = loader.load(getClass().getResource("/fxml/Bejelentkezo.fxml").openStream());
		BejelentkezoKezelo s = (BejelentkezoKezelo) loader.getController();
		s.informacio("Új felhazsnáló létrehozva");
		Stage stage = new Stage();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Bejelentkezés");
		stage.show();
	}

}