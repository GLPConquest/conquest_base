package units;

import java.util.ArrayList;
import datas.Resources;
import datas.Stats;
import datas.Position;

public class Destroyer extends Naval {
	
	private static final MAX_HEALTH_POINTS = 100;
	private static final MOVEMENT = 3;
	private static final RANGE = 1;
	private static final ATTACK = 10;
	private static final DEFENSE = 6;
	
	private static final int MONEY_UPKEEP = 0;
	private static final int FOOD_UPKEEP = 0;
	private static final int OIL_UPKEEP = 0;
	private static final int ELECTRICITY_UPKEEP = 0;
	
	public Destroyer(Stats stats, int vie, Position position, int faction, float movement, int range, Resources upkeep) {
		super(stats, position, faction, movement, range, cost, upkeep);
	}
	
	
	public Destroyer(Position position, int faction) {
		this(new Stats(MAX_HEALTH_POINTS, ATTACK, DEFENSE), position, faction, MOVEMENT, RANGE, new Ressources(MONEY_UPKEEP, FOOD_UPKEEP, OIL_UPKEEP, ELECTRICITY_UPKEEP));
	}
	
}
