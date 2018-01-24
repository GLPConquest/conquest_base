
public class Cost {
	private int food;
	private int oil;
	private int elec;
	
	public Cost() {
		this.food=0;
		this.oil=0;
		this.elec=0;
	}
	public void setFood(int i) {
		this.food=i;
	}
	
	public void setOil(int i) {
		this.oil=i;
	}
	
	public void setElec(int i) {
		this.elec=i;
	}

	public int getFood() {
		return this.food;
	}
	
	public int getOil() {
		return this.oil;
	}
	
	public int getElec() {
		return this.elec;
	}

}
