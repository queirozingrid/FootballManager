package jogadores;

public class JogadorDefesa extends Jogador{
    private int cobertura;
    private int desarme;

    public JogadorDefesa(String nome, int idade, int habilidade, int gols, int camisa, int cobertura, int desarme){
        super(nome, idade, habilidade, gols, camisa);
        this.cobertura = cobertura;
        this.desarme = desarme;
        setHabilidade(habilidade);
    }

    @Override
    public void setHabilidade(int habilidade){
        habilidade = ((habilidade * 5) + (cobertura * 3) + (desarme * 2)) /10;
    }

    @Override
    public String toString(){
        return  "Nome: " + getNome() + "\n" +
                "Idade: " + getIdade() + "\n" +
                "Posição: Defesa" + "\n" +
                "Habilidade: " + getHabilidade() + "\n" +
                "Gols: " + getGols() + "\n" +
                "Camisa: " + getCamisa() + "\n" +
                "Cobertura: " + cobertura + "\n" +
                "Desarme: " + desarme + "\n\n";
    }
}
