package com.desenvolve.tech;

import exercicios.aula2.CadastroDeContas;
import exercicios.aula2.ContaCorrente;

public class CadastroDeContasTeste {

    public static void main(String[] args) {
        CadastroDeContas testeCadastro = new CadastroDeContas();
        ContaCorrente contaDeTeste = new ContaCorrente(100.00);

        testeCadastro.cadastraNovaConta(new ContaCorrente(200.00));

        if(testeCadastro.cadastraNovaConta(contaDeTeste)){
            System.out.println("Conta criada com sucesso");
        }else{
            System.out.println("Erro ao criar a conta");
        }

        System.out.println("Saldo na conta: " + testeCadastro.pesquisaConta(0).getSaldo());
        System.out.println("Saldo total de todas as contas: " + testeCadastro.valorTotalContas());
    }
}
