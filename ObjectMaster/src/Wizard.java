
public class Wizard extends Human {
	public Wizard() {
	this.health = 50;
	this.intelligence = 8;
}
	public void heal(Human name) {
		name.health += intelligence;
	}
	public void fireball(Human name) {
		name.health -= 3*intelligence;
	}
}
