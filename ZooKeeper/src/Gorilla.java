
public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("The gojilla has thrown something");
		this.energyLevel -= 5;
	}
	public void eatBananas() {
		System.out.println("le gorilla mucho happy");
		energyLevel += 10;
	}
	public void climb() {
		System.out.println("The gojilla has climbed a twa");
		energyLevel -=10;
	}
}