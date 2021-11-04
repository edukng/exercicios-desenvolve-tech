package exercicios.herancaepolimorfismo.exercicio2;

public class Cachorro extends Animal{

    public void late(){
        System.out.println("Latindo");

    }

    @Override
    public void caminha(){
        System.out.println("Cachorro Caminhando");
    }
}
