package hu.unideb.inf.malom.ui.kezelo.eredmeny;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import hu.unideb.inf.malom.ui.kezelo.felulet.FeluletBetoltese;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;

public class EredmenyListaKezelo implements Initializable {
	
	FeluletBetoltese betoltes = new FeluletBetoltese();
	
	@FXML
	public void visszaGomb(ActionEvent event) throws IOException {
		((Node) (event.getSource())).getScene().getWindow().hide();
		betoltes.inditasiKepernyo();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

}
