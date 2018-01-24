package units;

import java.util.ArrayList;
import datas.Resources;

public class Battleship extends Naval{
	public static final int MAX_HEALTH_POINTS = 100;
	public static final float MOVEMENT = 3;
	public static final int RANGE = 3;
	public static final int ATTACK = 10;
	public static final int DEFENSE = 6;
	
	public static final int MONEY_UPKEEP = 0;
	public static final int FOOD_UPKEEP = 0;
	public static final int OIL_UPKEEP = 0;
	public static final int ELECTRICTY_UPKEEP = 0;
	
	public Battleship(Stats stats, Position position, int faction, float movement, int range, Resources upkeep, ArrayList<String> crossable) {
		super(stats, position, faction, movement, range, cost, upkeep, crossable);
	}
	
	
	public Battleship(Position position, int faction, ArrayList<String> crossable) {
		this(new Stats(MAX_HEALTH_POINT,ATTACK,DEFENSE),position,faction,MOVEMENT,RANGE,new Resources(MONEY_UPKEEP,FOOD_UPKEEP,OIL_UPKEEP,ELECTRICTY_UPKEEP),crossable);
	}
}
