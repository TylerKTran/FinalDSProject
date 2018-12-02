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


public class Controller {
	@FXML
	private TextField username;
	@FXML
	private PasswordField password;
	@FXML
	private Account account = new Account();
	@FXML
	private Button login;
	@FXML
	private Text loginStatus;
	@FXML
	private Button writeReviewButton;
	@FXML
	private Button backButton;
	@FXML
	private TextField accountName;
	@FXML
	private TextField rating;
	@FXML
	private TextField restaurantName;
	@FXML
	private TextArea writtenReview;
	@FXML
	private Text reviewStatus;
	@FXML
	private Button submit;
	@FXML
	private Text restaurantTitle;
	@FXML
	private Button reviewButton1;
	@FXML
	private Button reviewButton2;
	@FXML
	private Button reviewButton3;
	@FXML
	private Button reviewButton4;
	@FXML
	private Button reviewButton5;
	@FXML
	private Button reviewButton6;
	@FXML
	private Button menuButton1;
	@FXML
	private Button menuButton2;
	@FXML
	private Button menuButton3;
	@FXML
	private Button menuButton4;
	@FXML
	private Button menuButton5;
	@FXML
	private Button menuButton6;
	
	public Controller() {

	}

	@FXML
	public void loginAttempt(ActionEvent event) throws IOException {
		int check1 = getUsername().compareTo(account.getUsername());
		int check2 = getPassword().compareTo(account.getPassword());
		if (check1 == 0 && check2 == 0) {
			Stage firstStage = (Stage) login.getScene().getWindow();
			firstStage.close();
			String fxmlResource = "HomePage.fxml";
			Parent panel;
			panel = FXMLLoader.load(getClass().getResource(fxmlResource));
			Scene scene = new Scene(panel);
			Stage stage = new Stage();
			stage.setTitle("RestaurantAdvisor");
			stage.setScene(scene);
			stage.show();
		} else {
			loginStatus.setText("Login Failed, Try Again");
		}

	}

	@FXML
	public String getUsername() {
		return username.getText();
	}

	@FXML
	public String getPassword() {
		return password.getText();
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
	public void goToMenu1() throws IOException {
		Stage firstStage = (Stage) menuButton1.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "BluesEggMenu.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void goToMenu2() throws IOException {
		Stage firstStage = (Stage) menuButton2.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "CafeBeneluxMenu.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void goToMenu3() throws IOException {
		Stage firstStage = (Stage) menuButton3.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "OddDuckMenu.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void goToMenu4() throws IOException {
		Stage firstStage = (Stage) menuButton4.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "CalderoneClubMenu.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void goToMenu5() throws IOException {
		Stage firstStage = (Stage) menuButton5.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "OaklandGyrosMenu.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void goToMenu6() throws IOException {
		Stage firstStage = (Stage) menuButton6.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "JaliscosOnNorthMenu.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void goToReviews1() throws IOException {
		Stage firstStage = (Stage) reviewButton1.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "BluesEggReview.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void goToReviews2() throws IOException {
		Stage firstStage = (Stage) reviewButton2.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "CafeBeneluxReview.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void goToReviews3() throws IOException {
		Stage firstStage = (Stage) reviewButton3.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "OddDuckReview.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void goToReviews4() throws IOException {
		Stage firstStage = (Stage) reviewButton4.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "CalderoneClubReview.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void goToReviews5() throws IOException {
		Stage firstStage = (Stage) reviewButton5.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "OaklandGyrosReview.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void goToReviews6() throws IOException {
		Stage firstStage = (Stage) reviewButton6.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "JaliscosOnNorthReview.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void writeReview() throws IOException {
		Stage firstStage = (Stage) writeReviewButton.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "ReviewPage.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void submitReview() throws IOException {
		if (!(accountName.getText().toString().equals("ACCOUNT"))) {
			reviewStatus.setText("Invalid Account Name, Try Again");
			return;
		}
		if (!(rating.getText().equals("1")) && !(rating.getText().equals("2")) && !(rating.getText().equals("3"))
				&& !(rating.getText().equals("4")) && !(rating.getText().equals("5"))) {
			reviewStatus.setText("Invalid Rating Value, Try Again");
			return;
		}
		if (!(restaurantName.getText().equals("Blue's Egg")) && !(restaurantName.getText().equals("Cafe Benelux"))
				&& !(restaurantName.getText().equals("Odd Duck"))
				&& !(restaurantName.getText().equals("Calderone Club"))
				&& !(restaurantName.getText().equals("Oakland Gyros"))
				&& !(restaurantName.getText().equals("Jalisco's On North"))) {
			reviewStatus.setText("Invalid Restaurant Name, Try Again");
			return;
		}
		String review = writtenReview.getText();
		int temp = 0;
		for (int i = 0; i < review.length(); i++) {
			temp++;
		}
		if (temp <= 0 || temp > 250) {
			reviewStatus.setText("Invalid Review Length, Try Again");
			return;
		}
		Stage firstStage = (Stage) submit.getScene().getWindow();
		firstStage.close();
		String fxmlResource = "Submitted.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		Stage stage = new Stage();
		stage.setTitle("RestaurantAdvisor");
		stage.setScene(scene);
		stage.show();
	}

}
