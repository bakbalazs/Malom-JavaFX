package hu.unideb.inf.malom.vezerles;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class KepBetoltese {

	public static ImageView imageView;

	public static void betoltes(Image i, VBox hb1) {
		imageView = new ImageView();
		imageView.setImage(i);

		BabuMozgatas.mozgatKepForras(imageView);

		hb1.getChildren().add(imageView);
	}

}
