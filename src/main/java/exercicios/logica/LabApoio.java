package exercicios.logica;

public class LabApoio {
    private static final Lab teste = new Lab();
    private static String nome = "Eduardo da Rosa";



    public static void main(String[] args) {
        System.out.println("Nome da outra classe: " + teste.getNome() + "  " + nome);
        eduardo(nome);
        teste.setNome("Luma Santos");
        eduardo(teste.getNome());
        eduardo(teste.getNome());
        eduardo(teste.getNome());

    }

    public static void eduardo(String romario){
        System.out.println("teste" + teste.getNome() + " " + romario);
    }

}
