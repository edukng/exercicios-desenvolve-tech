package com.desenvolve.tech.exercicios.base.herancaepolimorfismo.exercicio1;

public abstract class Funcionario {
   private String numeroDeMatricula;
   private String nome;

   public String getNumeroDeMatricula() {
      return numeroDeMatricula;
   }

   public void setNumeroDeMatricula(String numeroDeMatricula) {
      this.numeroDeMatricula = numeroDeMatricula;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }
}
