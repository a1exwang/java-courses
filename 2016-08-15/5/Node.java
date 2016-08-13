import java.util.function.Function;
import java.util.function.Consumer;
import java.lang.Comparable;
class Node implements Comparable<Node> {
  private Node left;
  private Node right;
  private int value;
  public Node(Node left, Node right, int value) {
    this.value = value;
    this.left = left;
    this.right = right;
  }
  public Node(int value) {
    this(null, null, value);
  }

  public int compareTo(Node other) {
    return this.value - other.value;
  }

  public void visit(Consumer<Node> op, Function<Node[], Node[]> mapper) {
    Node[] prevNodes = { this.left, this, this.right };
    Node[] nodes = mapper.apply(prevNodes);

    for (Node n : nodes) {
      // skipping null nodes
      if (n != null) {
        if (n == this) 
          op.accept(this);
        else 
          n.visit(op, mapper);
      }
    }
  }

  public int getValue() {
    return this.value;
  }
}
