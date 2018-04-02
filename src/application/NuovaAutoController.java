package application;


import it.andrea.gestioneAuto.modello.Auto;
import it.andrea.gestioneAuto.modello.AutoModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class NuovaAutoController {

    @FXML
    private AnchorPane paneNuovaAuto;

    @FXML
    private Button btnSalva;
    
    @FXML
    private TextField txtTarga;

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtModello;
    AutoModel autoModel;
    @FXML
    void suSalva(ActionEvent event) {

    	Auto auto = new Auto(txtTarga.getText(),txtMarca.getText(),txtModello.getText());
    	autoModel.setAuto(auto);
    }
	public AutoModel getAutoModel() {
		return autoModel;
	}
	public void setAutoModel(AutoModel autoModel) {
		this.autoModel = autoModel;
	}
    
    
}