package units;

import java.util.ArrayList;
import datas.Resources;
import datas.Stats;
import datas.Position;

/*
* This class is used to build the Battleship unit, an expensive ranged armored ship
* It has its own stats, position, faction, movement, range and Cost
* The environment it can go through is defined in the parent class
* Unlike ground units, there is no bonus applied in a naval fight
*/
public class Battleship extends Naval{
	
	/*
	* Stats definition
	*/
	private static final int MAX_HEALTH_POINTS = 100;
	private static final float MOVEMENT = 3;
	private static final int RANGE = 3;
	private static final int ATTACK = 10;
	private static final int DEFENSE = 6;
	
	/*
	* Cost definition
	*/
	private static final int MONEY_UPKEEP = 0;
	private static final int FOOD_UPKEEP = 0;
	private static final int OIL_UPKEEP = 0;
	private static final int ELECTRICTY_UPKEEP = 0;
	
	/*
	* Custom constructor
	*/
	public Battleship(Stats stats, Position position, int faction, float movement, int range, Resources upkeep) {
		super(stats, position, faction, movement, range, cost, upkeep);
	}
	
	/*
	* Default constructor
	*/
	public Battleship(Position position, int faction) {
		this(new Stats(MAX_HEALTH_POINT,ATTACK,DEFENSE),position,faction,MOVEMENT,RANGE,new Resources(MONEY_UPKEEP,FOOD_UPKEEP,OIL_UPKEEP,ELECTRICTY_UPKEEP));
	}
}
