package hu.unideb.inf.malom.ui.kezelo.malom;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hu.unideb.inf.malom.ui.kezelo.felulet.FeluletBetoltese;
import hu.unideb.inf.malom.vezerles.BabuMozgatas;
import hu.unideb.inf.malom.vezerles.KepBetoltese;
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
	private VBox target1;

	@FXML
	private VBox target2;

	@FXML
	private VBox target3;

	@FXML
	private VBox target4;

	@FXML
	private VBox target5;

	@FXML
	private VBox target6;

	@FXML
	private VBox target7;

	@FXML
	private VBox target8;

	@FXML
	private VBox target9;

	@FXML
	private VBox target10;

	@FXML
	private VBox target11;

	@FXML
	private VBox target12;

	@FXML
	private VBox target13;

	@FXML
	private VBox target14;

	@FXML
	private VBox target15;

	@FXML
	private VBox target16;

	@FXML
	private VBox target17;

	@FXML
	private VBox target18;

	@FXML
	private VBox target19;

	@FXML
	private VBox target20;

	@FXML
	private VBox target21;

	@FXML
	private VBox target22;

	@FXML
	private VBox target23;

	@FXML
	private VBox target24;

	@FXML
	private ImageView img1;

	@FXML
	private ImageView img2;

	@FXML
	private ImageView img3;

	@FXML
	private ImageView img4;

	@FXML
	private ImageView img5;

	@FXML
	private ImageView img6;

	@FXML
	private ImageView img7;

	@FXML
	private ImageView img8;

	@FXML
	private ImageView img9;

	@FXML
	private ImageView img10;

	@FXML
	private ImageView img11;

	@FXML
	private ImageView img12;

	@FXML
	private ImageView img13;

	@FXML
	private ImageView img14;

	@FXML
	private ImageView img15;

	@FXML
	private ImageView img16;

	@FXML
	private ImageView img17;

	@FXML
	private ImageView img18;

	@FXML
	private ImageView img19;

	@FXML
	private ImageView img20;

	@FXML
	private ImageView img21;

	@FXML
	private ImageView img22;

	@FXML
	private ImageView img23;

	@FXML
	private ImageView img24;

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
		KepBetoltese.insertImage(new Image("/img/FeherKarika.png"), FeherBabuHely);
		KepBetoltese.insertImage(new Image("/img/FeherKarika.png"), FeherBabuHely);
		KepBetoltese.insertImage(new Image("/img/FeherKarika.png"), FeherBabuHely);
		KepBetoltese.insertImage(new Image("/img/FeherKarika.png"), FeherBabuHely);
		KepBetoltese.insertImage(new Image("/img/FeherKarika.png"), FeherBabuHely);
		KepBetoltese.insertImage(new Image("/img/FeherKarika.png"), FeherBabuHely);
		KepBetoltese.insertImage(new Image("/img/FeherKarika.png"), FeherBabuHely);
		KepBetoltese.insertImage(new Image("/img/FeherKarika.png"), FeherBabuHely);
		KepBetoltese.insertImage(new Image("/img/FeherKarika.png"), FeherBabuHely);

		KepBetoltese.insertImage(new Image("/img/FeketeKarika.png"), FeketeBabuHely);
		KepBetoltese.insertImage(new Image("/img/FeketeKarika.png"), FeketeBabuHely);
		KepBetoltese.insertImage(new Image("/img/FeketeKarika.png"), FeketeBabuHely);
		KepBetoltese.insertImage(new Image("/img/FeketeKarika.png"), FeketeBabuHely);
		KepBetoltese.insertImage(new Image("/img/FeketeKarika.png"), FeketeBabuHely);
		KepBetoltese.insertImage(new Image("/img/FeketeKarika.png"), FeketeBabuHely);
		KepBetoltese.insertImage(new Image("/img/FeketeKarika.png"), FeketeBabuHely);
		KepBetoltese.insertImage(new Image("/img/FeketeKarika.png"), FeketeBabuHely);
		KepBetoltese.insertImage(new Image("/img/FeketeKarika.png"), FeketeBabuHely);

		BabuMozgatas.setupGestureTarget(target1);
		BabuMozgatas.setupGestureTarget(target2);
		BabuMozgatas.setupGestureTarget(target3);
		BabuMozgatas.setupGestureTarget(target4);
		BabuMozgatas.setupGestureTarget(target5);
		BabuMozgatas.setupGestureTarget(target6);
		BabuMozgatas.setupGestureTarget(target7);
		BabuMozgatas.setupGestureTarget(target8);
		BabuMozgatas.setupGestureTarget(target9);
		BabuMozgatas.setupGestureTarget(target10);
		BabuMozgatas.setupGestureTarget(target11);
		BabuMozgatas.setupGestureTarget(target12);
		BabuMozgatas.setupGestureTarget(target13);
		BabuMozgatas.setupGestureTarget(target14);
		BabuMozgatas.setupGestureTarget(target15);
		BabuMozgatas.setupGestureTarget(target16);
		BabuMozgatas.setupGestureTarget(target17);
		BabuMozgatas.setupGestureTarget(target18);
		BabuMozgatas.setupGestureTarget(target19);
		BabuMozgatas.setupGestureTarget(target20);
		BabuMozgatas.setupGestureTarget(target21);
		BabuMozgatas.setupGestureTarget(target22);
		BabuMozgatas.setupGestureTarget(target23);
		BabuMozgatas.setupGestureTarget(target24);
	}

}
