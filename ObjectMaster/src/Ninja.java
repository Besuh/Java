
public class Ninja extends Human {
	public Ninja() {
		this.stealth = 10;
	}
	public void steal(Human name) {
		name.health -= stealth;
		this.health += stealth;
	}
	public void runAway() {
		this.health -= 10;
	}
}
