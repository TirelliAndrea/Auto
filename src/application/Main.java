package application;

import it.andrea.gestioneAuto.modello.AutoModel;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("GestioneAuto.fxml"));
			BorderPane root = (BorderPane)loader.load();
			
			AutoModel am = new AutoModel();
			GestioneAutoController aContr = loader.getController();
			aContr.setAutoModel(am);
			aContr.setStage(primaryStage);
			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			aContr.setScene(scene);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

