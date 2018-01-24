
public class Obfourtytwo extends Bots {
	public Obfourtytwo(int vie, Position pos, String faction, int movement, int range, Cost cost, Cost upkeep, String[] way) {
		super(vie, pos, 6, faction, movement, range, cost, upkeep, way);
	}
	
	public Obfourtytwo() {
		this(100,new Position(),"neutral",0,0,new Cost(),new Cost(),null);
	}
}
