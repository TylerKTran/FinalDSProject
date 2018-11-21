package application;

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
import javafx.scene.Node;

public class Controller {
	@FXML
	private TextField username;
	@FXML
	private PasswordField password;
	@FXML
	private Account account = new Account();;
	@FXML
	private Button login;

	public Controller() {

	}

	@FXML
	public void loginAttempt(ActionEvent event) throws Exception {
		try {
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
				login.setText("FAILED");
			}
		} catch (Exception e) {
			System.out.println(e);
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
}
