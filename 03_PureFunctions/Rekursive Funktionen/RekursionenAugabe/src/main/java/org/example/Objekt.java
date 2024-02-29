package org.example;

import java.util.Date;

class Objekt {
    private Date datum;
    private int prioritaet;
    private String titel;

    public Objekt(Date datum, int prioritaet, String titel) {
        this.datum = datum;
        this.prioritaet = prioritaet;
        this.titel = titel;
    }

    public Date getDatum() {
        return datum;
    }

    public int getPrioritaet() {
        return prioritaet;
    }

    public String getTitel() {
        return titel;
    }
}
