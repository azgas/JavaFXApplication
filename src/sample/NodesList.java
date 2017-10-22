package sample;

import java.util.List;
import java.util.Random;

public class NodesList {
    private List<Node> list;
    public List<Node> getlist()
    {
        return this.list;
    }

    // creating list of n nodes (size), with random values (max to nodeMaxVal)
    public NodesList(int size, int nodeMaxVal)
    {
        Random rand = new Random();
        for (int i = 0; i <= size; i++)
        {
            Node temp = new Node(rand.nextInt(nodeMaxVal));
            list.add(temp);
        }
    }
}
