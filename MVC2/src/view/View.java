package view;

import java.util.Observer;

import controller.Controller;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public interface View extends Observer{
	public void setController(Controller controller);
	public void addKeyListener(EventHandler<KeyEvent> keyListener);
	
	public void start();	
	public int getDecimal();
	public void resetDecimal();
}
