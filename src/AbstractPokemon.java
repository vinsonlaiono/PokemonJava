
public abstract class AbstractPokemon implements PokemonInterface{

	private String name;
	protected int health;
	private String type;
	
	
	public void attackPokemon(Pokemon pokemon) {
		pokemon.setHealth(pokemon.getHealth()-10);
		System.out.println(pokemon.getName());
		System.out.println("----------------------------");
	}
	
	public void pokemonInfo() {
		System.out.println("Pokemon Name: " + this.name);
		System.out.println("Pokemon Type: " + this.type);
		System.out.println("Pokemon Health: " + this.health);
		System.out.println("----------------------------");
	}
}
