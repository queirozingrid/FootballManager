package jogadores;

public class JogadorGoleiro extends Jogador{
    private int reflexos;
    private float altura;

    public JogadorGoleiro(String nome, int idade, int habilidade, int gols, int camisa, int reflexos, float altura){
        super(nome, idade, habilidade, gols, camisa);
        this.reflexos = reflexos;
        this.altura = altura;
        setHabilidade(habilidade);
    }

    @Override
    public void setHabilidade(int habilidade){
        habilidade = ((habilidade * 5) + (((int)(altura*100)) * 2) + (reflexos*3)) / 10;
    }

    @Override
    public String toString(){
        return  "Nome: " + getNome() + "\n" +
                "Idade: " + getIdade() + "\n" +
                "Posição: Goleiro" + "\n" +
                "Habilidade: " + getHabilidade() + "\n" +
                "Gols: " + getGols() + "\n" +
                "Camisa: " + getCamisa() + "\n" +
                "Reflexos: " + reflexos + "\n" +
                "Altura: " + altura + "m\n\n";
    }

}
