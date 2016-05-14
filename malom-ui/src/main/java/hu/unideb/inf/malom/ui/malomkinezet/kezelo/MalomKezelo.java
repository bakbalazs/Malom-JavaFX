package hu.unideb.inf.malom.ui.malomkinezet.kezelo;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class MalomKezelo implements Initializable {

	@FXML
	private Label elsoJatekos;

	@FXML
	private Label masodikJatekos;

	public void elsoJatekosNev(String keresztnev) {
		elsoJatekos.setText(keresztnev);
	}

	public void masodikJatekosNev(String keresztnev) {
		masodikJatekos.setText(keresztnev);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

}
