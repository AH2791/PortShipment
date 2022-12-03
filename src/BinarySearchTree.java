
public class BinarySearchTree {
    int size;
    Node root;
    Product Product;

    public BinarySearchTree() {
        Product = new Product();
        this.size = 0;
        this.root = null;
    }

    public Node SearchClient(Product data) {
        return SearchEmailHelper(root, data);
    }

    private Node SearchEmailHelper(Node root, Product data) {
        Node n = new Node(data);
        if (root == null) {
            return null;
        } else if (n.data.receiver.email.compareToIgnoreCase(root.data.receiver.email) < 0) {
            return SearchEmailHelper(root.left, data);
        } else if (n.data.receiver.email.compareToIgnoreCase(root.data.receiver.email) > 0) {
            return SearchEmailHelper(root.right, data);
        } else {
            return null;
        }
    }

    public Node SearchProduct(Product data) {
        return SearchProductHelper(root, data);
    }

    private Node SearchProductHelper(Node root, Product data) {
        Node n = new Node(data);
        if (root == null) {
            return null;
        } else if (n.data.pname.compareToIgnoreCase(root.data.pname) < 0) {
            return SearchProductHelper(root.left, data);
        } else if (n.data.pname.compareToIgnoreCase(root.data.pname) > 0) {
            return SearchProductHelper(root.right, data);
        } else {
            return null;
        }
    }
    public void insert(Product data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, Product data) {

        Node Node1 = new Node(data);
        if (root == null) {
            root = new Node(data);
            return root;
        } else if (Node1.data.pname.compareToIgnoreCase(root.data.pname) < 0) {
            root.left = insertRec(root.left, data);
        } else if (Node1.data.pname.compareToIgnoreCase(root.data.pname) > 0) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }
    public void delete(Product data) {
        Node temp = SearchProduct(data);
        if (temp.data != data) {return;}
        if (temp.right == null) {
            if (temp.parent == null) {
                root = temp.left;
                if (root != null) {
                    root.parent = null;
                }
                temp = null;
                return;
            }
            if (temp.left != null) {
                temp.left.parent = temp.parent;
            }
            if (temp.parent.right == temp) {
                temp.parent.right = temp.left;
                temp = null;
                return;
            } else {
                temp.parent.left = temp.left;
                temp = null;
                return;
            }
        }
    }
}