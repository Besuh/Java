
public class Samurai extends Human{
	public Samurai() {
		this.health = 200;
		super.setTotal(super.getTotal()+1);
	}
	public void deathBlow(Human name) {
		name.health = 0;
		this.health /=2;
	}
	public void meditate() {
		this.health += this.health/2;
	}
	public int howMany() {
		
		return super.getTotal();
	}
}
