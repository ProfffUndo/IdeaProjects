package mephi.Lab7.ex10;

import java.util.*;

public class Ex10 {
    public static void main(String[] args) {
        Map<String, Set<Neighbor>> nodes = new HashMap<>();
        nodes.put("a", new HashSet<>());
        nodes.put("b", new HashSet<>());
        nodes.put("c", new HashSet<>());
        nodes.put("d", new HashSet<>());

        nodes.get("a").addAll(Arrays.asList(new Neighbor("b", 1), new Neighbor("c", 2)));

        nodes.get("b").addAll(Arrays.asList(new Neighbor("a", 1), new Neighbor("d", 5)));

        nodes.get("c").addAll(Arrays.asList(new Neighbor("a", 2), new Neighbor("d", 1)));

        nodes.get("d").addAll(Arrays.asList(new Neighbor("b", 5), new Neighbor("c", 1)));

        Map<String, ShortestPath> shortestPaths = dijkstras(nodes, "d");

        shortestPaths.get("a").print();
    }

    public static Map<String, ShortestPath> dijkstras(Map<String, Set<Neighbor>> nodes, String source) {
        PriorityQueue<Node> unvisited = new PriorityQueue<>(Comparator.comparingInt(node -> node.distance));
        Map<String, ShortestPath> visited = new HashMap<>();

        nodes.forEach((name, neighbors) -> {
            Node node;
            if (name.equals(source)) {
                node = new Node(name, neighbors, 0, new ArrayList<>(Collections.singletonList(name)));
            } else {
                node = new Node(name, neighbors, Integer.MAX_VALUE);
            }
            unvisited.add(node);
        });

        Node current = unvisited.poll();
        while (current != null) {
            for (Neighbor neighbor : current.neighbors) {
                Iterator<Node> iter = unvisited.iterator();
                while (iter.hasNext()) {
                    Node node = iter.next();
                    if (node.name.equals(neighbor.name)) {
                        iter.remove();
                        if (current.distance + neighbor.distance < node.distance) {
                            node.distance = current.distance + neighbor.distance;
                            node.path = new ArrayList<>(current.path);
                            node.path.add(neighbor.name);
                        }
                        unvisited.add(node);
                        break;
                    }
                }
            }

            ShortestPath shortestPath = new ShortestPath(
                    source, current.name, current.distance, current.path);
            visited.put(current.name, shortestPath);

            current = unvisited.poll();
        }

        return visited;
    }

    public static class Neighbor {
        private String name;
        private int distance;

        Neighbor(String name, int distance) {
            this.name = name;
            this.distance = distance;
        }

        public String getName() {
            return name;
        }

        public int getDistance() {
            return distance;
        }
    }

    private static class ShortestPath {
        private String source;
        private String destination;
        private int distance;
        private ArrayList<String> path;

        ShortestPath(String source, String destination, int distance, ArrayList<String> path) {
            this.source = source;
            this.destination = destination;
            this.distance = distance;
            this.path = path;
        }

        public void print() {
            String str = String.format("from %s to %s, the distance is %d, and path is %s",
                    source, destination, distance, path.toString());
            System.out.println(str);
        }
    }

    private static class Node {
        private String name;
        private Set<Neighbor> neighbors;
        private int distance;
        private ArrayList<String> path;

        Node(String name, Set<Neighbor> neighbors, int distance) {
            this.name = name;
            this.neighbors = neighbors;
            this.distance = distance;
        }

        Node(String name, Set<Neighbor> neighbors, int distance, ArrayList<String> path) {
            this(name, neighbors, distance);
            this.path = path;
        }
    }
}
