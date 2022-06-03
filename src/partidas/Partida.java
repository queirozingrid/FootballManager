package partidas;

import times.Time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Partida {
    private Date data = new Date();
    private Time timeCasa;
    private Time timeVisitante;
    private int placarCasa = 0;
    private int placarVisitante = 0;

    public Partida(String data, Time timeCasa, Time timeVisitante) throws ParseException {
        setData(data);
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
    }

    public String getPlacar(){

        setPlacarCasa(verificaGol(timeCasa));
        setPlacarVisitante(verificaGol(timeVisitante));

        if(placarCasa > placarVisitante){
            timeCasa.setVitorias(1);
            timeVisitante.setDerrotas(1);
        } else if (placarVisitante > placarCasa) {
            timeVisitante.setVitorias(1);
            timeCasa.setDerrotas(1);
        } else {
            timeVisitante.setEmpates(1);
            timeCasa.setEmpates(1);
        }

        return "Placar:\n" +
                "Casa: " + timeCasa.getNome() + " " + placarCasa + " X " +
                placarVisitante + " Visitante: " + timeVisitante.getNome();
    }

    // MÉTODO QUE PERCORRE ARRAY DE JOGADORES E VERIFICA SE HOUVE GOL
    public int verificaGol(Time time){
        int totalGols = 0;
        for(int i=0; i<time.getJogadores().size(); i++){
            totalGols += time.getJogadores().get(i).getGols();
        }
        return totalGols;
    }

    public Date getData() {
        return data;
    }

    public void setData(String data) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        this.data = formato.parse(data);
    }

    public Time getTimeCasa() {
        return timeCasa;
    }

    public Time getTimeVisitante() {
        return timeVisitante;
    }

    public void setPlacarCasa(int placarCasa) {
        this.placarCasa = placarCasa;
    }

    public void setPlacarVisitante(int placarVisitante) {
        this.placarVisitante = placarVisitante;
    }
}
