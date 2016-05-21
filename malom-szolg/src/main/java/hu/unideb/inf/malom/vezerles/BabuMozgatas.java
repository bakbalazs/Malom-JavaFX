package hu.unideb.inf.malom.vezerles;

import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Cursor;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.VBox;

public class BabuMozgatas {

	public static void mozgatKepForras(final ImageView source) {

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
			}
		});
	}

	public static void mozgatKepCel(final VBox targetBox) {

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
