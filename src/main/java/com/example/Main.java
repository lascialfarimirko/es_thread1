package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cavallo> cavalli = new ArrayList();
        List classifica = new ArrayList<>();

        cavalli.add(new Cavallo("Fulmine", classifica));
        cavalli.add(new Cavallo("Freccia", classifica));
        cavalli.add(new Cavallo("Pollicino", classifica));
        cavalli.add(new Cavallo("Saetta", classifica));
        cavalli.add(new Cavallo("Fuffi", classifica));

        for (Cavallo cavallo : cavalli) {
            cavallo.start();
        }
        
        for (Cavallo cavallo : cavalli) {
            try {
                cavallo.join();
            } catch (InterruptedException e) {
                System.out.println("Errore durante l'attesa dei thread");
            }
        }

        System.out.println("/nCLASSIFICA FINALE");
        
        for (int i = 0; i < classifica.size(); i++) {
            System.out.println((i + 1) + "° Posto: " + classifica.get(i));
        }
    }
}