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


public class OddDuckMenuController {
	@FXML
	private Button backButton;
	@FXML
	private Button oddDuckMenu;
	@FXML
	private Button oddDuckGlass;
	@FXML
	private Button oddDuckBottle;
	@FXML
	private Button oddDuckCocktails;
	@FXML
	private Button oddDuckBeer;
	@FXML
	private Button logOut;
	
	public OddDuckMenuController() {

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
	public void goToMenu() throws IOException {
		Stage firstStage = (Stage) oddDuckMenu.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "OddDuckFoodMenu.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void goToGlass() throws IOException {
		Stage firstStage = (Stage) oddDuckGlass.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "OddDuckGlass.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void goToBottle() throws IOException {
		Stage firstStage = (Stage) oddDuckBottle.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "OddDuckBottle.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void goToCocktails() throws IOException {
		Stage firstStage = (Stage) oddDuckCocktails.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "OddDuckCocktails.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void goToBeer() throws IOException {
		Stage firstStage = (Stage) oddDuckBeer.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "OddDuckBeer.fxml";
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
