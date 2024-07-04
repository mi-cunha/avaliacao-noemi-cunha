package ex2;

import java.time.LocalDateTime;

public class Alienigena {
    private int id;
    private String nome;
    private Especie especie;
    private int nivelPericulosidade;
    private LocalDateTime dataHora;
    private boolean estaEmQuarentena;

    public Alienigena(int id, String nome, Especie especie, int nivelPericulosidade) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.nivelPericulosidade = nivelPericulosidade;
        this.dataHora = LocalDateTime.now();
        this.estaEmQuarentena = nivelPericulosidade > especie.getNivelPericulosidadeBase();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public int getNivelPericulosidade() {
        return nivelPericulosidade;
    }

    public void setNivelPericulosidade(int nivelPericulosidade) {
        this.nivelPericulosidade = nivelPericulosidade;
        this.estaEmQuarentena = nivelPericulosidade > especie.getNivelPericulosidadeBase();
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public boolean isEstaEmQuarentena() {
        return estaEmQuarentena;
    }


    public String toString() {
        return "Alienígena: " +
                "id: " + id +
                ", nome: " + nome +
                ", especie: " + especie.getNomeEspecie() +
                ", nivel de Periculosidade: " + nivelPericulosidade +
                ", data e hora de entrada: " + dataHora +
                ", está em quarentena: " + (estaEmQuarentena ? "sim" : "não");
    }

}
