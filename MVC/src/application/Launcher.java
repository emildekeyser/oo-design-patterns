package application;

import controller.ButtonHandler;
import javafx.application.Application;
import javafx.stage.Stage;
import model.Counter;
import view.CounterWindow;

public class Launcher extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage)
	{
		Counter counter = new Counter();
		ButtonHandler handler = new ButtonHandler();
		CounterWindow window = new CounterWindow(primaryStage);
		
		handler.setWindow(window);
		handler.setCounter(counter);
		
		window.setHandler(handler);
		counter.addObserver(window);
	}
}