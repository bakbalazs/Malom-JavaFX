package hu.unideb.inf.malom.ui.kezelo.felulet;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hu.unideb.inf.malom.ui.kezelo.bejelentkezo.BejelentkezoKezelo;
import hu.unideb.inf.malom.ui.kezelo.kezdo.InditasiKepernyoKezelo;
import hu.unideb.inf.malom.ui.kezelo.malom.MalomKezelo;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FeluletBetoltese {
	private static Logger logolo = LoggerFactory.getLogger(FeluletBetoltese.class);
	private FXMLLoader loader = new FXMLLoader();
	private Stage stage = new Stage();

	public void inditasiKepernyo() throws IOException {
		logolo.info("Indítási képernyő indul");
		Pane parent = loader.load(getClass().getResource("/fxml/InditasiKepernyo.fxml").openStream());
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Malom Indítási Képernyő");
		stage.show();
	}

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
		logolo.info("Új felhasználó létrehozva szöveggel indul az indító képernyő.");
		Pane parent = loader.load(getClass().getResource("/fxml/InditasiKepernyo.fxml").openStream());
		InditasiKepernyoKezelo inditas = (InditasiKepernyoKezelo) loader.getController();
		inditas.informacio("Új felhasználó létrehozva!");
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Bejelentkezés");
		stage.show();
	}

	public void kijelentkezes() throws IOException {
		logolo.info("Sikeresen kijelentkeztél a malomból!");
		Pane parent = loader.load(getClass().getResource("/fxml/Bejelentkezo.fxml").openStream());
		BejelentkezoKezelo bejelentkezo = (BejelentkezoKezelo) loader.getController();
		bejelentkezo.informacio("Sikeresen Kijelentkeztél a játékból!");
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Bejelentkezés");
		stage.show();
	}

	public void Eredmenyek() throws IOException {
		logolo.info("Eredmény lista indul");
		Pane parent = loader.load(getClass().getResource("/fxml/EredmenyLista.fxml").openStream());
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Eredmények");
		stage.show();
	}

	public void JatekSzabaly() throws IOException {
		logolo.info("Játékszabály meg lett nyitva.");
//		Pane p = loader.load(getClass().getResource("/fxml/JatekSzabaly.fxml").openStream());
//		Scene s = new Scene(p);
//		stage.setScene(s);
//		stage.setResizable(false);
//		stage.setTitle("Játékszabály");
//		stage.show();
	}
}
