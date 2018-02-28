package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class PlayerWindow extends Application
{
	private int playerId;
	
	@Override
	public void start(Stage primaryStage)
	{
		primaryStage.setTitle("Player");
		FlowPane root = new FlowPane();
		Scene scene = new Scene(root, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public PlayerWindow(int playerId)
	{
		this.playerId = playerId;
		launch();
	}
}
