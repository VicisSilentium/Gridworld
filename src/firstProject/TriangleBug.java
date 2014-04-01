package firstProject;

import info.gridworld.actor.Bug;

public class TriangleBug extends Bug
{
	private int steps;
	private int sideLength;
	private int turns;
	
	public TriangleBug(int length)
	{
		steps = 0;
		sideLength = length;
		turns = 0;
	}


	public void act()
	{
		if (steps < sideLength && canMove())
		{
			move();
			steps++;
		}
		else if (turns < 2)
		{
			turn();
			turn();
			turn();
			steps = 0;
			turns ++;
		}
		else
		{
			turn();
			turn();
			steps = 0;
			turns = 0;

		}
		
	}
}
