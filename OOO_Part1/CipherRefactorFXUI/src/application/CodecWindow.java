package application;

import java.util.Set;

import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class CodecWindow
{	
	private ComboBox<String> cipherChooserComboBox;
	private Label cipherResult;
	private TextField plainTextInput;
	private Button encodeButton;			
	private FlowPane root;
	private Scene scene;
	
	public CodecWindow(Controller controller, Stage primaryStage)
	{
		primaryStage.setTitle("encoder");
		
		cipherChooserComboBox = new ComboBox<>();
		cipherResult = new Label();
		plainTextInput = new TextField();
		encodeButton = new Button("encode");
		encodeButton.setOnAction(controller);
		
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

	public void setCodecOptions(Set<String> ciphers)
	{
		cipherChooserComboBox.getItems().addAll(ciphers);
	}
	
	public void setText(String txt)
	{
		this.cipherResult.setText(txt);
	}
	
	public String getText()
	{
		return this.plainTextInput.getText();
	}
	
	public String getCipher()
	{
		return this.cipherChooserComboBox.getValue();
	}

}

