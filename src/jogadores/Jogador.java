package jogadores;

public abstract class Jogador {
    private String nome;
    private int idade;
    private int habilidade;
    private int gols = 0;
    private int camisa;

    public Jogador(){}

    public Jogador(String nome, int idade, int habilidade, int gols, int camisa){
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.gols += gols;
        this.camisa = camisa;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHabilidade() {
        return habilidade;
    }

    public abstract void setHabilidade(int habilidade);

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public void somaGols(int gols) {
        this.gols += gols;
    }

    public int getIdade(){
        return idade;
    }

    public int getCamisa(){
        return camisa;
    }

}
