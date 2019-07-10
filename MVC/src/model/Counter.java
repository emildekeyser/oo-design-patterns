package model;

import java.util.Observable;

public class Counter extends Observable
{

	private int value;
	
	public Counter()
	{
		this.value = 0;
	}

	public void setNumber(int value)
	{
		this.value = value;
		this.setChanged();
		this.notifyObservers(this.value);
	}

	public void increment()
	{
		this.value++;
		this.setChanged();
		this.notifyObservers(this.value);
	}

	public void decrement()
	{
		this.value--;
		this.setChanged();
		this.notifyObservers(this.value);
	}
	
	public int getValue()
	{
		return this.value;
	}
}
