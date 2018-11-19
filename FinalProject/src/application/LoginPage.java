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

public class LoginPage extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
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
					System.out.println("yay");
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
