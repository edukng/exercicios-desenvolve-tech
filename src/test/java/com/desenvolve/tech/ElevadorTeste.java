package com.desenvolve.tech;

import com.desenvolve.tech.exercicios.base.extras.Elevador;

public class ElevadorTeste {
    private static Elevador atlas = new Elevador();

    public static void main(String[] args) {

        atlas.tipoDoElevador(4,9);

        atlas.entra();
        if(atlas.entra()){
            System.out.println("Entrada permitida");
        }else{
            System.out.println("Entrada negada, elevador atingiu sua capacidade máxima");
        }

        if(atlas.sai()){
            System.out.println("Saída permitida");
        }else{
            System.out.println("Elevador vazio");
        }

        if(atlas.sobe(4)){
            System.out.println("Subindo");
        }else{
            System.out.println("Não é possível subir");
        }
        atlas.desce(2);
        if(atlas.desce(2)){
            System.out.println("Descendo");
        }else{
            System.out.println("Andar está no térreo");
        }

    }
}
