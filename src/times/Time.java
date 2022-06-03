package times;

import jogadores.Jogador;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private List<Jogador> jogadores = new ArrayList<>();
    private int vitorias = 0;
    private int derrotas = 0;
    private int empates = 0;

    public Time(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // inserir jogadores
    public void setJogadores(List<Jogador> jogadores){
        this.jogadores = jogadores;
    }
    public List<Jogador> getJogadores(){
        return this.jogadores;
    }

    public void imprimeJogadores(){
        for(int i = 0; i<jogadores.size(); i++){
            System.out.println(jogadores.get(i));
        }
    }

    public void setVitorias(int vitorias){
        this.vitorias += vitorias;
    }

    public void setDerrotas(int derrotas){
        this.derrotas += derrotas;
    }

    public void setEmpates(int empates){
        this.empates += empates;
    }

    
    public String getResultados(){
        return "Vitórias: " + vitorias + ". " + "Empates: " + empates + ". " + "Derrotas: " + derrotas;
    }


}
