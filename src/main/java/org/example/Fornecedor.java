package org.example;

import java.util.Date;

public class Fornecedor extends Pessoa {


    public Fornecedor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
