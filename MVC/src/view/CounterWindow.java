package view;

import java.util.Observable;
import java.util.Observer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class CounterWindow implements Observer
{
	private Label numberLabel;
	private TextField numberTextField;
	private Button setNumberButton;
	private Button decreaseNumberButton;
	private Button increaseNumberButton;
	private Label outputLabel;
	private Label numberOutputLabel;
	private FlowPane rootPane;

	public CounterWindow(Stage primaryStage)
	{
		initializeComponents();
		layoutComponents();
		Scene mainScene = new Scene(rootPane, 220, 120);
		primaryStage.setScene(mainScene);
		primaryStage.setTitle("MVC");
		primaryStage.show();
	}

	private void initializeComponents()
	{
		numberLabel = new Label("Enter number: ");
		numberTextField = new TextField();
		setNumberButton = new Button("Set");
		decreaseNumberButton = new Button("Down");
		increaseNumberButton = new Button("Up");
		outputLabel = new Label("Current number: ");
		numberOutputLabel = new Label();
		rootPane = new FlowPane();
	}

	private void layoutComponents()
	{
		rootPane.setPadding(new Insets(30, 5, 5, 5));
		rootPane.setVgap(5);
		rootPane.setHgap(5);
		rootPane.setAlignment(Pos.BASELINE_CENTER);
		rootPane.getChildren().add(numberLabel);
		rootPane.getChildren().add(numberTextField);
		rootPane.getChildren().add(setNumberButton);
		rootPane.getChildren().add(decreaseNumberButton);
		rootPane.getChildren().add(increaseNumberButton);
		rootPane.getChildren().add(outputLabel);
		rootPane.getChildren().add(numberOutputLabel);
	}
	
	public void setHandler(EventHandler<ActionEvent> handler)
	{
		setNumberButton.setOnAction(handler);
		increaseNumberButton.setOnAction(handler);
		decreaseNumberButton.setOnAction(handler);
	}

	@Override
	public void update(Observable counter, Object intValue)
	{
//		String currentValueAsString = Integer.toString(value);
//		numberOutputLabel.setText(currentValueAsString);
		numberOutputLabel.setText(intValue.toString());
	}

	public Button getSetNumberButton()
	{
		return this.setNumberButton;
	}
	
	public Button getIncreaseNumberButton()
	{
		return this.increaseNumberButton;
	}
	
	public Button getDecreaseNumberButton()
	{
		return this.decreaseNumberButton;
	}

	public String getNumberText()
	{
		return this.numberTextField.getText();
	}
}
