
public class Bfgninethousand extends Bots{
	public Bfgninethousand(int vie, Position pos, String faction, int movement, int range, Cost cost, Cost upkeep, String[] way) {
		super(vie, pos, 3, faction, movement, range, cost, upkeep, way);
	}
	
	public Bfgninethousand() {
		this(100,new Position(),"neutral",0,0,new Cost(),new Cost(),null);
	}
}
