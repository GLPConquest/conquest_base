
public class Sniper extends Infantry {
	public Sniper(int vie, Position pos, String faction, int movement, int range, Cost cost, Cost upkeep, String[] way) {
		super(vie, pos, 3, faction, movement, range, cost, upkeep, way);
	}
	
	public Sniper() {
		this(100,new Position(),"neutral",0,0,new Cost(),new Cost(),null);
	}
}
