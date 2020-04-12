/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import biblioteka.Autor;
import biblioteka.Biblioteka;
import biblioteka.Knjiga;
import java.util.LinkedList;

/**
 *
 * @author Nikola @FON
 */
public class Main {

    public static void main(String[] args) {
        Autor autor = new Autor("Joshua", "Bloch");
        LinkedList<Autor> autori = new LinkedList<>();
        autori.add(autor);

        Knjiga knjiga1 = new Knjiga("Effective Java: Programming Language Guide", "00000000015", autori, "Vulkan", 2001);

        LinkedList<Autor> autori2 = new LinkedList<>();
        Autor autor2 = new Autor("Erich", "Gamma");
        Autor autor3 = new Autor("Richard", "Helm");

        Knjiga knjiga2 = new Knjiga("Design Patterns Elements of reusable object-oriented software", "00000000016", autori, "Vulkan", 1998);

        Biblioteka b = new Biblioteka();
        Biblioteka b1 = new Biblioteka();
        b.dodajKnjigu(knjiga1);
        b.dodajKnjigu(knjiga2);
        b.sacuvajUJSONFajl("biblioteka.json");
        b1.ucitajIzFajla("biblioteka.json");
    }
}
