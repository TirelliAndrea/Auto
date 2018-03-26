package application;

import java.io.IOException;

import it.andrea.gestioneAuto.modello.Auto;
import it.andrea.gestioneAuto.modello.AutoModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

	


	public class GestioneAutoController {

		AutoModel autoModel;
		Stage stage;
		Scene scene;
		
		
	    @FXML
	    private MenuItem mnuNuovaAuto;
	    @FXML
	    private MenuItem mnuVisualizza;
	    @FXML
	    private TableView <Auto> tbl ;
	    @FXML
	    private TableColumn<Auto, String> colTarga ;
	    @FXML
	    private TableColumn<Auto, String> colMarca;
	    @FXML
	    private TableColumn<Auto, String> colModello;
	    @FXML
	    private TableColumn<Auto, Integer> colAnnoImmatricolazione;
	    @FXML
	    private TableColumn<Auto, Integer> colPotenzaKW;
	    
	
	    
	    @FXML
	    public void suNuovaAuto(ActionEvent event) {

	    	this.apriFormNuovaAuto();
	    }

	    @FXML
	    void suVisualizza(ActionEvent event) {
	    	this.caricaTabella();
	    }
		
	    public void setAutoModel(AutoModel autoModel) {
	  		this.autoModel = autoModel;
	  	}
	    
	    public void setStage(Stage stage) {
	  		this.stage = stage;
	  	}
	    public void setScene(Scene scene) {
	  		this.scene = scene;
	  	}
	    
	    //metodi privati
	    
	    private void apriFormNuovaAuto(){
	    	//Carico il form nuovo da aggiundere al form vecchio
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("NuovaAuto.fxml"));
			try {
				AnchorPane root = (AnchorPane)loader.load();
				//aggiungo due proprieta Stage e scene e mi faccio passare i valori dal maetodo main che li ha creati
				
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				
				//creo una variabile locale pane con lo stesso contenitore del metodo main e gli assegno il contenitore dal metodo main
				BorderPane pan = (BorderPane) scene.getRoot();
				//aggiungo il nodo root che ho caricato all'inizio
				pan.setBottom(root);
				//aggiungo la scena allo stage che mi ha passato il metodo main
				stage.setScene(scene);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    }
	
	    private void caricaTabella(){
	    
	    	autoModel.setAuto(new Auto("AF631AK","Fiat","Punto"));
	    	autoModel.setAuto(new Auto("DP862RG","Seat","Ibiza"));
	    	
	    	//creo un observable list
	    	ObservableList<Auto> lst = FXCollections.observableArrayList(autoModel.getLstAuto());
			
			//creo le colonne 
	
	    	tbl.getColumns().clear();
	    	
	    	colTarga = new TableColumn<>("Targa");
	    	colMarca = new TableColumn<>("Marca");
	    	colModello = new TableColumn<>("Modello");
	    	colAnnoImmatricolazione = new TableColumn<>("Anno Immatricolazione");
	    	colPotenzaKW = new TableColumn<>("Potenza KW");
	    	
	    	//setto le proprieta delle colonne
	    	
	    	colTarga.setCellValueFactory(new PropertyValueFactory<>("targa"));
	    	colMarca.setCellValueFactory(new PropertyValueFactory<>("marca"));
	    	colModello.setCellValueFactory(new PropertyValueFactory<>("Modello"));
	    	colAnnoImmatricolazione.setCellValueFactory(new PropertyValueFactory<>("annoImmatricolazione"));
	    	colPotenzaKW.setCellValueFactory(new PropertyValueFactory<>("potenzaKW"));
	    	
	    	//aggiungo le colonne
	    	
	    	tbl.getColumns().addAll(colTarga,colMarca,colModello,colPotenzaKW,colAnnoImmatricolazione);
	    	
	    	//riempo i dati con i valori della obsevableList
	    	tbl.setItems(lst);
	    }
	
	}


    
    
