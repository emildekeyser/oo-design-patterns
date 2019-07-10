package controller.keylistener;

import controller.ControllerCommon;
import controller.ControllerException;
import domain.Converter;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import view.View;

public class AllListener extends ControllerCommon implements EventHandler<KeyEvent> {

	public AllListener(View view, Converter model) throws ControllerException {
		super(view, model);
	}

	@Override
	public void handle(KeyEvent event) {
		int decimal = getView().getDecimal();
		getModel().setDecimal(decimal);
	}

}
