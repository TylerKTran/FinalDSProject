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
					System.out.println("yay");
				}
			}
		});
		username.setMinWidth(120);
        password.setMinWidth(120);
       
           FlowPane root = new FlowPane();
           root.setPadding(new Insets(10));
           root.getChildren().addAll(username,password,login);
           try {
               FXMLLoader loader = new FXMLLoader(getClass().getResource("FinalProject/src/LoginPage.fxml"));
               loader.setController(this);
               root = loader.load();
               root.getStylesheets().add("/application/application.css");
               primaryStage.setScene(new Scene(root));
           } catch (Exception e) {
               System.out.println(e);
           }
           primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
