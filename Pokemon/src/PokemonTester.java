
public class PokemonTester {

	public static void main(String[] args) {
		Pokemon charmander = new Pokemon("Charmander",50,"fire");
		Pokedex pokedex = new Pokedex();
		System.out.println(pokedex.pokemonInfo(charmander));
	}
}
