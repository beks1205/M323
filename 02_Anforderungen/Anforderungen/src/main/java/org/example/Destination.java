package org.example;

class Destination {
    private String name;
    private int dauer;

    public Destination(String name, int dauer) {
        this.name = name;
        this.dauer = dauer;
    }

    public String getName() {
        return name;
    }

    public int getDauer() {
        return dauer;
    }
}
