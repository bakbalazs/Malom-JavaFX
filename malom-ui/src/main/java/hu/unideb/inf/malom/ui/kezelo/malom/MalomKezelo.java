package hu.unideb.inf.malom.ui.kezelo.malom;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hu.unideb.inf.malom.ui.kezelo.felulet.FeluletBetoltese;
import hu.unideb.inf.malom.vezerles.KepBetoltese;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Point2D;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
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

	protected static int nombreRightF;

	protected static int nombreLeftF;

	protected static int curseur;

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
		logolo.info("Játékszabál megnyitva.");
		betoltes.JatekSzabaly();
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
		logolo.info("Fehér Bábuk felrakva.");

		KepBetoltese.insertImage(new Image("/img/FeketeKarika.png"), FeketeBabuHely);
		KepBetoltese.insertImage(new Image("/img/FeketeKarika.png"), FeketeBabuHely);
		KepBetoltese.insertImage(new Image("/img/FeketeKarika.png"), FeketeBabuHely);
		KepBetoltese.insertImage(new Image("/img/FeketeKarika.png"), FeketeBabuHely);
		KepBetoltese.insertImage(new Image("/img/FeketeKarika.png"), FeketeBabuHely);
		KepBetoltese.insertImage(new Image("/img/FeketeKarika.png"), FeketeBabuHely);
		KepBetoltese.insertImage(new Image("/img/FeketeKarika.png"), FeketeBabuHely);
		KepBetoltese.insertImage(new Image("/img/FeketeKarika.png"), FeketeBabuHely);
		KepBetoltese.insertImage(new Image("/img/FeketeKarika.png"), FeketeBabuHely);
		logolo.info("Fekete Bábuk felrakva.");

		// BabuMozgatas.mozgatKepCel(target1);
		// BabuMozgatas.mozgatKepCel(target2);
		// BabuMozgatas.mozgatKepCel(target3);
		// BabuMozgatas.mozgatKepCel(target4);
		// BabuMozgatas.mozgatKepCel(target5);
		// BabuMozgatas.mozgatKepCel(target6);
		// BabuMozgatas.mozgatKepCel(target7);
		// BabuMozgatas.mozgatKepCel(target8);
		// BabuMozgatas.mozgatKepCel(target9);
		// BabuMozgatas.mozgatKepCel(target10);
		// BabuMozgatas.mozgatKepCel(target11);
		// BabuMozgatas.mozgatKepCel(target12);
		// BabuMozgatas.mozgatKepCel(target13);
		// BabuMozgatas.mozgatKepCel(target14);
		// BabuMozgatas.mozgatKepCel(target15);
		// BabuMozgatas.mozgatKepCel(target16);
		// BabuMozgatas.mozgatKepCel(target17);
		// BabuMozgatas.mozgatKepCel(target18);
		// BabuMozgatas.mozgatKepCel(target19);
		// BabuMozgatas.mozgatKepCel(target20);
		// BabuMozgatas.mozgatKepCel(target21);
		// BabuMozgatas.mozgatKepCel(target22);
		// BabuMozgatas.mozgatKepCel(target23);
		// BabuMozgatas.mozgatKepCel(target24);

		mozgatKepCel(target1);
		mozgatKepCel(target2);
		mozgatKepCel(target3);
		mozgatKepCel(target4);
		mozgatKepCel(target5);
		mozgatKepCel(target6);
		mozgatKepCel(target7);
		mozgatKepCel(target8);
		mozgatKepCel(target9);
		mozgatKepCel(target10);
		mozgatKepCel(target11);
		mozgatKepCel(target12);
		mozgatKepCel(target13);
		mozgatKepCel(target14);
		mozgatKepCel(target15);
		mozgatKepCel(target16);
		mozgatKepCel(target17);
		mozgatKepCel(target18);
		mozgatKepCel(target19);
		mozgatKepCel(target20);
		mozgatKepCel(target21);
		mozgatKepCel(target22);
		mozgatKepCel(target23);
		mozgatKepCel(target24);

	}

	public void mozgatKepForras(final ImageView source) {

		source.setOnDragDetected(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				Dragboard db = source.startDragAndDrop(TransferMode.MOVE);
				ClipboardContent content = new ClipboardContent();
				Image sourceImage = source.getImage();
				content.putImage(sourceImage);
				db.setContent(content);
				KepBetoltese.imageView = source;
				event.consume();
			}
		});

		source.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				source.setCursor(Cursor.HAND);
				System.out.println("e...: " + e.getSceneX());
				// curseur = (int) e.getSceneX();
			}
		});
	}

	static int nombreLeft = 9;
	static int nombreRight = 0;

	boolean odarakva = true;

	int c = 0;

	public void mozgatKepCel(final VBox targetBox) {

		targetBox.setOnDragOver(new EventHandler<DragEvent>() {
			@Override
			public void handle(DragEvent event) {

				Dragboard db = event.getDragboard();

				if (db.hasImage()) {
					event.acceptTransferModes(TransferMode.MOVE);
				}

				event.consume();
			}
		});

		targetBox.setOnDragDropped(new EventHandler<DragEvent>() {
			@Override
			public void handle(DragEvent event) {

				Dragboard db = event.getDragboard();

				if (db.hasImage()) {

					KepBetoltese.imageView.setImage(db.getImage());

					Point2D localPoint = targetBox.sceneToLocal(new Point2D(event.getSceneX(), event.getSceneY()));

					// System.out.println("event.getSceneX : " +
					// event.getSceneX());
					// System.out.println("localPoint.getX : " +
					// localPoint.getX());
					// System.out.println("********");

					targetBox.getChildren().remove(KepBetoltese.imageView);

					KepBetoltese.imageView
							.setX((int) (localPoint.getX() - KepBetoltese.imageView.getBoundsInLocal().getWidth() / 2));
					KepBetoltese.imageView.setY(
							(int) (localPoint.getY() - KepBetoltese.imageView.getBoundsInLocal().getHeight() / 2));

					targetBox.getChildren().add(KepBetoltese.imageView);
				

					event.setDropCompleted(true);
				} else {
					event.setDropCompleted(false);
				}

				event.consume();
			}
		});

	}

}
