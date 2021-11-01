package exercicios.testes;

public class SegundaClasse {
    private static final PrimeiraClasse teste = new PrimeiraClasse();
    private static String nome = "Eduardo da Rosa";

    public static void main(String[] args) {
        System.out.println("Nome da outra classe: " + teste.getNome() + "  " + nome);
        eduardo(nome);
    }

    public static void eduardo(String romario){
        System.out.println("teste" + teste.getNome() + " " + romario);

    }
}
