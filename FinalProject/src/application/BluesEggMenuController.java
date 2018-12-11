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


	public class BluesEggMenuController {
		@FXML
		private Button backButton;
		@FXML
		private Button bluesEggBreakfast;
		@FXML
		private Button bluesEggBrunch;
		@FXML
		private Button bluesEggSides;
		@FXML
		private Button bluesEggNoon;
		@FXML
		private Button bluesEggDrinks;
		@FXML
		private Button bluesEggSpecial;
		@FXML
		private Button logOut;
		
		public BluesEggMenuController() {

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
		public void goToBreakfast() throws IOException {
			Stage firstStage = (Stage) bluesEggBreakfast.getScene().getWindow();
			firstStage.close();
			String fxmlResource = "BluesEggBreakfast.fxml";
			Parent panel;
			panel = FXMLLoader.load(getClass().getResource(fxmlResource));
			Scene scene = new Scene(panel);
			Stage stage = new Stage();
			stage.setTitle("RestaurantAdvisor");
			stage.setScene(scene);
			stage.show();
		}
		
		@FXML
		public void goToBrunch() throws IOException {
			Stage firstStage = (Stage) bluesEggBrunch.getScene().getWindow();
			firstStage.close();
			String fxmlResource = "bluesEggBrunch.fxml";
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
			Stage firstStage = (Stage) bluesEggSides.getScene().getWindow();
			firstStage.close();
			String fxmlResource = "BluesEggSides.fxml";
			Parent panel;
			panel = FXMLLoader.load(getClass().getResource(fxmlResource));
			Scene scene = new Scene(panel);
			Stage stage = new Stage();
			stage.setTitle("RestaurantAdvisor");
			stage.setScene(scene);
			stage.show();
		}
		
		@FXML
		public void goToSpecials() throws IOException {
			Stage firstStage = (Stage) bluesEggSpecial.getScene().getWindow();
			firstStage.close();
			String fxmlResource = "BluesEggDrinks.fxml";
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
			Stage firstStage = (Stage) bluesEggDrinks.getScene().getWindow();
			firstStage.close();
			String fxmlResource = "BluesEggSpecial.fxml";
			Parent panel;
			panel = FXMLLoader.load(getClass().getResource(fxmlResource));
			Scene scene = new Scene(panel);
			Stage stage = new Stage();
			stage.setTitle("RestaurantAdvisor");
			stage.setScene(scene);
			stage.show();
		}
		
		@FXML
		public void goToLunch() throws IOException {
			Stage firstStage = (Stage) bluesEggNoon.getScene().getWindow();
			firstStage.close();
			String fxmlResource = "BluesEggLunch.fxml";
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
