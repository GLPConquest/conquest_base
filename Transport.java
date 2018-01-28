package units;

import java.util.ArrayList;
import datas.Resources;
import datas.Stats;
import datas.Position;

/*
* This class is used to build the Transport unit, a ship what's aim is to make ground unit travel through the sea
* It has its own stats, position, faction, movement, range and Cost
* The environment it can go through is defined in the parent class
* Transport units can not attack
*/
public class Transport extends Naval{
	
	/*
	* Stats definition
	*/
	private static final int MAX_HEALTH_POINTS = 100;
	private static final float MOVEMENT = 4;
	private static final int RANGE = 0;
	private static final int ATTACK = 0;
	private static final int DEFENSE = 5;
	
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
	public Transport(Stats stats, float maxHealth, float currentHealth, Position position, int faction, float movement, int range, Resources upkeep) {
		super(stats, maxHealth, maxHealth, position, faction, movement, range, cost, upkeep);
	}
	
	/*
	* Default constructor
	*/
	public Transport(Position position, int faction) {
		this(new Stats(MAX_HEALTH_POINT,ATTACK,DEFENSE), (float)MAX_HEALT_POINTS, (float)MAX_HEALT_POINTS, position, faction, MOVEMENT, RANGE, new Resources(MONEY_UPKEEP,FOOD_UPKEEP,OIL_UPKEEP,ELECTRICTY_UPKEEP));
	}
}
