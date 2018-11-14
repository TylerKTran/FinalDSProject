package application;

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

public class LoginPage extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		TextField username = new TextField("Username");
		PasswordField password = new PasswordField();
		Account account = new Account();
		Button login = new Button("Login");
		login.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				int check1 = account.getUsername().compareTo(username.getCharacters().toString());
				int check2 = account.getPassword().compareTo(password.getCharacters().toString());
				if (check1 == 0 && check2 == 0) {
					
				}
			}
		});}
	public static void main(String[] args) {
		launch(args);
	}

}
