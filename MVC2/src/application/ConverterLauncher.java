package application;

import controller.Controller;
import controller.ControllerException;
import controller.ConverterController;
import controller.keylistener.AllListener;
import domain.Converter;
import domain.DecimalHexConverter;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import view.ConverterPanel;
import view.ConverterView;
import view.View;

public class ConverterLauncher extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		ConverterPanel root = new ConverterPanel();
		View view = new ConverterView("Converter", primaryStage, root);

		// TODO Switch Converter Strategies... What changes?
		Converter model;
		// model = new DecimalBinaryConverter();
		model = new DecimalHexConverter();
		model.addObserver(view);

		Controller controller;
		EventHandler<KeyEvent> keyListener;
		try {
			// TODO Switch Listener Strategies... What changes?
			// keyListener = new EnterListener(view, model);
			keyListener = new AllListener(view, model);
			view.addKeyListener(keyListener);

			controller = new ConverterController(view, model);
			controller.startView();
		} catch (ControllerException e) {
			System.out.println(e.getMessage());
		}
	}
}
