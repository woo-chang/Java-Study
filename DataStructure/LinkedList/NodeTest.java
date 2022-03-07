package DataStructure.LinkedList;

public class NodeTest {

  public static void main(String[] args) {
    Node<Integer> node1 = new Node<>(1);
    Node<Integer> node2 = new Node<>(2);

    node1.next = node2;
    Node head = node1;
  }

}
