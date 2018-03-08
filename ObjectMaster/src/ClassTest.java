
public class ClassTest {

	public static void main(String[] args) {
		Wizard tim = new Wizard();
		Samurai sal = new Samurai();
		Ninja key = new Ninja();
		Samurai sean = new Samurai();
		tim.fireball(sal);
		System.out.println(sal.health);
		sal.deathBlow(key);
		System.out.println(key.health);
		key.steal(tim);
		System.out.println(sal.howMany());
		Samurai katie = new Samurai();
		System.out.println(sean.howMany());

	}

}
