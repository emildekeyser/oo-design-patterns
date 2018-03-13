package domain;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import javafx.scene.control.Button;

public class Dice
{
	private ArrayList<Button> buttons;
	private int eyes;

	public Dice()
	{
		this.buttons = new ArrayList<>();
	}
	
	public void registerPlayer(Button btn)
	{
		this.buttons.add(btn);
	}
	
	public void update(int eyes)
	{
		if (eyes > 0 && eyes <=6)
		{
			this.eyes = eyes;
		}
		
		for (Button btn : buttons)
		{
			btn.setText(Integer.toString(eyes));
		}
	}
	
	public void roll()
	{
		this.update(ThreadLocalRandom.current().nextInt(1, 6));
	}
}
