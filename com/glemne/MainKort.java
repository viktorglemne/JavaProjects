package com.glemne;

public class MainKort {
    public static void main(String[] args) {
        KortLek Leken = new KortLek();
        Leken.blanda();
        Kort MittKort = Leken.geKort();
        System.out.println(MittKort.toString());
    }
}
