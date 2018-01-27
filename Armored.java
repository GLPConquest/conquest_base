package units;

import java.util.ArrayList;
import datas.Resources;
import datas.Stats;
import datas.Position;

/*
* This class is used to build the armored units
* These units are strong against the infantry units and weak against bots units
* Moreover these units are slower than the other
*/
public class Armored extends Earths{
	
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
		setDefaultAttribute();
		this(getStats(), getMaxHealth(), getCurrentHealth(), getPosition(), getFaction(), getMovement(), getRange(), getUpkeep(), getCrossable(), getAttribute());
	} 
	
	public setDefaultAttribute(){
		this.attribute = "Armored";
	}
}
