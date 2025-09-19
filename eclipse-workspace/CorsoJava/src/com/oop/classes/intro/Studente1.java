package com.oop.classes.intro;

public class Studente1 {
    private String nome;
    private int eta;

    public Studente1(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public int getEta() {
        return eta;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Studente{" + "nome='" + nome + '\'' + ", eta=" + eta + '}';
    }
}

