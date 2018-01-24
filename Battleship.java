
public class Battleship extends Naval{
	public Battleship(int vie, Position pos, String faction, int movement, int range, Cost cost, Cost upkeep, String[] way) {
		super(vie, pos, 6, faction, movement, range, cost, upkeep, way);
	}
	
	
	public Battleship() {
		this(100,new Position(),"neutral",0,0,new Cost(),new Cost(),null);
	}
}
