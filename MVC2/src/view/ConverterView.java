package view;

import java.util.Observable;

import controller.Controller;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class ConverterView extends Stage implements View {
	private Controller controller;
	
	private ConverterPanel converterPanel;
	private Stage stage;
	
	public ConverterView(String name, Stage stage, ConverterPanel pane){
		setStage(stage);
		setConverterPanel(pane);
		
        Scene mainScene = new Scene(pane, 400, 30);
        getStage().setTitle(name);
        getStage().setScene(mainScene);
        sizeToScene();
	}

	private Stage getStage() {
		return this.stage;
	}

	private void setStage(Stage stage) {
		this.stage = stage;
	}

	private void setConverterPanel(ConverterPanel pane) {
		this.converterPanel = pane;
	}

	private ConverterPanel getConverterPanel() {
		return converterPanel;
	}	

	private Controller getController() {
		return controller;
	}

	@Override
	public void setController(Controller controller) {
		this.controller = controller;
	}

	@Override
	public void start() {
		getStage().show();		
	}

	@Override
	public void update(Observable o, Object arg) {
		getConverterPanel().setBinary(getController().getResultaat());		
	}

	@Override
	public int getDecimal(){
		return getConverterPanel().getDecimal();
	}
	
	@Override
	public void addKeyListener(EventHandler<KeyEvent> keyListener){
		getConverterPanel().addKeyListener(keyListener);
	}
	
	@Override
	public void resetDecimal(){
		getConverterPanel().resetDecimal();
	}
}
