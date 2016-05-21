package hu.unideb.inf.malom.ui.kezelo.inditas;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hu.unideb.inf.malom.ui.kezelo.felulet.FeluletBetoltese;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author Bak Balázs
 *
 */
public class Main extends Application {

	FeluletBetoltese betoltes = new FeluletBetoltese();
	private static Logger logolo = LoggerFactory.getLogger(Main.class);

	@Override
	public void start(Stage Stage) throws IOException {
		logolo.info("Javafx indull");
//		betoltes.inditasiKepernyo();
		 betoltes.MalomKinezet();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
