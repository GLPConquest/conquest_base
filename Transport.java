
public class Transport extends Naval{
	public Transport(int vie, Position pos, String faction, int movement, int range, Cost cost, Cost upkeep, String[] way) {
		super(vie, pos, 3, faction, movement, range, cost, upkeep, way);
	}
	
	public Transport() {
		this(100,new Position(),"neutral",0,0,new Cost(),new Cost(),null);
	}
}
