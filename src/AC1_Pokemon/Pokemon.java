package AC1_Pokemon;

public class Pokemon {

    private String nome;
    private String tipo;
    private int level;
    private int vida = 200;
    private int ataque;
    private int defesa;

    public Pokemon(String nome, String tipo, int level){
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;

        calculaAtributos();
        calculaBonus();
    }

    public String getNome(){
        return this.nome;
    }

    public int getVida(){
        return this.vida;
    }

    public int getAtaque(){
        return this.ataque;
    }

    public int getDefesa(){
        return this.defesa;
    }

    private void calculaAtributos(){
        switch(tipo){
            case "Fogo":
                vida = (int) (vida - Math.random() - 35);
                ataque = (int) (Math.random() * 60);
                defesa = (int) (Math.random() * 50);
                break;

            case "Agua":
                vida = (int) (vida - Math.random() - 35);
                ataque = (int) (Math.random() * 60);
                defesa = (int) (Math.random() * 50);
                break;

            case "Planta":
                vida = (int) (vida - Math.random() - 35);
                ataque = (int) (Math.random() * 60);
                defesa = (int) (Math.random() * 50);
                break;

            case "Pedra":
                vida = (int) (vida - Math.random() - 35);
                ataque = (int) (Math.random() * 60);
                defesa = (int) (Math.random() * 50);
                break;
        }
    }

    private void calculaBonus(){

        vida = (int) (vida + (level / Math.random() / 10));
        ataque = (int) (ataque + (level / Math.random() / 5));
        defesa = (int) (defesa + (level / Math.random() / 5));

    }

    public void imprimiPokemon(){

        System.out.println(
                "Nome: " + nome + " | " +
                        "Tipo: " + tipo + " | " +
                        "Level: " + level + " | " +
                        "Vida: " + vida + " | " +
                        "Ataque: " + ataque + " | " +
                        "Defesa: " + defesa + "\n");

    }

}


