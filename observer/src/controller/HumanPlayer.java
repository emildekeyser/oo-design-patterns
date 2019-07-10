package controller;

import domain.Dice;
import domain.Player;
import javafx.scene.control.Button;

public class HumanPlayer implements Player
{

	private Button output;

	public HumanPlayer(Button output)
	{
		this.output = output;
	}



	@Override
	public void update(Dice dice)
	{
		this.output.setText(String.valueOf(dice.getEyes()));
	}

}
