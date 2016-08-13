class Test5 {
  public static void main(String[] args) {
    Node root = new Node(
        new Node(
          new Node(3),
          new Node(4),
          2
        ),
        new Node(5),
        1
    );

    Operation op = new Operation(root);
    System.out.println("size");
    op.size();
    System.out.println("printAll");
    op.printAll();
    System.out.println("preOrder");
    op.preOrder();
    System.out.println("inOrder");
    op.inOrder();
    System.out.println("postOrder");
    op.postOrder();
  }
}
