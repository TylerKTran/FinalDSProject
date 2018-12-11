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

public class JaliscosMenuController {
	@FXML
	private Button backButton;
	@FXML
	private Button jaliscosAppetizers;
	@FXML
	private Button jaliscosEntrees;
	@FXML
	private Button jaliscosDrinks;
	@FXML
	private Button logOut;

	public JaliscosMenuController() {

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
	public void goToAppetizers() throws IOException {
		Stage firstStage = (Stage) jaliscosAppetizers.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "JaliscosAppetizers.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void goToEntrees() throws IOException {
		Stage firstStage = (Stage) jaliscosEntrees.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "JaliscosEntrees.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void goToDrinks() throws IOException {
		Stage firstStage = (Stage) jaliscosDrinks.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "JaliscosDrinks.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void logOut(ActionEvent event) throws IOException {
		Stage firstStage = (Stage) logOut.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "LoginPage.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}

}
