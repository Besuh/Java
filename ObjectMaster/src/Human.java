
public class Human {
	protected int strength=3;
	protected int stealth=3;
	protected int intelligence= 3;
	public int health =100;
	private static int total = 0;
	public void attack(Human name) {
		name.health -= strength;
		System.out.println("sal's health " + name.health);
	}
	public static int getTotal() {
		return total;
	}
	public static void setTotal(int total) {
		Human.total = total;
	}
}
