
public class Pokemon {
	private String name;
	private int health;
	private String type;
	private static int count;
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Pokemon.count = count;
	}
	public Pokemon(String name, int health, String type) {
		this.setHealth(health);
		this.setName(name);
		this.setType(type);
		Pokemon.count++;
	}
	
}
