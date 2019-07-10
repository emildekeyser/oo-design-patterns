package controller;

import view.View;
import domain.Converter;

public abstract class ControllerCommon {

	private View view;
	private Converter model;
	
	public ControllerCommon(View view, Converter model) throws ControllerException{
		setView(view);
		setModel(model);
	}
	

	protected Converter getModel() {
		return model;
	}


	private void setModel(Converter model) throws ControllerException {
		if(model == null){
			throw new ControllerException("Invalid Model");
		}
		this.model = model;
	}


	protected View getView() {
		return view;
	}


	private void setView(View view) throws ControllerException{
		if(view == null){
			throw new ControllerException("Invalid View");
		}
		this.view = view;
	}

}
