package ex2;

public class Especie {
    private String nomeEspecie;
    private String planeta;
    private int nivelPericulosidadeBase;
    
    public Especie(String nomeEspecie, String planeta, int nivelPericulosidadeBase) {
        this.nomeEspecie = nomeEspecie;
        this.planeta = planeta;
        this.nivelPericulosidadeBase = nivelPericulosidadeBase;
    }

    public String getNomeEspecie() {
        return nomeEspecie;
    }

    public String getPlaneta() {
        return planeta;
    }

    public int getNivelPericulosidadeBase() {
        return nivelPericulosidadeBase;
    }
    
}
