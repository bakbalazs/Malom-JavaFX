package hu.unideb.inf.malom.vezerles;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class KepBetoltese {

	static ImageView iv;

	public static void insertImage(Image i, VBox hb1) {
		iv = new ImageView();
		iv.setImage(i);

		BabuMozgatas.setupGestureSource(iv);

		hb1.getChildren().add(iv);
	}

}
