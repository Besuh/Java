public class Dragon {
	protected int energyLevel = 300;
	public int displayEnergy() {
		System.out.println(energyLevel);
		return energyLevel;
	}
	public void fly() {
		System.out.println("Woosh");
		energyLevel-=50;
	}
	public void eatHumans() {
		energyLevel+=25;
	}
	public void attackTown() {
		System.out.println("arrrcgghh");
		energyLevel-=100;
	}
}
