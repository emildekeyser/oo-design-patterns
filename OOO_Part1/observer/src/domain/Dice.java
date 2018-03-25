package domain;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import javafx.scene.control.Button;

public class Dice
{
	private ArrayList<Player> players;
	private int eyes;

	public Dice()
	{
		this.players = new ArrayList<>();
		this.eyes = 1;
	}
	
	public void registerPlayer(Player pl)
	{
		this.players.add(pl);
	}
	
	public void update(int eyes)
	{
		if (eyes > 0 && eyes <=6)
		{
			this.eyes = eyes;
		}
		
		for (Player pl : players)
		{
			pl.update(this);
		}
	}
	
	public int getEyes()
	{
		return this.eyes;
	}
	
	public void roll()
	{
		this.update(ThreadLocalRandom.current().nextInt(1, 6));
	}
}
