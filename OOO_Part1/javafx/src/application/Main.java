package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class Main extends Application
{	
	@Override
	public void start(Stage primaryStage)
	{
		try
		{
			CipherFactory factory = new CipherFactory();
			
			primaryStage.setTitle("encoder");
			
			ComboBox<String> cipherChooserComboBox = new ComboBox<>();
			cipherChooserComboBox.getItems().addAll(factory.get_ciphers());
			Label cipherResult = new Label();
			TextField plainTextInput = new TextField();
			Button encodeButton = new Button("encode");
			// setNumberButton.setOnAction(			
			
			FlowPane root = new FlowPane();
			root.setAlignment(Pos.BASELINE_CENTER);
			root.setVgap(20);
			root.setHgap(20);
			root.getChildren().add(cipherChooserComboBox);
			root.getChildren().add(plainTextInput);
			root.getChildren().add(encodeButton);
			root.getChildren().add(cipherResult);
			
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}

