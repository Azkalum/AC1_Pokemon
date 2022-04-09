package AC1_Pokemon;

public class Batalha {

    private int pokemon1Vida;
    private int pokemon2Vida;
    private String pokemon1Nome;
    private String pokemon2Nome;

    public void pokemonFogo(String nome, int vida){
        this.pokemon1Vida = vida;
        this.pokemon1Nome = nome;
    }

    public void pokemonPlanta(String nome, int vida){
        this.pokemon2Vida = vida;
        this.pokemon2Nome = nome;
    }

    public void batalhar(){

        System.out.println("I'm Ashe Katchum, from Pallet Town! I will be your opponent");
        System.out.println("...........................................................");
        System.out.println("...........................................................");
        System.out.println("Gotta Catch 'Em All!");
        System.out.println("\n");

        if(pokemon1Vida > pokemon2Vida){

            System.out.println("The Winner is: " + pokemon1Nome + "\n Congrats!!!!");

        }else{

            System.out.println("Você perdeu! Vencedor: " + pokemon2Nome + "\n Congrats!!!!");

        }

    }

}


