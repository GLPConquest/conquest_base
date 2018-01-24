
public class Tank extends Armored{
	public Tank(int vie, Position pos, String faction, int movement, int range, Cost cost, Cost upkeep, String[] way) {
		super(vie, pos, 8, faction, movement, range, cost, upkeep, way);
	}
	
	public Tank() {
		this(100,new Position(),"neutral",0,0,new Cost(),new Cost(),null);
	}
}
