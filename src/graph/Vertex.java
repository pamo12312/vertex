package graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private final String oznaceni;
    private final List<Vertex> sousedi;

    public Vertex(String oznaceni) {
        this.oznaceni = oznaceni;
        this.sousedi = new ArrayList<>();
    }

    public void pridatSoused(Vertex soused) {
        this.sousedi.add(soused);
    }

    public List<Vertex> getSoused() {
        return sousedi;
    }

    public String getOznaceni() {
        return oznaceni;
    }

    @Override
    public String toString() {
        return oznaceni + " (" + sousedi.size() + ")";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Vertex && ((Vertex) obj).oznaceni.equals(this.oznaceni);
    }

    @Override
    public int hashCode() {
        return oznaceni.hashCode();
    }
}
