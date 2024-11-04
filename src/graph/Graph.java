package graph;
import queue.LIFOQueue;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Graph {
    private final List<Vertex> vertices = new LinkedList<>();
    private final String name;

    public Graph(String name) {
        this.name = name;
    }

    public void addVertex(Vertex v) {
        this.vertices.add(v);
    }

    public List<Vertex> depthFirstSearch() {
        if (vertices.isEmpty()) return List.of();

        LIFOQueue<Vertex> stack = new LIFOQueue<>();
        Set<Vertex> visited = new HashSet<>();
        List<Vertex> result = new LinkedList<>();

        Vertex startVertex = vertices.get(0); // Začneme u prvního vrcholu
        stack.enqueue(startVertex);

        while (!stack.isEmpty()) {
            Vertex current = stack.dequeue();

            if (!visited.contains(current)) {
                visited.add(current);
                result.add(current);
                System.out.println("Jsem " + current);

                List<Vertex> neighbours = current.getNeighbours();
                for (int i = neighbours.size() - 1; i >= 0; i--) {
                    Vertex neighbour = neighbours.get(i);
                    if (!visited.contains(neighbour)) {
                        stack.enqueue(neighbour);
                    }
                }

            }
        }

        return result;
    }
}
