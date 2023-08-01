package br.com.faguirre;

public class Identidade implements Comparable<Identidade> {
    private String nome;
    private String sexo;

    public Identidade (String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "nome= " + nome +
                "  -  sexo= " + sexo;
    }

    @Override
    public int compareTo(Identidade identidade) {
        return this.nome.compareTo(identidade.getSexo());
    }
}
