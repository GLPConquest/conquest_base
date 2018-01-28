package units;

import java.util.ArrayList;
import datas.Resources;
import datas.Stats;
import datas.Position;

/*
* This class is used to build Bots
* The environment these units can go through is defined here
* They arestrong against Armored units but weak to Infantry
*/
public class Bots extends Earths {
	
	/*
	* Custom constructor
	*/
	public Bots(Stats stats, Position position, int faction, float movement, int range, Resources upkeep, AraryList<int> crossables) {
		setCrossable(crossables);
		super(stats, position, faction, movement, range, upkeep, getCrossable());
	}
	
	/*
	* Default constructor
	*/
	public Bots() {
		setDefaultAttribute();
		setDefaultCrossable();
		this(getStats(), getMaxHealth(), getCurrentHealth(), getPosition(), getFaction(), getMovement(), getRange(), getUpkeep(), getCrossable(), getAttribute());
	}
	
	
	public setDefaultAttribute(){
		this.attribute = "Bots";
	}
	
	/*
	* Default settings for crossable path : Bots can go everywhere but not in water
	*/
	public void setDefaultCrossable(){
		this.crossable=this.crossable.add(1);
		this.crossable=this.crossable.add(2);
		this.crossable=this.crossable.add(3);
		this.crossable=this.crossable.add(4);
		this.crossable=this.crossable.add(5);
		this.crossable=this.crossable.add(6);
		this.crossable=this.crossable.add(7);
		this.crossable=this.crossable.add(8);
		this.crossable=this.crossable.add(9);
	}
}
