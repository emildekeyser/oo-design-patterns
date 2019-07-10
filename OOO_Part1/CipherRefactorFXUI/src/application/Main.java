package application;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application
{	
	@Override
	public void start(Stage primaryStage)
	{
		new Controller(primaryStage);
		Stage s = new Stage();
		new Controller(s);
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}

