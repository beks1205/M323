package org.example;

public class Main {
    public static void main(String[] args) {
        AutorennenApp app = new AutorennenApp();

        Auto auto1 = new Auto("Auto1");
        Auto auto2 = new Auto("Auto2");

        app.addAuto(auto1);
        app.addAuto(auto2);

        app.eingabeRundenzeit("Auto1", 30.5);
        app.eingabeRundenzeit("Auto1", 32.2);
        app.eingabeRundenzeit("Auto2", 28.8);
        app.eingabeRundenzeit("Auto2", 29.3);

        app.anzeigenAktuelleZeiten();

        System.out.println("Gesamtzeit für Auto1: " + app.berechneGesamtzeit("Auto1"));
        System.out.println("Gesamtzeit für Auto2: " + app.berechneGesamtzeit("Auto2"));
        System.out.println("Durchschnittszeit für Auto1: " + app.berechneDurchschnittszeit("Auto1"));

        app.speichernLadenRenndetails();

        ReisePlanenApp rp = new ReisePlanenApp();

        Destination rom = new Destination("Rom",2400);
        rp.eingabeDestination(rom);

        System.out.println(rp.berechnenGesamtdauer());
        rp.anzeigenAktuelleRoute();
    }

    public double calculateRabatt(double preis){
        return preis * 95 / 100;
    }
}