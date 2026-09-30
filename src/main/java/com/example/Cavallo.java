package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cavallo extends Thread {
    private String nome;
    private List<String> classifica;
    
    Random random = new Random();

    public Cavallo(String nome, List<String> classifica) {
        this.nome = nome;
        this.classifica = classifica;
    }

    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println(nome + " distanza percorsa: " + i + "m");
            try {
                int tempoSleep = random.nextInt(400) + 400;
                Thread.sleep(tempoSleep);
            } catch (InterruptedException e) {
                System.out.println("Il thread è stato interrotto");
            }
        }
        fine();
    }

    public void fine() {
        classifica.add(nome);
        System.out.println(nome + " é arrivato");
    }
}
