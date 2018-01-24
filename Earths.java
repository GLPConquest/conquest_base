
public class Earths extends Unit{
	public Earths(int vie, Position pos, int defense, String faction, int movement, int range, Cost cost, Cost upkeep, String[] way) {
		super(vie, pos, defense, faction, movement, range, cost, upkeep, way);
	}
	public Earths() {
		this(100,new Position(),0,"neutral",0,0,new Cost(),new Cost(),null);
	}
}
