package units;

import java.util.ArrayList;
import datas.Resources;
import datas.Stats;
import datas.Position;

/*
* This class is used to build Naval units
* The environment these units can go through is defined here
* Unlike ground units, there is no bonus applied in a naval fight
*/
public abstract class Naval extends Unit {
	
	/*
	* Custom constructor
	*/
	public Naval(Stats stats, float maxHealth, float currentHealth, Position position, int faction, float movement, int range, Resources upkeep, ArrayList<int> crossable) {
		super(stats, maxHealth, currentHealth, position, faction, movement, range, upkeep, crossable, getAttribute());
	}
	
	/*
	* Default constructor
	*/
	public Naval() {
		setDefaultAttribute();
		setDefaultCrossable();
		this(getStats(), getMaxHealth(), getCurrentHealth(), getPosition(), getFaction(), getMovement(), getRange(), getUpkeep(), getCrossable(), getAttribute());
	} 
	
	public setDefaultAttribute(){
		this.attribute = "Naval";
	}
	
	public setDefaultCrossable(){
		this.crossable = this.crossable.add(0);
	}
}
