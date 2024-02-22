package org.example;

import java.util.ArrayList;
import java.util.List;

public class ReisePlanenApp {
    private List<Destination> route;

    public ReisePlanenApp() {
        this.route = new ArrayList<>();
    }

    public void eingabeDestination(Destination destination) {
        route.add(destination);
    }

    public void anzeigenAktuelleRoute() {
        System.out.println("Aktuelle Route:");
        for (Destination destination : route) {
            System.out.println(destination.getName() + " - Dauer: " + destination.getDauer() + " Minuten");
        }
    }

    public void aendernDestination(String alteDestination, String neueDestination, int neueDauer) {
        for (Destination destination : route) {
            if (destination.getName().equals(alteDestination)) {
                destination = new Destination(neueDestination, neueDauer);
                break;
            }
        }
    }

    public int berechnenGesamtdauer() {
        int gesamtdauer = 0;
        for (Destination destination : route) {
            gesamtdauer += destination.getDauer();
        }
        return gesamtdauer;
    }

    public void speichernLadenRoute() {
        System.out.println("Route wurde gespeichert/geladen.");
    }}
