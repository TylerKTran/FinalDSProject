package application;

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

public class LoginPage extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
		TextField username = new TextField();
		PasswordField password = new PasswordField();
		Account account = new Account();
		Button login = new Button("Login");
		login.setOnAction(new EventHandler<ActionEvent>() {

			@FXML
			public void handle(ActionEvent event) {
				int check1 = account.getUsername().compareTo(username.getCharacters().toString());
				int check2 = account.getPassword().compareTo(password.getCharacters().toString());
				if (check1 == 0 && check2 == 0) {
					Parent next;
					try {
						next = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
						Scene scene = new Scene(next);
						Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
						window.setScene(scene);
						window.show();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		String fxmlResource = "LoginPage2.fxml";
		Parent panel;
		panel = FXMLLoader.load(getClass().getResource(fxmlResource));
		Scene scene = new Scene(panel);
		primaryStage.setTitle("RestaurantAdvisor");
		primaryStage.setScene(scene);
		primaryStage.setHeight(400);
		primaryStage.setWidth(600);
		primaryStage.show();
		} catch (Exception e) {
            System.out.println(e);
        }
	}

	public static void main(String[] args) {
		launch(args);
	}

}
