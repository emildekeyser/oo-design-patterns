package controller.keylistener;

import controller.ControllerCommon;
import controller.ControllerException;
import domain.Converter;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import view.View;

public class EnterListener extends ControllerCommon implements EventHandler<KeyEvent> {

	public EnterListener(View view, Converter model) throws ControllerException {
		super(view, model);
	}

	@Override
	public void handle(KeyEvent event) {

		if (event.getCode().equals(KeyCode.ENTER)) {
			int decimal = getView().getDecimal();
			getModel().setDecimal(decimal);
			getView().resetDecimal();
		}
	}

}
