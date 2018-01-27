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
	
	private String attribute = "Armored";
	
	
	public Armored(Stats stats, Position position, int faction, float movement, int range, Resources upkeep, ArrayList<String> way) {
		super(stats, position, faction, movement, range, upkeep, crossable, getAttribute());
	}
	
	
	public Armored() {
		this(getStats(), getPosition(), getFaction(), getMovement(), getRange(), getUpkeep(), getCrossable(), getAttribute());
	} 
	
	public String getAttribute(){
		return this.attribute;
	}
}
