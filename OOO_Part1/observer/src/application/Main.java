package application;

import controller.HumanPlayer;
import domain.Dice;
import domain.Player;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application
{
	Dice die;
	
	@Override
	public void start(Stage primaryStage)
	{
		die = new Dice();
		try
		{	
			makePlayerWindow(1, primaryStage);
			makePlayerWindow(2, new Stage());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private void makePlayerWindow(int index, Stage primaryStage)
	{
		Button rollButton = new Button("Roll");
		makeHandler(rollButton);
		Player p = new HumanPlayer(rollButton);
		this.die.registerPlayer(p);
		
		FlowPane root = new FlowPane();
		root.setAlignment(Pos.CENTER);
		root.getChildren().add(rollButton);
		Scene scene = new Scene(root, 200, 200);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setTitle("Player " + index);
		primaryStage.setScene(scene);
		primaryStage.setX(index * 400);
		primaryStage.setY(400);
		primaryStage.show();
	}

	private void makeHandler(Button rollButton)
	{
		rollButton.setOnMouseClicked(new EventHandler<Event>()
		{
			@Override
			public void handle(Event event)
			{
				die.roll();
			}
		});
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}
