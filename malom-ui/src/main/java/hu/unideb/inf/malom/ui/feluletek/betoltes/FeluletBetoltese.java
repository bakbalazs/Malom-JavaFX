package hu.unideb.inf.malom.ui.feluletek.betoltes;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hu.unideb.inf.malom.ui.bejelentkezo.kezelo.BejelentkezoKezelo;
import hu.unideb.inf.malom.ui.malomkinezet.kezelo.MalomKezelo;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FeluletBetoltese {
	private static Logger logolo = LoggerFactory.getLogger(FeluletBetoltese.class);
	private FXMLLoader loader = new FXMLLoader();
	private Stage stage = new Stage();

	public void BelepesFelulet() throws IOException {
		logolo.info("Bejelentkező felület indul");
		Pane parent = loader.load(getClass().getResource("/fxml/Bejelentkezo.fxml").openStream());
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Bejelentkezés");
		stage.show();
	}

	public void Regisztralas() throws IOException {
		logolo.info("Regisztrációs felület indul");
		Pane parent = loader.load(getClass().getResource("/fxml/UjFelhasznaloKinezet.fxml").openStream());
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Új Felhasználó Regisztrálása");
		stage.show();
	}

	public void MalomKinezet() throws IOException {
		logolo.info("Malom felület indul");
		Pane parent = loader.load(getClass().getResource("/fxml/MalomKinezet.fxml").openStream());
		MalomKezelo malom = (MalomKezelo) loader.getController();
		malom.elsoJatekosNev(BejelentkezoKezelo.elsoKeresztNev());
		malom.masodikJatekosNev(BejelentkezoKezelo.maosodikKeresztNev());
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Malom");
		stage.show();
	}

	public void ujFelhasznaloLetrehozva() throws IOException {
		logolo.info("Új felhasználó létrehozva szöveggel indul a bejelentkező felület.");
		Pane parent = loader.load(getClass().getResource("/fxml/Bejelentkezo.fxml").openStream());
		BejelentkezoKezelo bejelentkezo = (BejelentkezoKezelo) loader.getController();
		bejelentkezo.informacio("Új felhazsnáló létrehozva");
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Bejelentkezés");
		stage.show();
	}
}
