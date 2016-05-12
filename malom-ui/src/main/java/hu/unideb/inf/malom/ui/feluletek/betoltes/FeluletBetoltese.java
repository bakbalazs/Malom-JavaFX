package hu.unideb.inf.malom.ui.feluletek.betoltes;

import java.io.IOException;

import hu.unideb.inf.malom.ui.bejelentkezo.kezelo.BejelentkezoKezelo;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FeluletBetoltese {
	private FXMLLoader loader = new FXMLLoader();

	public void BelepesFelulet() throws IOException {
		Pane parent = loader.load(getClass().getResource("/fxml/Bejelentkezo.fxml").openStream());
		Stage stage = new Stage();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Bejelentkezés");
		stage.show();
	}
	
	public void Regisztralas() throws IOException {
		Pane parent = loader.load(getClass().getResource("/fxml/UjFelhasznaloKinezet.fxml").openStream());
		Stage stage = new Stage();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Új Felhasználó Regisztrálása");
		stage.show();
	}
	
	public void MalomKinezet() throws IOException {
		Pane parent = loader.load(getClass().getResource("/fxml/MalomKinezet.fxml").openStream());
		Stage stage = new Stage();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Malom");
		stage.show();
	}
	
	public void ujFelhasznaloLetrehozva() throws IOException {
		Pane parent = loader.load(getClass().getResource("/fxml/Bejelentkezo.fxml").openStream());
		BejelentkezoKezelo bejelentkezo = (BejelentkezoKezelo) loader.getController();
		bejelentkezo.informacio("Új felhazsnáló létrehozva");
		Stage stage = new Stage();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Bejelentkezés");
		stage.show();
	}

}
