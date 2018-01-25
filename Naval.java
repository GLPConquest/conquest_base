import java.util.ArrayList;


public abstract class Naval extends Unit {

	private ArrayList<String> crossable = new ArrayList<String>();
	
	public Naval(int vie, Position pos, int defense, String faction, int movement, int range, Cost cost, Cost upkeep) {
		setDefinedCrossable();
		super(vie, pos, defense, faction, movement, range, cost, upkeep, getCrossable());
	}
	public Naval() {
		setDefinedCrossable();
		this(100,new Position(),0,"neutral",0,0,new Cost(),new Cost(), getCrossable());
	}
	public void setDefinedCrossable(){
		this.crossable=this.crossable.add("water");
	}
	public ArrayList<String> getCrossable(){
		return this.crossable;
	}
}
