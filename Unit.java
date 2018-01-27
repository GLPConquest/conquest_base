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
	/*...max health...*/
	private float maxHealth;
	/*...current health...*/
	private float currentHealth
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
	private ArrayList<int> crossable;
	/*and they have a special attribute in fight*/
	private String attribute;
	
	/*
	* Custom Constructor 
	*/
	public Unit(Stats stats, float maxHealth, float currentHealth, Position position, int faction, float movement, int range, Resources upkeep, ArrayList<int> crossable, String attribute) {
		setStats(stats);
		setMaxHealth(maxHealth);
		setCurrentHealth(currentHealth);
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
		this(getStats(),getMaxHealth(),getCurrentHealth()getPosition(),getFaction(),getFaction(),getMovement(),getRange(),getUpkeep(),getCrossable(), getAttribute());
	}
	
	/*Stats getter*/
	public Stats getStats() {
		return this.stats;
	}

	/*Stats setter*/
	public void setStats(Stats stats) {
		this.stats = stats;
	}

	/*MaxHealth getter*/
	public float getMaxHealth() {
		return this.maxHealth;
	}

	/*MaxHealth setter*/
	public void setMaxHealth(float maxHealth) {
		this.maxHealth = maxHealth;
	}
	
	/*CurrentHealth getter*/
	public float getCurrentHealth() {
		return this.currentHealth;
	}

	/*CurrentHealth setter*/
	public void setCurrentHealth(float currentHealth) {
		this.currentHealth = currentHealth;
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
	public ArrayList<int> getCrossable() {
		return this.crossable;
	}

	/*Crossable setter*/
	public void setCrossable(ArrayList<int> crossable) {
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
