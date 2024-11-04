import graph.Graph;
import graph.Vertex;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Graph graf = vytvoritGraf("Graf A");
        List<Vertex> prohledavani = graf.prohledavaniDoHloubky();
        System.out.println("Navštívené vrcholy při DFS v tomto pořadí:");

        for (Vertex vrchol : prohledavani) {
            System.out.print(vrchol.getOznaceni() + " ");
        }
        System.out.println();
    }

    public static Graph vytvoritGraf(String nazev) {
        Graph graf = new Graph(nazev);

        Vertex vrcholA = new Vertex("A");
        Vertex vrcholB = new Vertex("B");
        Vertex vrcholC = new Vertex("C");
        Vertex vrcholD = new Vertex("D");
        Vertex vrcholE = new Vertex("E");

        graf.pridatVrchol(vrcholA);
        graf.pridatVrchol(vrcholB);
        graf.pridatVrchol(vrcholC);
        graf.pridatVrchol(vrcholD);
        graf.pridatVrchol(vrcholE);

        vrcholA.pridatSoused(vrcholB);
        vrcholB.pridatSoused(vrcholA);

        vrcholA.pridatSoused(vrcholC);
        vrcholC.pridatSoused(vrcholA);

        vrcholC.pridatSoused(vrcholB);
        vrcholB.pridatSoused(vrcholC);

        vrcholC.pridatSoused(vrcholD);
        vrcholD.pridatSoused(vrcholC);

        return graf;
    }
}
