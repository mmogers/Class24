import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class28 {

    public static void main(String[] args) {
        Graph myGraph = createGraph();
        //print all
        System.out.println("The vertices of myGraph are: ");
        for (Vertex vertex : myGraph.getAdjVertices().keySet()) {
            System.out.print(vertex.label + "  ");
        }
        //new Graph - task
        Graph airportsGraph = createGraph2();
        System.out.println();
        System.out.println();
        System.out.println("The airports are: ");
        for (Vertex newVertex : airportsGraph.getAdjVertices().keySet()) {
            System.out.print(newVertex.label + "  ");
        }
        //  Write an algorithm that calculates how many direct flights are in the Graph (in total).
        int counter = 0 ;
        for (Vertex vertex: airportsGraph.getAdjVertices().keySet()){
            for (Vertex flights: airportsGraph.getAdjVertices(vertex.label)){
                counter++;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("The number of direct flights is - " + counter);

        //  Print out all airports which are connected to “Cape Town” airport with direct flight.
        System.out.println();
        System.out.println("The airport to which we can fly from Cape Town are: ");
        for (Vertex vertex: airportsGraph.getAdjVertices("Cape Town")){
            System.out.print(vertex.label + "  ");
        }

        //Write an algorithm that calculates how many direct flights are from Jo’burg airport
        counter = 0;
        for (Vertex vertex: airportsGraph.getAdjVertices("Jo'Burg")){
            counter++;
        }
        System.out.println();
        System.out.println("There are " + counter + " direct flights from Jo'Burg airport ");
    }

    static Graph createGraph() {
        Graph graph = new Graph();
        graph.addVertex("Bob");
        graph.addVertex("Alice");
        graph.addVertex("Mark");
        graph.addVertex("Rob");
        graph.addVertex("Maria");
        graph.addEdge("Bob", "Alice");
        graph.addEdge("Bob", "Rob");
        graph.addEdge("Alice", "Mark");
        graph.addEdge("Rob", "Mark");
        graph.addEdge("Alice", "Maria");
        graph.addEdge("Rob", "Maria");
        return graph;
    }

    static Graph createGraph2() {
        Graph graph = new Graph();
        graph.addVertex("Livingstone");
        graph.addVertex("Victoria Falls");
        graph.addVertex("Harare");
        graph.addVertex("Windhoek");
        graph.addVertex("Mauritius");
        graph.addVertex("Jo'Burg");
        graph.addVertex("Durbs");
        graph.addVertex("East London");
        graph.addVertex("PE");
        graph.addVertex("Cape Town");
        graph.addEdge("Windhoek", "Jo'Burg");
        graph.addEdge("Victoria Falls", "Jo'Burg");
        graph.addEdge("Livingstone", "Jo'Burg");
        graph.addEdge("Harare", "Jo'Burg");
        graph.addEdge("Mauritius", "Jo'Burg");
        graph.addEdge("Durbs", "Jo'Burg");
        graph.addEdge("East London", "Jo'Burg");
        graph.addEdge("PE", "Jo'Burg");
        graph.addEdge("Cape Town", "Jo'Burg");
        graph.addEdge("Durbs", "Cape Town");
        graph.addEdge("Durbs", "PE");
        graph.addEdge("East London", "Cape Town");
        graph.addEdge("PE", "Cape Town");

        return graph;
    }

}
