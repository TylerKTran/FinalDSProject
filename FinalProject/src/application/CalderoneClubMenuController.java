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


	public class CalderoneClubMenuController {
		@FXML
		private Button backButton;
		@FXML
		private Button calderoneClubSoupsSalads;
		@FXML
		private Button calderoneClubAntipasta;
		@FXML
		private Button calderoneClubPasta;
		@FXML
		private Button calderoneClubDolci;
		@FXML
		private Button calderoneClubMeals;
		@FXML
		private Button calderoneClubPanini;
		
		public CalderoneClubMenuController() {

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
		public void goToStarters() throws IOException {
			Stage firstStage = (Stage) calderoneClubSoupsSalads.getScene().getWindow();
			firstStage.close();
			String fxmlResource = "CalderoneClubStarters.fxml";
			Parent panel;
			panel = FXMLLoader.load(getClass().getResource(fxmlResource));
			Scene scene = new Scene(panel);
			Stage stage = new Stage();
			stage.setTitle("RestaurantAdvisor");
			stage.setScene(scene);
			stage.show();
		}
		
		@FXML
		public void goToAntipasta() throws IOException {
			Stage firstStage = (Stage) calderoneClubAntipasta.getScene().getWindow();
			firstStage.close();
			String fxmlResource = "CalderoneClubAntipasta.fxml";
			Parent panel;
			panel = FXMLLoader.load(getClass().getResource(fxmlResource));
			Scene scene = new Scene(panel);
			Stage stage = new Stage();
			stage.setTitle("RestaurantAdvisor");
			stage.setScene(scene);
			stage.show();
		}
		
		@FXML
		public void goToPasta() throws IOException {
			Stage firstStage = (Stage) calderoneClubPasta.getScene().getWindow();
			firstStage.close();
			String fxmlResource = "CalderoneClubPasta.fxml";
			Parent panel;
			panel = FXMLLoader.load(getClass().getResource(fxmlResource));
			Scene scene = new Scene(panel);
			Stage stage = new Stage();
			stage.setTitle("RestaurantAdvisor");
			stage.setScene(scene);
			stage.show();
		}
		
		@FXML
		public void goToPanini() throws IOException {
			Stage firstStage = (Stage) calderoneClubPanini.getScene().getWindow();
			firstStage.close();
			String fxmlResource = "CalderoneClubPanini.fxml";
			Parent panel;
			panel = FXMLLoader.load(getClass().getResource(fxmlResource));
			Scene scene = new Scene(panel);
			Stage stage = new Stage();
			stage.setTitle("RestaurantAdvisor");
			stage.setScene(scene);
			stage.show();
		}
		
		@FXML
		public void goToMeals() throws IOException {
			Stage firstStage = (Stage) calderoneClubMeals.getScene().getWindow();
			firstStage.close();
			String fxmlResource = "CalderoneClubMeals.fxml";
			Parent panel;
			panel = FXMLLoader.load(getClass().getResource(fxmlResource));
			Scene scene = new Scene(panel);
			Stage stage = new Stage();
			stage.setTitle("RestaurantAdvisor");
			stage.setScene(scene);
			stage.show();
		}
		
		@FXML
		public void goToDolci() throws IOException {
			Stage firstStage = (Stage) calderoneClubDolci.getScene().getWindow();
			firstStage.close();
			String fxmlResource = "CalderoneClubDessert.fxml";
			Parent panel;
			panel = FXMLLoader.load(getClass().getResource(fxmlResource));
			Scene scene = new Scene(panel);
			Stage stage = new Stage();
			stage.setTitle("RestaurantAdvisor");
			stage.setScene(scene);
			stage.show();
		}

}
