
public abstract class Unit {
	protected int vie;
	protected Position pos;
	protected final static int attaque = 10;
	protected int defense;
	protected String faction;
	protected int movement;
	protected int range;
	protected Cost cost;
	protected Cost upkeep;
	protected String[] way;
	
	public Unit(int vie, Position pos, int defense, String faction, int movement, int range, Cost cost, Cost upkeep, String[] way) {
		setVie(vie);
		setPos(pos);
		setDefense(defense);
		setFaction(faction);
		setMovement(movement);
		setRange(range);
		setCost(cost);
		setUpkeep(upkeep);
		setWay(way);
	}
	
	public Unit() {
		this(100,new Position(),0,"neutral",0,0,new Cost(),new Cost(),null);
	}

	public int getVie() {
		return vie;
	}

	public void setVie(int vie) {
		this.vie = vie;
	}

	public Position getPos() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
	}
	
	public static int getAttaque() {
		return attaque;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public String getFaction() {
		return faction;
	}

	public void setFaction(String faction) {
		this.faction = faction;
	}

	public int getMovement() {
		return movement;
	}

	public void setMovement(int movement) {
		this.movement = movement;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public Cost getCost() {
		return cost;
	}

	public void setCost(Cost cost) {
		this.cost = cost;
	}

	public Cost getUpkeep() {
		return upkeep;
	}

	public void setUpkeep(Cost upkeep) {
		this.upkeep = upkeep;
	}

	public String[] getWay() {
		return way;
	}

	public void setWay(String[] way) {
		this.way = way;
	}
	
	
}
