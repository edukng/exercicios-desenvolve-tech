package exercicios.classes.exercicio3;

public class Cliente {
    private String cpf;
    private int idade;
    private Genero genero;

    public Cliente(String cpf, Genero genero) {
        this.cpf = cpf;
        this.genero = genero;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Genero getGenero() {
        return genero;
    }
}
