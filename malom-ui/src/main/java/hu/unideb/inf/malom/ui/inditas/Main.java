package hu.unideb.inf.malom.ui.inditas;

import java.io.IOException;

import hu.unideb.inf.malom.ui.feluletek.betoltes.FeluletBetoltese;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author Bak Balázs
 *
 */
public class Main extends Application {

	FeluletBetoltese betoltes = new FeluletBetoltese();

	@Override
	public void start(Stage Stage) throws IOException{
		betoltes.BelepesFelulet();
//		betoltes.MalomKinezet();
//		betoltes.Regisztralas();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
