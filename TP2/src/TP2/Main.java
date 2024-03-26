package TP2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Directivo dr = new Directivo("Alberto", "Directivo 1");
        Oficial of = new Oficial("Josefina", "Oficial 1");
        Tecnico tc = new Tecnico("Pepe", "Tecnico 1");


        JOptionPane.showMessageDialog(null, dr);
        JOptionPane.showMessageDialog(null, of);
        JOptionPane.showMessageDialog(null, tc);
    }
}