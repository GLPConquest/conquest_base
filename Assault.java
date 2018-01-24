
public class Assault extends Infantry{
	public Assault(int vie, Position pos, String faction, int movement, int range, Cost cost, Cost upkeep, String[] way) {
		super(vie, pos, 5, faction, movement, range, cost, upkeep, way);
	}
	
	public Assault() {
		this(100,new Position(),"neutral",0,0,new Cost(),new Cost(),null);
	}	
}
