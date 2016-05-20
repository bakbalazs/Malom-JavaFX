package hu.unideb.inf.malom.ui.kezelo.malom;

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
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MalomKezelo implements Initializable {

	 private static Logger logolo = LoggerFactory.getLogger(MalomKezelo.class);
	 
	 private ImageView iv;
	 
	int curseur = 0 ;


	FeluletBetoltese betoltes = new FeluletBetoltese();

	@FXML
	private MenuBar menuBar;

	@FXML
	private Label elsoJatekos;

	@FXML
	private Label masodikJatekos;
	
	@FXML
	private VBox FeherBabuHely;
	
	@FXML
	private VBox FeketeBabuHely;

	@FXML
	public void kijelentkezesMenu(ActionEvent event) throws IOException {
		logolo.debug("Kijelentkezés gombot használták!");
		Stage stage = (Stage) menuBar.getScene().getWindow();
		stage.hide();
		betoltes.kijelentkezes();
	}

	@FXML
	public void bezarasMenu(ActionEvent event) {
		logolo.debug("Bezárás gombot használták!");
		Platform.exit();
	}
	
	@FXML
	public void jatekSzabaly(ActionEvent event) throws IOException {
		betoltes.JatekSzabaly();
	}
	
	@FXML
	public void keszitok(ActionEvent event) {
		
	}

	public void elsoJatekosNev(String keresztnev) {
		elsoJatekos.setText(keresztnev);
	}

	public void masodikJatekosNev(String keresztnev) {
		masodikJatekos.setText(keresztnev);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

        insertImage(new Image("/img/FeherKarika.png"), FeherBabuHely);
        insertImage(new Image("/img/FeherKarika.png"), FeherBabuHely);
        insertImage(new Image("/img/FeherKarika.png"), FeherBabuHely);
        insertImage(new Image("/img/FeherKarika.png"), FeherBabuHely);
        insertImage(new Image("/img/FeherKarika.png"), FeherBabuHely);
        insertImage(new Image("/img/FeherKarika.png"), FeherBabuHely);
        insertImage(new Image("/img/FeherKarika.png"), FeherBabuHely);
        insertImage(new Image("/img/FeherKarika.png"), FeherBabuHely);
        insertImage(new Image("/img/FeherKarika.png"), FeherBabuHely);
        
        insertImage(new Image("/img/FeketeKarika.png"), FeketeBabuHely);
        insertImage(new Image("/img/FeketeKarika.png"), FeketeBabuHely);
        insertImage(new Image("/img/FeketeKarika.png"), FeketeBabuHely);
        insertImage(new Image("/img/FeketeKarika.png"), FeketeBabuHely);
        insertImage(new Image("/img/FeketeKarika.png"), FeketeBabuHely);
        insertImage(new Image("/img/FeketeKarika.png"), FeketeBabuHely);
        insertImage(new Image("/img/FeketeKarika.png"), FeketeBabuHely);
        insertImage(new Image("/img/FeketeKarika.png"), FeketeBabuHely);
        insertImage(new Image("/img/FeketeKarika.png"), FeketeBabuHely);
	}
	
	public void insertImage(Image i, VBox hb1){
        
       iv = new ImageView();
       iv.setImage(i);
        
//       setupGestureSource(iv);

       hb1.getChildren().add(iv);
   }


}
