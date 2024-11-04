package graph;

import queue.LIFOQueue;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Graph {
    private final List<Vertex> vrcholy = new LinkedList<>();
    private final String nazev;

    public Graph(String nazev) {
        this.nazev = nazev;
    }

    public void pridatVrchol(Vertex vrchol) {
        this.vrcholy.add(vrchol);
    }

    public List<Vertex> prohledavaniDoHloubky() {
        if (vrcholy.isEmpty()) return List.of();

        LIFOQueue<Vertex> zasobnik = new LIFOQueue<>();
        Set<Vertex> navstivene = new HashSet<>();
        List<Vertex> vysledek = new LinkedList<>();

        Vertex startVrchol = vrcholy.get(0);
        zasobnik.vlozit(startVrchol);

        while (!zasobnik.isEmpty()) {
            Vertex aktualni = zasobnik.odebrat();

            if (!navstivene.contains(aktualni)) {
                navstivene.add(aktualni);
                vysledek.add(aktualni);
                System.out.println("Navštívil jsem " + aktualni);

                List<Vertex> sousedi = aktualni.getSoused();
                for (int i = sousedi.size() - 1; i >= 0; i--) {
                    Vertex soused = sousedi.get(i);
                    if (!navstivene.contains(soused)) {
                        zasobnik.vlozit(soused);
                    }
                }
            }
        }

        return vysledek;
    }
}
