package jogadores;

public class JogadorAtacante extends Jogador {
    private int velocidade;
    private int tecnica;

    public JogadorAtacante(String nome, int idade, int habilidade, int gols, int camisa, int velocidade, int tecnica){
        super(nome, idade, habilidade, gols, camisa);
        this.tecnica = tecnica;
        this.velocidade = velocidade;
        setHabilidade(habilidade);
    }
    @Override
    public void setHabilidade(int habilidade){
        habilidade = ((habilidade * 5) + (velocidade * 2) + (tecnica * 3)) / 10;
    }

    @Override
    public String toString(){
        return  "Nome: " + getNome() + "\n" +
                "Idade: " + getIdade() + "\n" +
                "Posição: Ataque" + "\n" +
                "Habilidade: " + getHabilidade() + "\n" +
                "Gols: " + getGols() + "\n" +
                "Camisa: " + getCamisa() +
                "Velocidade: " + velocidade + "\n" +
                "Técnica: " + tecnica + "\n\n";
    }
}
