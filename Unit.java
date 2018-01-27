package units;

import java.util.ArrayList;
import datas.Resources;
import datas.Stats;
import datas.Position;

/*
* This class is used to init every unit
* The global construction of a unit is defined here
*/
public abstract class Unit {
	/*Units have stats...*/
	private Stats stats;
	/*...a position...*/
	private Position position;
	/*...a faction...*/
	private int faction;
	/*...a movement range...*/
	private float movement;
	/*...an attack range...*/
	private int range;
	/*...an upkeep cost...*/
	private Resources upkeep;
	/*... they can go through some different type of square*/
	private ArrayList<String> crossable;
	/*and they have a special attribute in fight*/
	private String attribute;
	
	/*
	* Custom Constructor 
	*/
	public Unit(Stats stats, Position position, int faction, float movement, int range, Resources upkeep, ArrayList<String> crossable, String attribute) {
		setStats(stats);
		setPosition(position);
		setFaction(faction);
		setMovement(movement);
		setRange(range);
		setUpkeep(upkeep);
		setCrossable(crossable);
		setAttribute(attribute);
	}
	
	/*
	* Default constructor
	*/
	public Unit() {
		this(getStats(),getPosition(),getFaction(),getFaction(),getMovement(),getRange(),getUpkeep(),getCrossable(), getAttribute());
	}
	
	/*Stats getter*/
	public Stats getStats() {
		return this.stats;
	}

	/*Stats setter*/
	public void setStats(Stats stats) {
		this.stats = stats;
	}

	/*Position getter*/
	public Position getPosition() {
		return this.position;
	}

	/*Position setter*/
	public void setPosition(Position position) {
		this.position = position;
	}

	/*Faction getter*/
	public int getFaction() {
		return this.faction;
	}

	/*Faction setter*/
	public void setFaction(int faction) {
		this.faction = faction;
	}

	/*Movement getter*/
	public float getMovement() {
		return this.movement;
	}

	/*Movement setter*/
	public void setMovement(float movement) {
		this.movement = movement;
	}

	/*Range getter*/
	public int getRange() {
		return this.range;
	}

	/*Range setter*/
	public void setRange(int range) {
		this.range = range;
	}

	/*Upkeep getter*/
	public Resources getUpkeep() {
		return this.upkeep;
	}

	/*Upkeep setter*/
	public void setUpkeep(Resources upkeep) {
		this.upkeep = upkeep;
	}

	/*Crossable getter*/
	public ArrayList<String> getCrossable() {
		return this.crossable;
	}

	/*Crossable setter*/
	public void setCrossable(ArrayList<String> crossable) {
		this.crossable = crossable;
	}
	
	/*Attribute getter*/
	public String getAttribute(){
		return this.attribute;
	}
	
	/*Attribute setter*/
	public void setAttribute(String attribute){
		this.attribute = attribute;
	}
}
