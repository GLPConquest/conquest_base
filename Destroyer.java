package units;

import java.util.ArrayList;
import datas.Resources;
import datas.Stats;
import datas.Position;

/*
* This class is used to build the Destroyer unit, a cheap ranged offensive ship
* It has its own stats, position, faction, movement, range and Cost
* The environment it can go through is defined in the parent class
* Unlike ground units, there is no bonus applied in a naval fight
*/
public class Destroyer extends Naval {
	
	/*
	* Stats definition
	*/
	private static final MAX_HEALTH_POINTS = 100;
	private static final MOVEMENT = 3;
	private static final RANGE = 3;
	private static final ATTACK = 10;
	private static final DEFENSE = 4;
	
	/*
	* Cost definition
	*/
	private static final int MONEY_UPKEEP = 0;
	private static final int FOOD_UPKEEP = 0;
	private static final int OIL_UPKEEP = 0;
	private static final int ELECTRICITY_UPKEEP = 0;
	
	/*
	* Custom constructor
	*/
	public Destroyer(Stats stats, Position position, int faction, float movement, int range, Resources upkeep) {
		super(stats, position, faction, movement, range, cost, upkeep);
	}
	
	/*
	* Default constructor
	*/
	public Destroyer(Position position, int faction) {
		this(new Stats(MAX_HEALTH_POINTS, ATTACK, DEFENSE), position, faction, MOVEMENT, RANGE, new Ressources(MONEY_UPKEEP, FOOD_UPKEEP, OIL_UPKEEP, ELECTRICITY_UPKEEP));
	}
	
}
