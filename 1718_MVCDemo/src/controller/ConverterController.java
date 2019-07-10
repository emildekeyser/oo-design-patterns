package controller;

import domain.Converter;
import view.View;

public class ConverterController extends ControllerCommon implements Controller {
	
	public ConverterController(View view, Converter model) throws ControllerException{
		super(view, model);
		getView().setController(this);
	}	

	@Override
	public void startView() {
		getView().start();

	}

	@Override
	public String getResultaat() {
		return getModel().getResult();
	}

}
