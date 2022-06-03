import jogadores.JogadorAtacante;
import jogadores.JogadorDefesa;
import jogadores.JogadorGoleiro;
import jogadores.Jogador;
import partidas.Partida;
import times.Time;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        /* ORDEM DO CONSTRUTOR ATACANTE:
            String nome, int idade, int habilidade, int gols, int camisa, int velocidade, int tecnica
        */
        Jogador atacante = new JogadorAtacante("Ronaldinho Gaúcho", 32, 60, 0, 8, 65, 80);
        Jogador atacante2 = new JogadorAtacante("Neymar Jr", 34, 80, 0, 10, 85, 80);

        Jogador atacante3 = new JogadorAtacante("Lionel Messi", 36, 90, 0, 10, 90, 90);
        Jogador atacante4 = new JogadorAtacante("Kylian Mbappé", 23, 70, 0, 8, 95, 80);

        /* ORDEM DO CONSTRUTOR DEFESA:
            String nome, int idade, int habilidade, int gols, int camisa, int cobertura, int desarme
        */
        Jogador defesa = new JogadorDefesa("David Luiz", 30, 70, 0, 5, 90, 90);
        Jogador defesa2 = new JogadorDefesa("Thiago Silva", 35, 60, 0, 4, 80, 85);

        Jogador defesa3 = new JogadorDefesa("Piqué", 34, 60, 0, 4, 70, 75);
        Jogador defesa4 = new JogadorDefesa("Puyol", 38, 60, 0, 3, 60, 70);


        /* ORDEM DO CONSTRUTOR GOLEIRO:
            String nome, int idade, int habilidade, int gols, int camisa, int reflexos, float altura
        */
        Jogador goleiro = new JogadorGoleiro("Alisson", 30, 90, 0, 1, 78, 1.8F);
        Jogador goleiro2 = new JogadorGoleiro("Stegen", 28, 70, 0, 1, 80, 1.75F);

        /* Preenchendo o time 1 */
        List<Jogador> time1 = new ArrayList<>();
        time1.add(atacante);
        time1.add(atacante2);
        time1.add(defesa);
        time1.add(defesa2);
        time1.add(goleiro);

        /* Preenchendo o time 2 */
        List<Jogador> time2 = new ArrayList<>();
        time2.add(atacante3);
        time2.add(atacante4);
        time2.add(defesa3);
        time2.add(defesa4);
        time2.add(goleiro2);

        Time flamengo = new Time("Flamengo");
        flamengo.setJogadores(time1);

        Time barcelona = new Time("Barcelona");
        barcelona.setJogadores(time2);

        System.out.println("------------------- DETALHES DOS TIMES -------------------");
        System.out.println("------------------------ FLAMENGO ------------------------");
        System.out.println("----------------------------------------------------------");
        System.out.println("Jogadores: \n");
        flamengo.imprimeJogadores();

        System.out.println("----------------------- BARCELONA ------------------------");
        System.out.println("Jogadores: \n");
        barcelona.imprimeJogadores();

        System.out.println("------------------ DETALHES DA PARTIDA -------------------");
        System.out.println("----------------- SIMULAÇÃO: CASA VENCE ------------------");
        System.out.println("----------------------------------------------------------");

        Partida partida = new Partida("17/05/2022", flamengo, barcelona);
        System.out.println("Data: " + partida.getData() + "\n" +
                           "Casa: " + partida.getTimeCasa().getNome() + " X " + "Visitante: " + partida.getTimeVisitante().getNome() +
                            "\n");
        // SIMULANDO PARTIDA
        flamengo.getJogadores().get(0).somaGols(2);
        barcelona.getJogadores().get(1).somaGols(1);

        // EXIBINDO O PLACAR
        System.out.println(partida.getPlacar());

        // EXIBINDO RESULTADOS
        System.out.println("\nRESULTADOS - FLAMENGO");
        System.out.println(flamengo.getResultados());

        System.out.println("\nRESULTADOS - BARCELONA");
        System.out.println(barcelona.getResultados());

        System.out.println("----------------------------------------------------------\n");

        // RESETANDO OS JOGADORES PARA NOVOS TESTES
        flamengo.getJogadores().get(0).setGols(0);
        barcelona.getJogadores().get(1).setGols(0);

        System.out.println("------------------ DETALHES DA PARTIDA -------------------");
        System.out.println("-------------- SIMULAÇÃO: VISITANTE VENCE ----------------");
        System.out.println("----------------------------------------------------------");

        Partida partida2 = new Partida("19/05/2022", flamengo, barcelona);
        System.out.println("Data: " + partida.getData() + "\n" +
                "Casa: " + partida.getTimeCasa().getNome() + " X " + "Visitante: " + partida.getTimeVisitante().getNome() +
                "\n");
        // SIMULANDO PARTIDA
        barcelona.getJogadores().get(1).somaGols(1);

        // EXIBINDO O PLACAR
        System.out.println(partida2.getPlacar());

        // EXIBINDO RESULTADOS
        System.out.println("\nRESULTADOS - FLAMENGO");
        System.out.println(flamengo.getResultados());

        System.out.println("\nRESULTADOS - BARCELONA");
        System.out.println(barcelona.getResultados());
        System.out.println("----------------------------------------------------------\n\n");

        // RESETANDO OS JOGADORES PARA NOVOS TESTES
        flamengo.getJogadores().get(0).setGols(0);
        barcelona.getJogadores().get(1).setGols(0);

        System.out.println("------------------ DETALHES DA PARTIDA -------------------");
        System.out.println("------------------- SIMULAÇÃO: EMPATE --------------------");
        System.out.println("----------------------------------------------------------");


        Partida partida3 = new Partida("20/05/2022", flamengo, barcelona);
        System.out.println("Data: " + partida.getData() + "\n" +
                "Casa: " + partida.getTimeCasa().getNome() + " X " + "Visitante: " + partida.getTimeVisitante().getNome() +
                "\n");
        // SIMULANDO PARTIDA
        flamengo.getJogadores().get(0).somaGols(1);
        barcelona.getJogadores().get(1).somaGols(1);

        // EXIBINDO O PLACAR
        System.out.println(partida3.getPlacar());

        // EXIBINDO RESULTADOS
        System.out.println("\nRESULTADOS - FLAMENGO");
        System.out.println(flamengo.getResultados());

        System.out.println("\nRESULTADOS - BARCELONA");
        System.out.println(barcelona.getResultados());

        System.out.println("----------------------------------------------------------\n\n");
    }
}
