package units;

import java.util.ArrayList;
import datas.Resources;
import datas.Stats;
import datas.Position;

/*
* This class is used to build Ground units
* The environment these units can go through is defined in the subclasses
* The attribute that gives bonus in fight is defined in the subclasses
*/
public class Earths extends Unit{
	/*
	* Custom Constructor 
	*/
	public Armored(Stats stats, float maxHealth, float currentHealth, Position position, int faction, float movement, int range, Resources upkeep, ArrayList<String> way) {
		super(stats, maxHealth, currentHealth, position, faction, movement, range, upkeep, crossable, getAttribute());
	}
	
	/*
	* Default constructor
	*/
	public Armored() {
		this(getStats(), getMaxHealth(), getCurrentHealth(), getPosition(), getFaction(), getMovement(), getRange(), getUpkeep(), getCrossable(), getAttribute());
	}
}
