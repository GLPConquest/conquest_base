
public class Turret extends Armored {
	public Turret(int vie, Position pos, String faction, int movement, int range, Cost cost, Cost upkeep, String[] way) {
		super(vie, pos, 6, faction, movement, range, cost, upkeep, way);
	}
	
	public Turret() {
		this(100,new Position(),"neutral",0,0,new Cost(),new Cost(),null);
	}
}
