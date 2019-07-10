package application;

import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class Controller implements EventHandler<ActionEvent>
{
	private CodecWindow window;
	private Codec codec;
	
	public Controller(Stage primaryStage)
	{
		this.codec = new Codec();
		this.window = new CodecWindow(this, primaryStage);
		this.window.setCodecOptions(this.codec.get_ciphers());
	}
	
	@Override
	public void handle(ActionEvent ae)
	{
		this.window.setText(codec.encode(this.window.getCipher(), this.window.getText()));
	}
}
