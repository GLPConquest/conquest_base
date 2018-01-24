import java.util.ArrayList;
import datas.Resources;

public class Destroyer extends Naval {
	
	private static final MAX_HEALTH_POINTS = 100;
	private static final MOVEMENT = 3;
	private static final RANGE = 1;
	private static final ATTACK = 10;
	private static final DEFENSE = 6;
	private static final int MONEY_UPKEEP = 0;
	private static final int FOOD_UPKEEPER = 0;
	private static final int OIL_UPKEEPER = 0;
	private static final int ELECTRICITY_UPKEEPER = 0;
	
	public Destroyer(Stats stats int vie, Position position, int faction, float movement, int range, Resources upkeep, ArrayList<String> crossable) {
		super(stats, position, faction, movement, range, cost, upkeep, crossable);
	}
	
	
	public Destroyer(Position position, int faction, ArrayList<String> crossable) {
		this(new Stats(MAX_HEALTH_POINTS, ATTACK, DEFENSE), position, faction, MOVEMENT, RANGE, new Ressources(MONEY_UPKEEP, FOOD_UPKEEPER, OIL_UPKEEPER, ELECTRICITY_UPKEEPER), null);
	}
	
}
