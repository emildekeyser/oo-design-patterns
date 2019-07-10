package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.Counter;
import view.CounterWindow;

public class ButtonHandler implements EventHandler<ActionEvent>
{
	private Counter counter;
	private CounterWindow window;
	
	@Override
	public void handle(ActionEvent event)
	{
		if (event.getSource().equals(this.window.getSetNumberButton()))
		{
			int value = 0;
			try
			{
				value = Integer.parseInt(this.window.getNumberText());
			}
			catch (Exception e){}
			
			this.counter.setNumber(value);
		}
		else if (event.getSource().equals(this.window.getIncreaseNumberButton()))
		{
			this.counter.increment();
		}
		else if (event.getSource().equals(this.window.getDecreaseNumberButton()))
		{
			this.counter.decrement();
		}
	}

	public void setWindow(CounterWindow window)
	{
		this.window = window;		
	}

	public void setCounter(Counter counter)
	{
		this.counter = counter;
	}
}
