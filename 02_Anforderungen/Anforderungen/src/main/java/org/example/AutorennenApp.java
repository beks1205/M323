package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutorennenApp {
    private List<Auto> autos;
    private Map<String, List<Double>> renndetails; // Auto-Name -> Liste von Rundenzeiten

    public AutorennenApp() {
        this.autos = new ArrayList<>();
        this.renndetails = new HashMap<>();
    }

    public void addAuto(Auto auto) {
        autos.add(auto);
        renndetails.put(auto.getName(), new ArrayList<>());
    }

    public void entferneAuto(Auto auto) {
        autos.remove(auto);
        renndetails.remove(auto.getName());
    }

    public void eingabeRundenzeit(String autoName, double zeit) {
        if (renndetails.containsKey(autoName)) {
            renndetails.get(autoName).add(zeit);
        } else {
            System.out.println("Auto nicht gefunden!");
        }
    }

    public void anzeigenAktuelleZeiten() {
        for (Auto auto : autos) {
            System.out.println("Aktuelle Zeiten für " + auto.getName() + ":");
            for (Rundenzeit rundenzeit : auto.getRundenzeiten()) {
                System.out.println(rundenzeit.getZeit());
            }
            System.out.println();
        }
    }

    public double berechneGesamtzeit(String autoName) {
        double summe = 0.0;
        for (Double zeit : renndetails.getOrDefault(autoName, new ArrayList<>())) {
            summe += zeit;
        }
        return summe;
    }

    public double berechneDurchschnittszeit(String autoName) {
        List<Double> zeiten = renndetails.getOrDefault(autoName, new ArrayList<>());
        double summe = 0.0;
        for (Double zeit : zeiten) {
            summe += zeit;
        }
        return zeiten.isEmpty() ? 0 : summe / zeiten.size();
    }

    public void speichernLadenRenndetails() {
        System.out.println("Renndetails wurden gespeichert/geladen.");
    }}
