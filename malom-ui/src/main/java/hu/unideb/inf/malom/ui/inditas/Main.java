package hu.unideb.inf.malom.ui.inditas;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Bak Balázs
 *
 */
public class Main extends Application {

	
	/**
	 * Üres konstruktor a példányosítás miatt.
	 */
	public Main() {
	}

	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage Stage) throws IOException {
		Belepes();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * @throws IOException
	 */
	public void Belepes() throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource("/fxml/Bejelentkezo.fxml"));
		Stage stage = new Stage();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Bejelentkezés");
		stage.show();
	}
	
	/**
	 * @throws IOException
	 */
	public void Regisztralas() throws IOException {
		Parent parent = FXMLLoader
				.load(getClass().getResource("/hu/unideb/inf/malom/ui/ujfelhasznalo/kinezet/UjFelhasznaloKinezet.fxml"));
		Stage stage = new Stage();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Új Felhasználó Regisztrálása");
		stage.show();
	}

}
