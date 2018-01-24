package units;

import java.util.ArrayList;
import datas.Resources;
import datas.Stats;
import datas.Position;

public class Battleship extends Naval{
	private static final int MAX_HEALTH_POINTS = 100;
	private static final float MOVEMENT = 3;
	private static final int RANGE = 3;
	private static final int ATTACK = 10;
	private static final int DEFENSE = 6;
	
	private static final int MONEY_UPKEEP = 0;
	private static final int FOOD_UPKEEP = 0;
	private static final int OIL_UPKEEP = 0;
	private static final int ELECTRICTY_UPKEEP = 0;
	
	public Battleship(Stats stats, Position position, int faction, float movement, int range, Resources upkeep) {
		super(stats, position, faction, movement, range, cost, upkeep);
	}
	
	
	public Battleship(Position position, int faction) {
		this(new Stats(MAX_HEALTH_POINT,ATTACK,DEFENSE),position,faction,MOVEMENT,RANGE,new Resources(MONEY_UPKEEP,FOOD_UPKEEP,OIL_UPKEEP,ELECTRICTY_UPKEEP));
	}
}
