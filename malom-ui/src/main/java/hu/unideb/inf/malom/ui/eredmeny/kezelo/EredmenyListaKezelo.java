package hu.unideb.inf.malom.ui.eredmeny.kezelo;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import hu.unideb.inf.malom.db.entitas.Bejelentkezes;
import hu.unideb.inf.malom.db.entitas.TaroltFelhasznalok;
import hu.unideb.inf.malom.ui.eredmeny.model.Felhasznalok;
import hu.unideb.inf.malom.ui.kezelo.felulet.FeluletBetoltese;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class EredmenyListaKezelo implements Initializable {

	FeluletBetoltese betoltes = new FeluletBetoltese();

	private List<Bejelentkezes> FelhasznaloLista = new ArrayList<>();
	private TaroltFelhasznalok felhasznalok = new TaroltFelhasznalok();

	ObservableList<Felhasznalok> adatok;

	@FXML
	private TableView<Felhasznalok> tabla;

	@FXML
	private TableColumn<Felhasznalok, Number> id;

	@FXML
	private TableColumn<Felhasznalok, String> keresztnev;

	@FXML
	private TableColumn<Felhasznalok, Number> gyozelem;

	@FXML
	private TableColumn<Felhasznalok, Number> vereseg;

	@FXML
	public void visszaGomb(ActionEvent event) throws IOException {
		((Node) (event.getSource())).getScene().getWindow().hide();
		betoltes.inditasiKepernyo();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		FelhasznaloLista = felhasznalok.taroltFelhasznalok();
		adatok = FXCollections.observableArrayList();
		for (Bejelentkezes l : FelhasznaloLista) {
			if(l.getGyozelem() > 0 || l.getVereseg() > 0){
			adatok.add(new Felhasznalok(l.getId(), l.getKeresztnev() , l.getGyozelem(), l.getVereseg()));
		
		}}
		tabla.setItems(adatok);
		tabla.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

		id.setCellValueFactory(c -> c.getValue().getIdProperty());
		keresztnev.setCellValueFactory(c -> c.getValue().getKeresztnevProperty());
		gyozelem.setCellValueFactory(c -> c.getValue().getGyozelemProperty());
		vereseg.setCellValueFactory(c -> c.getValue().getVeresegProperty());
	}

}
