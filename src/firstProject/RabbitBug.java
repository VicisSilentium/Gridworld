package firstProject;

import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class RabbitBug extends Bug
{
	public void move()
	{

		int red = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		this.setColor(new Color(red, green, blue));

		Grid<Actor> myGrid = getGrid();
		if (myGrid == null)
		{
			return;
		}
		Location currentLocation = getLocation();
		Location nextLocation = currentLocation
				.getAdjacentLocation(getDirection());
		if (myGrid.isValid(nextLocation))
		{
			moveTo(nextLocation);
		}
		else
		{
			removeSelfFromGrid();
		}

		RabbitBug currentBug = new RabbitBug();
		currentBug.putSelfInGrid(myGrid, currentLocation);

	}
}
