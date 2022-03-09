package MethodArea;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        getInputsFromJOptionPane(); //Det är här koden startar. Metoden getInputsFromJOptionPane körs först. Metoden anropar volymmetoderna osv!
    }
    public static double areaCircle(double radius) {
        double area = radius*radius*Math.PI;      // Beräknar arean av en cirkel
        return area;                              // Skickar tillbaka värdet på den uträknade arean
    }
    public static double areaPyramid(double length, double width ) {

        double areaTriangle = length*width;                          // Beräknar arean och sparar värdet i areaTriangle
        return areaTriangle;                                         // Returnerar värdet på arean
    }
    public static double volume(double area, double height) {

        double volume = area * height;                         // Beräknar volymen
        return volume;                                         // Returnerar värdet på volymen
    }
    public static String largestVolume(double volumeCone, double volumePyramid){
        if(volumeCone > volumePyramid){                       // Kollar om konens volym är större än pyramidens
            return "Konen har störst volym!";                 // Returnera i så fall textsträngen
        }
        else if(volumeCone < volumePyramid){                  // Kollar om konens volym är mindre än pyramidens
            return "Pyramiden har störst volym";              // Returnerar i så fall textsträngen
        }

        else{                                                 // Om varken konen är större eller mindre än pyramiden måste volymerna vara lika stora!
            return "Volymerna är lika stora!";                // Returnera i så fall textsträngen
        }

    }
    public static void getInputsFromJOptionPane() {

        double radiusCone = Double.parseDouble(JOptionPane.showInputDialog(null, "Skriv in radien på konen"));
        double heightCone = Double.parseDouble(JOptionPane.showInputDialog(null, "Skriv in höjden på konen"));
        // Sparar undan det värdet som användaren skriver in i ett dialogfönster.
        // Double.parseDouble finns för att värdet som skrivs in ska vara en double

        double lengthPyramid = Double.parseDouble(JOptionPane.showInputDialog(null, "Skriv in längden på pyramidens bas"));
        double widthPyramid = Double.parseDouble(JOptionPane.showInputDialog(null, "Skriv in bredden på pyramidens bas"));
        double heightPyramid = Double.parseDouble(JOptionPane.showInputDialog(null, "Skriv in höjden på pyramiden"));

        double areaOfCone = areaCircle(radiusCone);
        // Använder metoden areaCircle för att beräkna arean. Skickar in värdet på radiusCone.
        // Värdet som kommer ut ur metoden sparas i areaOfCone

        double volumeCone = volume(areaOfCone, heightCone);
        // Använder metoden volume för att beräkna volymen av konen. Skickar in värdet på areaOfCone och heightCone.
        // Värdet som kommer ut ur metoden sparas i volumeCone

        double areaOfPyramid = areaPyramid(lengthPyramid, widthPyramid);
        // Använder metoden areaPyramid för att beräkna arean. Skickar in värdet på lengthPyramid och widthPyramid.
        // Värdet som kommer ut ur metoden sparas i areaOfPyramid

        double volumePyramid = volume(areaOfPyramid, heightPyramid);
        // Använder metoden volume för att beräkna volymen av pyramiden. Skickar in värdet på areaOfPyramid och heightPyramid.
        // Värdet som kommer ut ur metoden sparas i volumePyramid

        String largestVolume = largestVolume(volumeCone, volumePyramid);
        // Kollar vilken volym som är störst med hjälp av metoden largestVolyme. Sparar värdet i Stringen largestVolyme

        JOptionPane.showMessageDialog(null, largestVolume);               // Skriver ut det största värdet i en dialogruta!

    }
}
