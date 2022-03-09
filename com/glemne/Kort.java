package com.glemne;

public class Kort {

    // Instansvariabler
    private static final String[] färglista = {"Klöver", "Ruter", "Hjärter", "Spader"};
    private int färgnr, värdenr;

    // Konstruktor
    public Kort(int färg, int värde) {
        färgnr = färg;
        värdenr = värde;
    }

    // metoder
    // Det enda man behöver är visa-metoder (get)
    // för nåt annat gör man inte med ett kort:
    public int getFärgnr() {
        return färgnr;
    }

    public int getVärdenr() {
        return värdenr;
    }

    public String toString() {
        return färglista[färgnr] + " " + värdenr;
    }

}
