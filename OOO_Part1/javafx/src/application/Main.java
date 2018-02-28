package application;

import javafx.event.EventHandler;
import javafx.event.ActionEvent;
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
	private Codec factory;
	private ComboBox<String> cipherChooserComboBox;
	private Label cipherResult;
	private TextField plainTextInput;
	private Button encodeButton;			
	private FlowPane root;
	private Scene scene;
	
	@Override
	public void start(Stage primaryStage)
	{
		try
		{
			factory = new Codec();
			
			primaryStage.setTitle("encoder");
			
			cipherChooserComboBox = new ComboBox<>();
			cipherChooserComboBox.getItems().addAll(factory.get_ciphers());
			cipherResult = new Label();
			plainTextInput = new TextField();
			encodeButton = new Button("encode");
			encodeButton.setOnAction(new EncodeClickHandler<ActionEvent>());
			
			root = new FlowPane();
			root.setAlignment(Pos.BASELINE_CENTER);
			root.setVgap(20);
			root.setHgap(20);
			root.getChildren().add(cipherChooserComboBox);
			root.getChildren().add(plainTextInput);
			root.getChildren().add(encodeButton);
			root.getChildren().add(cipherResult);
			
			scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private class EncodeClickHandler<T> implements EventHandler<ActionEvent>
	{

		@Override
		public void handle(ActionEvent arg0)
		{
			plainTextInput.setText(factory.encode(cipherChooserComboBox.getValue(), plainTextInput.getText()));
		}
		
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}

