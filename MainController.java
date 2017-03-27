package login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainControler extends Application {

	@FXML
	private Label lblStatus;
	
	@FXML
	private TextField txtUserName;
	
	@FXML
	private PasswordField txtPassword;
	
	public void login(ActionEvent event) throws Exception
	{
		if(txtUserName.getText().equals("Mbugua") && txtPassword.getText().equals("4321"))
		{
			lblStatus.setText("Login Success");
			
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		else
		{
			lblStatus.setText("Login Failed");
		}
	}
	public static void main(String[] args)
	{
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		try
		{
			Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
