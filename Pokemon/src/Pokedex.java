
public class Pokedex extends AbstractPokemon {
	public String pokemonInfo(Pokemon pokemon) {
		return String.format("%s, %d hp, %s type", pokemon.getName(), pokemon.getHealth(), pokemon.getType());
	}
}
