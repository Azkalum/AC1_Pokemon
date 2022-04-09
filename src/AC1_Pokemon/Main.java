package AC1_Pokemon;

public class Main {
    public static void main(String[] args) {

        Pokemon pokemon1 = new Pokemon("Charizard", "Fogo", 50);
        Pokemon pokemon2 = new Pokemon("Bulbassaur", "Planta", 50);

        Batalha fight = new Batalha();

        System.out.println("Pokemon 1: ");
        pokemon1.imprimiPokemon();
        System.out.println("Pokémon 2: ");
        pokemon2.imprimiPokemon();

        fight.pokemonFogo(pokemon1.getNome(),pokemon1.getVida());
        fight.pokemonPlanta(pokemon2.getNome(),pokemon2.getVida());

        fight.batalhar();
    }
}


