package hu.unideb.inf.malom.ui.inditas;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * @author Bak Balázs
 *
 */
public class Main extends Application {

	public Main() {
	}

	@Override
	public void start(Stage Stage) throws IOException {
		Belepes();
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void Belepes() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		Pane parent = loader.load(getClass().getResource("/fxml/Bejelentkezo.fxml").openStream());
		Stage stage = new Stage();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Bejelentkezés");
		stage.show();
	}

	public void Regisztralas() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		Pane parent = loader.load(getClass().getResource("/fxml/UjFelhasznaloKinezet.fxml").openStream());
		Stage stage = new Stage();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Új Felhasználó Regisztrálása");
		stage.show();
	}

}
