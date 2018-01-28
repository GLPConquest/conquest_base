package units;

import java.util.ArrayList;
import datas.Resources;
import datas.Stats;
import datas.Position;

/*
* This class is used to build the infantry units
* The environment these units can go through is defined here
* These units are strong against the Bots units and weak against Armored units
*/
public class Infantry extends Unit {
	
	/*
	* Custom Constructor 
	*/
	public Infantry(Stats stats, float maxHealth, float currentHealth, Position position, int faction, float movement, int range, Resources upkeep, ArrayList<int> crossable) {
		super(stats, maxHealth, currentHealth, position, faction, movement, range, upkeep, crossable, getAttribute());
	}
	
	/*
	* Default constructor
	*/
	public Infantry() {
		setDefaultAttribute();
		setDefaultCrossable();
		this(getStats(), getMaxHealth(), getCurrentHealth(), getPosition(), getFaction(), getMovement(), getRange(), getUpkeep(), getCrossable(), getAttribute());
	} 
	
	public setDefaultAttribute(){
		this.attribute = "Infantry";
	}
	
	public setDefaultCrossable(){
		this.crossable = this.crossable.add(1);
		this.crossable = this.crossable.add(2);
		this.crossable = this.crossable.add(3);
		this.crossable = this.crossable.add(4);
		this.crossable = this.crossable.add(5);
		this.crossable = this.crossable.add(6);
		this.crossable = this.crossable.add(7);
		this.crossable = this.crossable.add(8);
		this.crossable = this.crossable.add(9);
	}
}
