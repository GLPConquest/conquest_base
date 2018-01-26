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
	public Naval(int vie, Position pos, int defense, String faction, float movement, int range, Cost cost, Cost upkeep, String[] crossableTab) {
		ArrayList<String> crossables = getCrossable();
		for (i=0 ; i<crossableTab.length ; i++){
			addCrossable(crossableTab[i]);
		}
		super(vie, pos, defense, faction, movement, range, cost, upkeep, getCrossable());
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
	* A way to add new rules for ship
	*/
	public void addCrossable(String string){
		this.crossable=this.crossable.add(string);
	}
	
	/*
	* Crossable's getter
	*/
	public ArrayList<String> getCrossable(){
		return this.crossable;
	}
}
