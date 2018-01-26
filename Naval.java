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
	* The environments the naval units can go through
	*/
	private ArrayList<String> crossable = new ArrayList<String>();
	
	/*
	* Custom constructor
	*/
	public Naval(Stats stats, Position position, int faction, float movement, int range, Resources upkeep, AraryList<String> crossables) {
		setCrossable(crossables);
		super(stats, position, faction, movement, range, upkeep, getCrossable());
	}
	
	/*
	* Default constructor
	*/
	public Naval() {
		setDefinedCrossable();
		this(100,new Position(),0,"neutral",0,0,new Cost(),new Cost(), getCrossable());
	}
	
	/*
	* Default settings for crossable path : ship can only travel through water
	*/
	public void setDefinedCrossable(){
		this.crossable=this.crossable.add("water");
	}
	
	/*
	* Crossable's setter
	*/
	public void setCrossable(ArrayList<String> crossables){
		this.crossable=crossables;
	}
	
	/*
	* Crossable's getter
	*/
	public ArrayList<String> getCrossable(){
		return this.crossable;
	}
}
