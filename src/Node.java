public class Node {
    Node parent;
    Node left;
    Node right;
    int height;
    Node next;
    Product data;

    public Node() {
        this.parent = null;
        this.left = null;
        this.right = null;
        this.height = 0;
    }

    public Node(Product data) {
        this.data = data;
    }

    public void display() {
        if (next == null) {
            System.out.println(data);
            return;
        }
        System.out.print(data + "--> ");
    }

    public static Node clone(Node a) {
        return a;
    }
}
