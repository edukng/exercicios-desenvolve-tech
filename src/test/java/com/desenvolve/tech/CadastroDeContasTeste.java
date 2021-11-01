package com.desenvolve.tech;

import exercicios.aula2.CadastroDeContas;
import exercicios.aula2.ContaCorrente;

public class CadastroDeContasTeste {

    public static void main(String[] args) {
        CadastroDeContas testeCadastro = new CadastroDeContas();
        ContaCorrente contaDeTeste = new ContaCorrente(100.00);

        if(testeCadastro.cadastraNovaConta(contaDeTeste)){
            System.out.println("Conta criada com sucesso");
        }else{
            System.out.println("Erro ao criar a conta");
        }

        System.out.println("Conta de numero: "+ testeCadastro.pesquisaConta(0));
    }
}