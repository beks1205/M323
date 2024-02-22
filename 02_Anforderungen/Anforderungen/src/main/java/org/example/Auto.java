package org.example;

import java.util.ArrayList;
import java.util.List;

public class Auto {
    private String name;
    private List<Rundenzeit> rundenzeiten;

    public Auto(String name) {
        this.name = name;
        this.rundenzeiten = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addRundenzeit(Rundenzeit rundenzeit) {
        rundenzeiten.add(rundenzeit);
    }

    public List<Rundenzeit> getRundenzeiten() {
        return rundenzeiten;
    }
}
