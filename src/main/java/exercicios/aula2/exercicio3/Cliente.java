package exercicios.aula2.exercicio3;

public class Cliente {
    private String cpf;
    private int idade;
    private Genero genero;

    public Cliente(String cpf, Genero genero) {
        this.cpf = cpf;
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
}
