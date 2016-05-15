package hu.unideb.inf.malom.ui.kezelo.kezdo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hu.unideb.inf.malom.ui.kezelo.felulet.FeluletBetoltese;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;

public class InditasiKepernyoKezelo implements Initializable {

	FeluletBetoltese betoltes = new FeluletBetoltese();
	
	private static Logger logolo = LoggerFactory.getLogger(InditasiKepernyoKezelo.class);
	
	@FXML
	private Label informacio;

	@FXML
	public void bejelentkezesJatekba(ActionEvent event) throws IOException {
		logolo.debug("A bejelentkezési felület elindul.");
		betoltes.BelepesFelulet();
		((Node) (event.getSource())).getScene().getWindow().hide();
	}

	@FXML
	public void jatekosLetrehozasa(ActionEvent event) throws IOException {
		logolo.debug("A regisztrálás felület betölt.");
		betoltes.Regisztralas();
		((Node) (event.getSource())).getScene().getWindow().hide();
	}

	@FXML
	public void eredmenyLista(ActionEvent event) throws IOException {
		logolo.info("Az eredmények ablak betölt");
		betoltes.Eredmenyek();
		((Node) (event.getSource())).getScene().getWindow().hide();
	}

	@FXML
	public void kilepes(ActionEvent event) {
		logolo.info("Kilépés gombal leáll az alkalmazás.");
		Platform.exit();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	public void informacio(String info) {
		informacio.setText(info);
	}

}
