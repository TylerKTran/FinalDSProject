package application;
import java.util.ArrayList;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.layout.VBox;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TextArea;
import javafx.scene.Node;


public class OaklandGyrosMenuController {
	@FXML
	private Button backButton;
	@FXML
	private Button oaklandGyrosSoupsSalads;
	@FXML
	private Button oaklandGyrosSandwiches;
	@FXML
	private Button oaklandGyrosPlatters;
	@FXML
	private Button oaklandGyrosSides;
	@FXML
	private Button oaklandGyrosDesserts;
	
	public OaklandGyrosMenuController() {

	}

	@FXML
	public void goHome() throws IOException {
		Stage firstStage = (Stage) backButton.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "HomePage.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void goToSoupSalad() throws IOException {
		Stage firstStage = (Stage) oaklandGyrosSoupsSalads.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "OaklandGyrosSoupSalad.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void goToSandwich() throws IOException {
		Stage firstStage = (Stage) oaklandGyrosSandwiches.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "OaklandGyrosSandwiches.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void goToPlatters() throws IOException {
		Stage firstStage = (Stage) oaklandGyrosPlatters.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "OaklandGyrosPlatters.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void goToSides() throws IOException {
		Stage firstStage = (Stage) oaklandGyrosSides.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "OaklandGyrosSides.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void goToDesserts() throws IOException {
		Stage firstStage = (Stage) oaklandGyrosDesserts.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "OaklandGyrosDesserts.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}

}
