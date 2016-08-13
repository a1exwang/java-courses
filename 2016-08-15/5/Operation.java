import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.Collections;
class Operation {
  private Node root;

  private static final Consumer<Node> defaultPrint = 
    (Node node) -> {
      System.out.println(node.getValue());
    };

  public Operation(Node root) {
    this.root = root;
  }

  public void preOrder() {
    root.visit(
        defaultPrint, 
        nodes -> new Node[] { nodes[1], nodes[0], nodes[2] });
  }

  public void postOrder() {
    root.visit(
        defaultPrint, 
        nodes -> new Node[] { nodes[0], nodes[2], nodes[1] });
  }

  public void inOrder() {
    root.visit(
        defaultPrint, 
        nodes -> nodes
        );
  }

  public void size() {
    final int[] ret = { 0 };
    root.visit(
        node -> ret[0]++, 
        nodes -> nodes
        );
    System.out.println(ret[0]);
  }
  public void printAll(){
    final ArrayList<Node> list = new ArrayList<>();
    root.visit(
        node -> list.add(node), 
        nodes -> nodes
        );
    Collections.sort(list);
    for (Node n : list) {
      System.out.println(n.getValue());
    }
  }
}
