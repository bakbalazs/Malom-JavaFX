package hu.unideb.inf.malom.ui.kezelo.jatekszabaly;

import java.net.URL;
import java.util.ResourceBundle;

import hu.unideb.inf.malom.ui.kezelo.felulet.FeluletBetoltese;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;

public class JatekSzabalyKezelo implements Initializable {
	
	FeluletBetoltese betoltes = new FeluletBetoltese();
	
	@FXML
	private Button okeGomb;

	@FXML
	private void oke(ActionEvent event){
		((Node) (event.getSource())).getScene().getWindow().hide();

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

}
