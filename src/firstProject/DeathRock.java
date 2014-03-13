package firstProject;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;

public class DeathRock extends Rock
{
	public void act()
	{
		if (getGrid() == null)
			return;
		ArrayList<Actor> actors = getActors();
		processActors(actors);

	}

	public ArrayList<Actor> getActors()
	{
		return getGrid().getNeighbors(getLocation());
	}

	public void processActors(ArrayList<Actor> actors)
	{

		for (Actor deadBug : actors)
		{

			deadBug.removeSelfFromGrid();

		}
	}
}
