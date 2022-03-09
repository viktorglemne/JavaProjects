package com.glemne;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class KortLek {

    // Instansvariabel
    private List<Kort> högen = new LinkedList<Kort>();
    private int nr;

    // Konstruktor
    public KortLek() {
        for (int f=0;f<4;f++)
            for (int v=2;v<15;v++)
                högen.add(0,new Kort(f, v));
    }

    // Metoder
    public void blanda() {
        nr = 0;
        Collections.shuffle(högen);
    }

    public Kort geKort(){
        return högen.get(nr++);
    }

}